package com.webapp.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.webapp.dao.CareerDao;
import com.webapp.entity.Career;

@Stateless
public class CareerService {

	@EJB
	private CareerDao careerDao;

	public List<Career> getCareers() {
		return careerDao.getCareers();
	}

	public Career getCareer(int id) {
		return careerDao.getCareer(id);
	}

	public void addCareer(Career career) {
		careerDao.addCareer(career);
	}

}
