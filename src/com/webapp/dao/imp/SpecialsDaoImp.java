package com.webapp.dao.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.webapp.dao.SpecialsDao;
import com.webapp.entity.Special;

@Stateless
public class SpecialsDaoImp implements SpecialsDao {

	@PersistenceContext(unitName = "ironbullrestaurant")
	private EntityManager em;

	@Override
	public List<Special> getSpeacials() {
		TypedQuery<Special> query = em.createNamedQuery("Special.findAll", Special.class);
		List<Special> specials = query.getResultList();
		return specials;
	}

}
