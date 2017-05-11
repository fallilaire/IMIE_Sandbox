/**
 * 
 */
package fr.imie.tpUtilisateur.business;

import java.util.List;

import fr.imie.tpUtilisateur.model.UtilisateurDTO;
import fr.imie.tpUtilisateur.persistence.IUtilisateurDAO;

/**
 * @author imiedev
 *
 */
public class UtilisateurBusiness implements IUtilisateurBusiness {

	private IUtilisateurDAO utilisateurDAO;

	public UtilisateurBusiness(IUtilisateurDAO etablissementDAO) {
		this.utilisateurDAO = etablissementDAO;
	}
	
	@Override
	public List<UtilisateurDTO> listAllUtilisateur() {
		return utilisateurDAO.listAllUtilisateur();
	}

	@Override
	public void createUtilisateur(UtilisateurDTO etablissement) {
		utilisateurDAO.createUtilisateur(etablissement);
		
	}

	@Override
	public void deleteUtilisateur(UtilisateurDTO etablissement) {
		utilisateurDAO.deleteUtilisateur(etablissement);
		
	}

	@Override
	public void updateUtilisateur(UtilisateurDTO etablissement) {
		utilisateurDAO.updateUtilisateur(etablissement);
		
	}

	@Override
	public UtilisateurDTO getUtilisateurAvecNom(String nom) {
		return utilisateurDAO.getUtilisateurAvecNom(nom);
	}

}
