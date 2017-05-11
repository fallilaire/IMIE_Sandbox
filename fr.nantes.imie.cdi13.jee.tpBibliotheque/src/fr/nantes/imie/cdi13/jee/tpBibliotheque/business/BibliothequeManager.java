/**
 * 
 */
package fr.nantes.imie.cdi13.jee.tpBibliotheque.business;

import java.util.List;

import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.AuteurDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.LivreDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.IDAO;

/**
 * @author imiedev
 *
 */
public class BibliothequeManager implements IBibliothequeManager {

	private IDAO<LivreDTO> livreDAO;
	private IDAO<AuteurDTO> auteurDAO;

	public BibliothequeManager(IDAO<LivreDTO> livreDAO, IDAO<AuteurDTO> auteurDAO) {
		this.livreDAO = livreDAO;
		this.auteurDAO = auteurDAO;
	}
	
	@Override
	public List<LivreDTO> listAllLivres() {
		return livreDAO.findAll();
	}

	@Override
	public void createLivre(LivreDTO livre) {
		livreDAO.create(livre);
	}

	@Override
	public void deleteLivre(LivreDTO livre) {
		livreDAO.delete(livre);
		
	}

	@Override
	public void updateLivre(LivreDTO livre) {
		livreDAO.update(livre);
		
	}

	@Override
	public LivreDTO getLivreById(Integer id) {
		return livreDAO.findOneById(id);
	}

	@Override
	public List<AuteurDTO> listAllAuteurs() {
		return auteurDAO.findAll();
	}

}
