package com.webapp.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.webapp.dao.FoodDao;
import com.webapp.entity.Food;

@Stateless
public class FoodService {

	@EJB
	private FoodDao foodDao;

	public List<Food> getFood() {
		return foodDao.getAllFood();
	}

	public Food getFoodById(int id) {
		return foodDao.getFoodById(id);
	}

}
