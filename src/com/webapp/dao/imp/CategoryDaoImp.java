package com.webapp.dao.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.webapp.dao.CategoryDao;
import com.webapp.entity.Category;

@Stateless
public class CategoryDaoImp implements CategoryDao {

	@PersistenceContext(unitName = "ironbullrestaurant")
	private EntityManager em;

	@Override
	public List<Category> getCategories() {

		TypedQuery<Category> query = em.createNamedQuery("Category.findAll", Category.class);

		List<Category> categories = query.getResultList();

		return categories;
	}

	@Override
	public void addCategory(Category category) {
		em.persist(category);
	}

	@Override
	public void deleteCategory(Category category) {
		em.remove(category);
	}

}
