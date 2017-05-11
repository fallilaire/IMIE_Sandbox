/**
 * 
 */
package fr.imie.tpUtilisateur.persistence;

import java.util.List;

import fr.imie.tpUtilisateur.model.UtilisateurDTO;

/**
 * @author imiedev
 *
 */
public interface IUtilisateurDAO {
	public abstract List<UtilisateurDTO> listAllUtilisateur();

	public abstract void createUtilisateur(UtilisateurDTO etablissement);

	public abstract void deleteUtilisateur(UtilisateurDTO etablissement);

	public abstract void updateUtilisateur(UtilisateurDTO etablissement);

	public abstract UtilisateurDTO getUtilisateurAvecNom(String nom);

}
