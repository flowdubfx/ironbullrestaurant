package com.webapp.dao.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.webapp.dao.FoodDao;
import com.webapp.entity.Food;

@Stateless
public class FoodDaoImp implements FoodDao {

	@PersistenceContext(unitName = "ironbullrestaurant")
	private EntityManager em;

	@Override
	public List<Food> getAllFood() {
		TypedQuery<Food> query = em.createNamedQuery("Food.findAll", Food.class);
		List<Food> food = query.getResultList();
		return food;
	}

	@Override
	public Food getFoodById(int id) {
		Query query = em.createNamedQuery("Food.findById");
		query.setParameter("id", id);
		Food food = (Food) query.getSingleResult();
		return food;
	}

}
