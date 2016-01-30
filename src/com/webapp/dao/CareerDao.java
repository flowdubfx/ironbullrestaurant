package com.webapp.dao;

import java.util.List;

import javax.ejb.Local;

import com.webapp.entity.Career;

@Local
public interface CareerDao {

	List<Career> getCareers();

	Career getCareer(int id);

	void addCareer(Career career);

}
