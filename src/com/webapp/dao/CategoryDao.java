package com.webapp.dao;

import java.util.List;

import javax.ejb.Local;

import com.webapp.entity.Category;

@Local
public interface CategoryDao {

	public List<Category> getCategories();

	public void addCategory(Category category);
	
	public void deleteCategory(Category category);
}
