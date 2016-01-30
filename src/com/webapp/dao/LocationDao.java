package com.webapp.dao;

import java.util.List;

import javax.ejb.Local;

import com.webapp.entity.Location;

@Local
public interface LocationDao {

	List<Location> getLocations();
}
