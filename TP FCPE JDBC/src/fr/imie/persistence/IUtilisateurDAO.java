/**
 * 
 */
package fr.imie.persistence;

import java.util.List;

import fr.imie.model.EtablissementDTO;

/**
 * @author imiedev
 *
 */
public interface IUtilisateurDAO {
	public abstract List<EtablissementDTO> listAllEtablissement();
	public abstract void createEtablissement(EtablissementDTO etablissement);
	public abstract void deleteEtablissement(EtablissementDTO etablissement);
	public abstract void updateEtablissement(EtablissementDTO etablissement);
	public abstract EtablissementDTO getEtablissementAvecNom(String nom);

}
