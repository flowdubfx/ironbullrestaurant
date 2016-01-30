package com.webapp.dao.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.webapp.dao.LocationDao;
import com.webapp.entity.Location;

@Stateless
public class LocationDaoImp implements LocationDao {

	@PersistenceContext(unitName = "ironbullrestaurant")
	private EntityManager em;

	@Override
	public List<Location> getLocations() {
		TypedQuery<Location> query = em.createNamedQuery("Location.findAll", Location.class);
		List<Location> Locations = query.getResultList();
		return Locations;
	}

}
