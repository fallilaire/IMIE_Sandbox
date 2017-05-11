package fr.nantes.imie.cdi13.bibliotheque.internal;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import fr.nantes.imie.cdi13.bibliotheque.api.IBibliothecaire;
import fr.nantes.imie.cdi13.bibliotheque.api.IBibliotheque;

/**
 * Description of Bibliothecaire.
 * 
 * @author freddy.cdi13
 */
public class Bibliothecaire extends Personne implements IBibliothecaire {
	/**
	 * Description of the property bibliotheque.
	 */
	public IBibliotheque bibliotheque = null;

	/**
	 * The constructor.
	 */
	public Bibliothecaire(String prenom, String nom) {
		super(prenom, nom);
	}

	/**
	 * Description of the method rechercher.
	 * @param livre 
	 */
	public void rechercher(Livre livre) {

	}

	/**
	 * Description of the method creerFicheDePret.
	 * @param adherent 
	 * @param livre 
	 */
	public void creerFicheDePret(Adherent adherent, Livre livre) {

	}

	/**
	 * Description of the method peutEmprunterUnLivre.
	 * @param adherent 
	 */
	public void peutEmprunterUnLivre(Adherent adherent) {

	}

	/**
	 * Returns bibliotheque.
	 * @return bibliotheque 
	 */
	public IBibliotheque getBibliotheque() {
		return this.bibliotheque;
	}

	/**
	 * Sets a value to attribute bibliotheque. 
	 * @param newBibliotheque 
	 */
	public void setBibliotheque(IBibliotheque newBibliotheque) {
		this.bibliotheque = newBibliotheque;
	}

}
