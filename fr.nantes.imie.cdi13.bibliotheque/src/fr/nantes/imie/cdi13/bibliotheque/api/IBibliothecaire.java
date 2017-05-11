package fr.nantes.imie.cdi13.bibliotheque.api;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import fr.nantes.imie.cdi13.bibliotheque.internal.Adherent;
import fr.nantes.imie.cdi13.bibliotheque.internal.Livre;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of IBibliothecaire.
 * 
 * @author freddy.cdi13
 */
public interface IBibliothecaire {
	// Start of user code (user defined attributes for IBibliothecaire)

	// End of user code

	/**
	 * Description of the method rechercher.
	 * @param livre 
	 */
	public void rechercher(Livre livre);

	/**
	 * Description of the method creerFicheDePret.
	 * @param adherent 
	 * @param livre 
	 */
	public void creerFicheDePret(Adherent adherent, Livre livre);

	/**
	 * Description of the method peutEmprunterUnLivre.
	 * @param adherent 
	 */
	public void peutEmprunterUnLivre(Adherent adherent);

	// Start of user code (user defined methods for IBibliothecaire)

	// End of user code

}
