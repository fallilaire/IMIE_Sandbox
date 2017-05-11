/**
 * 
 */
package fr.imie.tpUtilisateur.business;

import java.util.List;

import fr.imie.tpUtilisateur.model.UtilisateurDTO;

/**
 * @author imiedev
 *
 */
public interface IUtilisateurBusiness {
	
	public abstract List<UtilisateurDTO> listAllUtilisateur();

	public abstract void createUtilisateur(UtilisateurDTO etablissement);

	public abstract void deleteUtilisateur(UtilisateurDTO etablissement);

	public abstract void updateUtilisateur(UtilisateurDTO etablissement);

	public abstract UtilisateurDTO getUtilisateurAvecNom(String nom);

}
