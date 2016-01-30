package com.webapp.dao.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.webapp.dao.CareerDao;
import com.webapp.entity.Career;

@Stateless
public class CareerDaoImp implements CareerDao {

	@PersistenceContext(unitName = "ironbullrestaurant")
	private EntityManager em;

	@Override
	public List<Career> getCareers() {
		TypedQuery<Career> query = em.createNamedQuery("Career.findAll", Career.class);
		List<Career> careers = query.getResultList();
		return careers;
	}

	@Override
	public Career getCareer(int id) {
		Query query = em.createNamedQuery("Career.findById");
		query.setParameter("id", id);
		Career career = (Career) query.getSingleResult();
		return career;
	}

	@Override
	public void addCareer(Career career) {
		em.persist(career);
	}

}
