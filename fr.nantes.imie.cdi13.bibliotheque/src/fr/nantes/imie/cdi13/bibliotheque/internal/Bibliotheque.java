package fr.nantes.imie.cdi13.bibliotheque.internal;
import java.util.HashSet;

import fr.nantes.imie.cdi13.bibliotheque.api.IAdherent;
import fr.nantes.imie.cdi13.bibliotheque.api.IBibliotheque;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

/**
 * Description of Bibliotheque.
 * 
 * @author freddy.cdi13
 */
public class Bibliotheque implements IBibliotheque {
	/**
	 * Description of the property catalogue.
	 */
	public Catalogue catalogue = null;

	/**
	 * Description of the property adherents.
	 */
	public HashSet<IAdherent> adherents = new HashSet<IAdherent>();

	/**
	 * Description of the property emplacements.
	 */
	public HashSet<Emplacement> emplacements = new HashSet<Emplacement>();

	/**
	 * The constructor.
	 */
	public Bibliotheque() {

	}

	/**
	 * Description of the method listeDesEmpruntsEnCours.
	 */
	public void listeDesEmpruntsEnCours() {

	}

	/**
	 * Returns catalogue.
	 * @return catalogue 
	 */
	public Catalogue getCatalogue() {
		return this.catalogue;
	}

	/**
	 * Sets a value to attribute catalogue. 
	 * @param newCatalogue 
	 */
	public void setCatalogue(Catalogue newCatalogue) {
//		if (this.catalogue != null) {
//			this.catalogue.set(null);
//		}
//		this.catalogue.set(this);
	}

	/**
	 * Returns adherents.
	 * @return adherents 
	 */
	public HashSet<IAdherent> getAdherents() {
		return this.adherents;
	}

	/**
	 * Returns emplacements.
	 * @return emplacements 
	 */
	public HashSet<Emplacement> getEmplacements() {
		return this.emplacements;
	}

}
