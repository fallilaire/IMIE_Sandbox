package fr.imie.cours;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.test.UserBean;

/**
 * Servlet implementation class ServletPersonne
 */
@WebServlet("/servletpersonne")
public class ServletPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean ub = new UserBean();
		ub.setNom("Marley");
		ub.setPrenom("Bob");
		request.setAttribute("monBean", ub);
		
		List<String> loisirs = new ArrayList<String>();
		loisirs.add("guitare");
		loisirs.add("natation");
		loisirs.add("lecture");
		loisirs.add("sculpture");
		request.setAttribute("loisirs", loisirs);
		
		request.getRequestDispatcher("tpjsp2/exo1_4/index.jsp").forward(request, response);

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
