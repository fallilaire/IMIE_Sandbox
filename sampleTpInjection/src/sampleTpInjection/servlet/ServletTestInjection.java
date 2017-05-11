package sampleTpInjection.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sampleTpInjection.AutoService;

/**
 * Servlet implementation class ServletTestInjection
 */
@WebServlet("/test")
public class ServletTestInjection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	@Named("BoumboAutoService")
	private AutoService boumboAutoService;
	
	@Inject
	@Named("OpelAutoService")
	private AutoService opelAutoService;
	
	@Inject
	@Named("FerrariAutoService")
	private AutoService ferrariAutoService;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		callAutoService();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	private void callAutoService() {
		boumboAutoService.getService();
		ferrariAutoService.getService();
		opelAutoService.getService();
	}

}