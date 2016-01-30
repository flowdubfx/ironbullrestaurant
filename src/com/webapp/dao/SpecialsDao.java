package com.webapp.dao;

import java.util.List;

import javax.ejb.Local;

import com.webapp.entity.Special;

@Local
public interface SpecialsDao {

	List<Special> getSpeacials();
}
