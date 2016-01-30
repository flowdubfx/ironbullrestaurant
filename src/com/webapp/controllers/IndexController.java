package com.webapp.controllers;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.entity.Career;
import com.webapp.entity.Category;
import com.webapp.entity.Location;
import com.webapp.entity.Special;
import com.webapp.service.CareerService;
import com.webapp.service.CategoryService;
import com.webapp.service.LocationService;
import com.webapp.service.SpecialsService;

public class IndexController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	private CategoryService categoryService;

	@EJB
	private CareerService careerService;

	@EJB
	private SpecialsService specialService;

	@EJB
	private LocationService locationService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Category> categories = categoryService.getCategories();
		List<Career> careers = careerService.getCareers();
		List<Location> locations = locationService.getLocations();
		List<Special> specials = specialService.getSpeacials();

		request.setAttribute("categories", categories);
		request.setAttribute("careers", careers);
		request.setAttribute("specials", specials);
		request.setAttribute("locations", locations);

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/index.jsp");
		view.forward(request, response);

	}

}
