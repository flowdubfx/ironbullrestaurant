package com.webapp.webservice.rest;

import java.net.URI;
import java.util.List;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import com.webapp.entity.Category;
import com.webapp.service.CategoryService;

@Path("categories")
@Transactional
public class CategoryWebService {
	@PersistenceContext(unitName = "ironbullrestaurant")
	private EntityManager em;

	@EJB
	private CategoryService categoryService;

	@Context
	public UriInfo uriInfo;

	public CategoryWebService() {
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Category> getCategories() {
		List<Category> categories = categoryService.getCategories();
		return categories;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addCategory(Category category) {

		categoryService.addCategory(category);

		UriBuilder uriBulder = uriInfo.getAbsolutePathBuilder();

		URI uri = uriBulder.path(String.valueOf(category.getId())).build();

		return Response.created(uri).build();
	}

	@DELETE
	@Path("/{id}")
	public Response deleteCategory(@PathParam("id") int id) {

		Category category = em.find(Category.class, id);

		if (category == null) {
			throw new NotFoundException("Category was not found with that id");
		}

		categoryService.removeCategory(category);
		return Response.noContent().build();
	}

}
