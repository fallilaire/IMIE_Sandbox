package fr.imie.cours.tpServlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/tpservlet2tp3")
public class TPServlet2TP3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<form>");
		out.println("<input type=\"radio\" name=\"test\" value=\"forward\">Test Forward</input>");
		out.println("<input type=\"radio\" name=\"test\" value=\"include\" checked>Test Include</input>");
		out.println("<input type=\"submit\" value=\"Submit\">");
		out.println("</form>");
		out.println("</body></html>");

		String test = request.getParameter("test");
		if (test != null) {
			if (test.equals("forward")) {
				forward(request, response);
			} else if (test.equals("include")) {
				include(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private void include(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Avant Include");
		request.getRequestDispatcher("sousservlet").include(request, response);
		response.getWriter().append("Après Include");
	}

	private void forward(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.getWriter().append("Avant Forward");
		request.getRequestDispatcher("sousservlet").forward(request, response);
		response.getWriter().append("Après Forward");
	}

}
