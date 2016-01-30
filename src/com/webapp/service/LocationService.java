package com.webapp.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.webapp.dao.LocationDao;
import com.webapp.entity.Location;

@Stateless
public class LocationService {

	@EJB
	private LocationDao locationDao;

	public List<Location> getLocations() {
		return locationDao.getLocations();
	}

}
