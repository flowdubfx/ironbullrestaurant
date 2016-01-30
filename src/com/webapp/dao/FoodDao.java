package com.webapp.dao;

import java.util.List;

import javax.ejb.Local;

import com.webapp.entity.Food;

@Local
public interface FoodDao {

	List<Food> getAllFood();

	Food getFoodById(int id);
}
