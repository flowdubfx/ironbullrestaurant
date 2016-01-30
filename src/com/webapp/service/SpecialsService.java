package com.webapp.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.webapp.dao.SpecialsDao;
import com.webapp.entity.Special;

@Stateless
public class SpecialsService {

	@EJB
	private SpecialsDao specialsDao;

	public List<Special> getSpeacials() {
		return specialsDao.getSpeacials();
	}
}
