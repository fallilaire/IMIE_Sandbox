package fr.nantes.imie.cdi13.bibliotheque.internal;
import java.util.HashSet;

import fr.nantes.imie.cdi13.bibliotheque.api.ILivre;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

/**
 * Description of Emplacement.
 * 
 * @author freddy.cdi13
 */
public class Emplacement {
	/**
	 * Description of the property salle.
	 */
	public String salle = "";

	/**
	 * Description of the property livres.
	 */
	public HashSet<ILivre> livres = new HashSet<ILivre>();

	/**
	 * Description of the property rangee.
	 */
	public String rangee = "";

	/**
	 * Description of the property etage.
	 */
	public String etage = "";

	/**
	 * The constructor.
	 */
	public Emplacement() {

	}

	/**
	 * Returns salle.
	 * @return salle 
	 */
	public String getSalle() {
		return this.salle;
	}

	/**
	 * Sets a value to attribute salle. 
	 * @param newSalle 
	 */
	public void setSalle(String newSalle) {
		this.salle = newSalle;
	}

	/**
	 * Returns livres.
	 * @return livres 
	 */
	public HashSet<ILivre> getLivres() {
		return this.livres;
	}

	/**
	 * Returns rangee.
	 * @return rangee 
	 */
	public String getRangee() {
		return this.rangee;
	}

	/**
	 * Sets a value to attribute rangee. 
	 * @param newRangee 
	 */
	public void setRangee(String newRangee) {
		this.rangee = newRangee;
	}

	/**
	 * Returns etage.
	 * @return etage 
	 */
	public String getEtage() {
		return this.etage;
	}

	/**
	 * Sets a value to attribute etage. 
	 * @param newEtage 
	 */
	public void setEtage(String newEtage) {
		this.etage = newEtage;
	}

}
