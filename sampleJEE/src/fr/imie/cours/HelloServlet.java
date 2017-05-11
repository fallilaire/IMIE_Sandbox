package fr.imie.cours;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().append("Protocole : ").append(request.getProtocol()).append("<br />");
		response.getWriter().append("IP : ").append(request.getRemoteAddr()).append("<br />");
		response.getWriter().append("Host : ").append(request.getRemoteHost()).append("<br />");
		response.getWriter().append("Nom serveur hôte : ").append(request.getLocalName()).append("<br />");
		response.getWriter().append("Port serveur hôte : ").append(String.valueOf(request.getLocalPort()).toString())
				.append("<br />");

		Enumeration<String> enumParamNames = request.getParameterNames();
		while (enumParamNames.hasMoreElements()) {
			String paramName = enumParamNames.nextElement();
			response.getWriter().append(paramName).append(" - ").append(request.getParameter(paramName))
					.append("<br />");
		}

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
