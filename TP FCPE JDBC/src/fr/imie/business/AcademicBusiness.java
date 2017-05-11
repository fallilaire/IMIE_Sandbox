/**
 * 
 */
package fr.imie.business;

import java.util.List;

import fr.imie.model.EtablissementDTO;
import fr.imie.persistence.IUtilisateurDAO;

/**
 * @author imiedev
 *
 */
public class AcademicBusiness implements IAcademicBusiness {

	private IUtilisateurDAO etablissementDAO;

	public AcademicBusiness(IUtilisateurDAO etablissementDAO) {
		this.etablissementDAO = etablissementDAO;
	}
	
	/* (non-Javadoc)
	 * @see fr.imie.business.IBusiness#listAllEtablissement()
	 */
	@Override
	public List<EtablissementDTO> listAllEtablissement() {
		return etablissementDAO.listAllEtablissement();
	}

	@Override
	public void createEtablissement(EtablissementDTO etablissement) {
		etablissementDAO.createEtablissement(etablissement);
		
	}

	@Override
	public void deleteEtablissement(EtablissementDTO etablissement) {
		etablissementDAO.deleteEtablissement(etablissement);
		
	}

	@Override
	public void updateEtablissement(EtablissementDTO etablissement) {
		etablissementDAO.updateEtablissement(etablissement);
		
	}

	@Override
	public EtablissementDTO getEtablissementAvecNom(String nom) {
		return etablissementDAO.getEtablissementAvecNom(nom);
	}

}
