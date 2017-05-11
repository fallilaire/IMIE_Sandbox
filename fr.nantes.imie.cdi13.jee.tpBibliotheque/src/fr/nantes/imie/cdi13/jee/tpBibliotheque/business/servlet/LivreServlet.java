package fr.nantes.imie.cdi13.jee.tpBibliotheque.business.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.nantes.imie.cdi13.jee.tpBibliotheque.business.IBibliothequeManager;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.jpa.Auteur;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.jpa.Livre;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.LivreDTO;
import servicesCRUD.LivreService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/livre/*")
public class LivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String VIEW_LISTING = "/listing.jsp";
	private static final String VIEW_FICHE = "/fiche.jsp";
	private static final String VIEW_EDIT = "/edit_fiche.jsp";
	private static final String VIEW_CREATE = "/create_fiche.jsp";

	@EJB
	private LivreService ls;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirection = VIEW_LISTING;

		String path = request.getPathInfo();

		// IBibliothequeManager utilisateurBusiness = new
		// BibliothequeManager(AbstractFactory.getInstance().getLivreDAO(),AbstractFactory.getInstance().getAuteurDAO());

		if (path != null) {
			if (path.matches("/delete.*")) {
				// delete(data(request), utilisateurBusiness);

				ls.delete(Integer.valueOf(request.getParameter("id")));

			}
			else if (path.matches("/update.*")) {
				// LivreDTO livre = new LivreDTO();
				Livre livre = new Livre();
				livre.setBibliotheque(ls.getBibliotheque());
				livre.setTitre(request.getParameter("titre"));
				livre.setAuteur(ls.findAuteurById(Integer.valueOf(request.getParameter("id_auteur"))));

				ls.save(livre);

				// livre.setAuteur(new
				// AuteurDTO().initDTO(Integer.parseInt(request.getParameter("id_auteur")),
				// "", ""));

				// save(livre, utilisateurBusiness);
			}
			else if (path.matches("/select.*")) {
				// LivreDTO livre = select(data(request), utilisateurBusiness);

				Livre livre = ls.findOneById(Integer.valueOf(request.getParameter("id")));
				request.setAttribute("livre", livre);
				redirection = VIEW_FICHE;
			}
			else if (path.matches("/edit.*")) {
				// LivreDTO livre = select(data(request), utilisateurBusiness);
				// request.setAttribute("livre", livre);
				// redirection = VIEW_EDIT;
			}
			else if (path.matches("/create")) {
				// List<AuteurDTO> auteurs =
				// utilisateurBusiness.listAllAuteurs();

				List<Auteur> auteurs = ls.findAllAuteurs();
				request.setAttribute("auteurs", auteurs);
				redirection = VIEW_CREATE;

			}
		}

		// List<LivreDTO> users = utilisateurBusiness.listAllLivres();

		// List<Auteur> auteurs = ls.findAllAuteurs();
		// for (Auteur auteur : auteurs) {
		// System.out.println("Auteur : " + auteur.getNom());
		// }
		//
		List<Livre> users = ls.findAll();

		request.setAttribute("livres", users);
		request.getRequestDispatcher(redirection).forward(request, response);

	}

	private void delete(LivreDTO data, IBibliothequeManager manager) {
		manager.deleteLivre(data);
	}

	private void save(LivreDTO data, IBibliothequeManager manager) {
		if (data.getId() == null) {
			manager.createLivre(data);
		} else {
			manager.updateLivre(data);
		}
	}

	private LivreDTO select(LivreDTO data, IBibliothequeManager manager) {
		LivreDTO livre = manager.getLivreById(data.getId());
		return livre;
	}

	private LivreDTO data(HttpServletRequest request) {
		LivreDTO livre = new LivreDTO();
		livre.setTitre(request.getParameter("titre"));
		if (request.getParameter("id") != null && request.getParameter("id").isEmpty() == false) {
			livre.setId(Integer.parseInt(request.getParameter("id")));
		}
		else {
			// TODO Generate error
		}
		return livre;
	}

}
