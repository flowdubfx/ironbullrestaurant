package com.webapp.webservice.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webapp.entity.Food;
import com.webapp.service.FoodService;

@Path("food")
@Produces(MediaType.APPLICATION_JSON)
public class FoodWebService {

	@EJB
	private FoodService foodService;

	@GET
	public List<Food> getFood() {
		List<Food> food = foodService.getFood();
		return food;
	}

	@GET
	@Path("/{id}")
	public Food getFoodById(@PathParam("id") int id) {
		return foodService.getFoodById(id);
	}

}
