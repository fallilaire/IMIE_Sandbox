package fr.nantes.imie.cdi13.bibliotheque.internal;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import java.util.Date;
// Start of user code (user defined imports)

import fr.nantes.imie.cdi13.bibliotheque.api.ILivre;

/**
 * Description of Emprunt.
 * 
 * @author freddy.cdi13
 */
public class Emprunt {
	/**
	 * Description of the property dateDebut.
	 */
	public Date dateDebut = new Date();

	/**
	 * Description of the property livre.
	 */
	public ILivre livre = null;

	/**
	 * Description of the property dateFin.
	 */
	public Date dateFin = new Date();

	/**
	 * Description of the property dateMaxRetour.
	 */
	public Date dateMaxRetour = new Date();

	/**
	 * Description of the property statut.
	 */
	public Statut statut = null;

	/**
	 * Description of the property adherents.
	 */
	public Adherent adherents = null;

	/**
	 * The constructor.
	 */
	public Emprunt() {
		super();
	}

	/**
	 * Returns dateDebut.
	 * @return dateDebut 
	 */
	public Date getDateDebut() {
		return this.dateDebut;
	}

	/**
	 * Sets a value to attribute dateDebut. 
	 * @param newDateDebut 
	 */
	public void setDateDebut(Date newDateDebut) {
		this.dateDebut = newDateDebut;
	}

	/**
	 * Returns livre.
	 * @return livre 
	 */
	public ILivre getLivre() {
		return this.livre;
	}

	/**
	 * Sets a value to attribute livre. 
	 * @param newLivre 
	 */
	public void setLivre(ILivre newLivre) {
		this.livre = newLivre;
	}

	/**
	 * Returns dateFin.
	 * @return dateFin 
	 */
	public Date getDateFin() {
		return this.dateFin;
	}

	/**
	 * Sets a value to attribute dateFin. 
	 * @param newDateFin 
	 */
	public void setDateFin(Date newDateFin) {
		this.dateFin = newDateFin;
	}

	/**
	 * Returns dateMaxRetour.
	 * @return dateMaxRetour 
	 */
	public Date getDateMaxRetour() {
		return this.dateMaxRetour;
	}

	/**
	 * Sets a value to attribute dateMaxRetour. 
	 * @param newDateMaxRetour 
	 */
	public void setDateMaxRetour(Date newDateMaxRetour) {
		this.dateMaxRetour = newDateMaxRetour;
	}

	/**
	 * Returns statut.
	 * @return statut 
	 */
	public Statut getStatut() {
		return this.statut;
	}

	/**
	 * Sets a value to attribute statut. 
	 * @param newStatut 
	 */
	public void setStatut(Statut newStatut) {
		this.statut = newStatut;
	}

	/**
	 * Returns adherents.
	 * @return adherents 
	 */
	public Adherent getAdherents() {
		return this.adherents;
	}

	/**
	 * Sets a value to attribute adherents. 
	 * @param newAdherents 
	 */
	public void setAdherents(Adherent newAdherents) {
		this.adherents = newAdherents;
	}

}
