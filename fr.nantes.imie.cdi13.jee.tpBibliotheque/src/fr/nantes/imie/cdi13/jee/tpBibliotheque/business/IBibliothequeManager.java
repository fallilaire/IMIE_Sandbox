/**
 * 
 */
package fr.nantes.imie.cdi13.jee.tpBibliotheque.business;

import java.util.List;

import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.AuteurDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.LivreDTO;

/**
 * @author imiedev
 *
 */
public interface IBibliothequeManager {
	
	public abstract List<LivreDTO> listAllLivres();

	public abstract void createLivre(LivreDTO utilisateur);

	public abstract void deleteLivre(LivreDTO utilisateur);

	public abstract void updateLivre(LivreDTO utilisateur);

	public abstract LivreDTO getLivreById(Integer id);

	public abstract List<AuteurDTO> listAllAuteurs();

}
