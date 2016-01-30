package com.webapp.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.webapp.dao.CategoryDao;
import com.webapp.entity.Category;

@Stateless
public class CategoryService {

	@EJB
	private CategoryDao categoryDao;

	public List<Category> getCategories() {
		return categoryDao.getCategories();
	}

	public void addCategory(Category category) {
		categoryDao.addCategory(category);
	}

	public void removeCategory(Category category) {
		categoryDao.deleteCategory(category);
	}

}
