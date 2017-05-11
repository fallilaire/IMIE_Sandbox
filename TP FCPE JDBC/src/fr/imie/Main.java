package fr.imie;

import fr.imie.business.AcademicBusiness;
import fr.imie.business.IAcademicBusiness;
import fr.imie.persistence.EtablissementDAO;
import fr.imie.persistence.IUtilisateurDAO;
import fr.imie.presentation.Presentation;

/**
 * @author imiedev
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IUtilisateurDAO etablissementDAO = new EtablissementDAO();
		IAcademicBusiness academicBusiness = new AcademicBusiness(etablissementDAO);
		Presentation maPresentation = new Presentation(academicBusiness);
		maPresentation.execute();
	}

}
