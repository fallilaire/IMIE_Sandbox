package fr.imie.tpUtilisateur.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.tpUtilisateur.business.IUtilisateurBusiness;
import fr.imie.tpUtilisateur.business.UtilisateurBusiness;
import fr.imie.tpUtilisateur.model.UtilisateurDTO;
import fr.imie.tpUtilisateur.persistence.IUtilisateurDAO;
import fr.imie.tpUtilisateur.persistence.UtilisateurDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login");
		String password = request.getParameter("password");

		if (login != null && password != null) {

			IUtilisateurDAO utilisateurDAO = new UtilisateurDAO();
			IUtilisateurBusiness utilisateurBusiness = new UtilisateurBusiness(utilisateurDAO);

			UtilisateurDTO user = utilisateurBusiness.getUtilisateurAvecNom(login);
			if (user != null) {
				if (user.getPassword().equals(password)) {
					request.setAttribute("login", true);
					request.setAttribute("name", user.getEmail());
					request.getRequestDispatcher("tpjsp2/exo5/index.jsp").forward(request, response);
				} else {
					response.getWriter().append("Password erroné");
					request.setAttribute("login", false);
					request.getRequestDispatcher("tpjsp2/exo5/login.jsp").forward(request, response);
				}
			} else {
				response.getWriter().append("Utilisateur non existant");
			}
		} else {
			response.getWriter().append("Login & password non renseignés");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
