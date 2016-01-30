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

import com.webapp.entity.Career;
import com.webapp.service.CareerService;

@Path("careers")
@Transactional
public class CareerWebService {

	@PersistenceContext(unitName = "ironbullrestaurant")
	private EntityManager em;

	@EJB
	private CareerService careerService;

	@Context
	public UriInfo uriInfo;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Career> getCareers() {
		List<Career> careers = careerService.getCareers();
		return careers;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Career getCareerById(@PathParam("id") int id) {
		Career career = careerService.getCareer(id);
		return career;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addCategory(Career career) {

		careerService.addCareer(career);

		UriBuilder uriBulder = uriInfo.getAbsolutePathBuilder();

		URI uri = uriBulder.path(String.valueOf(career.getId())).build();

		return Response.created(uri).build();
	}

	@DELETE
	@Path("/{id}")
	public Response deleteCareer(@PathParam("id") int id) {

		Career category = em.find(Career.class, id);

		if (category == null) {
			throw new NotFoundException("Career was not found with that id");
		}

		em.remove(category);
		return Response.noContent().build();
	}

}
