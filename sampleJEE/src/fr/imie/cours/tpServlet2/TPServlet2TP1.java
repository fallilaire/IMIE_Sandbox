package fr.imie.cours.tpServlet2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/tpservlet2tp1")
public class TPServlet2TP1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession maSession = request.getSession();

		if (maSession.isNew()) {
			response.getWriter().append("La session est nouvelle \n");
		}
		response.getWriter().append(maSession.getCreationTime() + "\n");
		response.getWriter().append(maSession.getLastAccessedTime() + "\n");
		response.getWriter().append(maSession.getId() + "\n");

		Integer visite = (Integer) maSession.getAttribute("visite");
		if (visite == null) {
			visite = 0;
		}
		visite++;

		response.getWriter().append("HitCount: " + visite + "\n");

		maSession.setAttribute("visite", visite);

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
