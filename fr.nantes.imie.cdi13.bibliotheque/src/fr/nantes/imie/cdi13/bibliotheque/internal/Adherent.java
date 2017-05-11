package fr.nantes.imie.cdi13.bibliotheque.internal;
import java.util.HashSet;

import fr.nantes.imie.cdi13.bibliotheque.api.IAdherent;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

/**
 * Description of Adherent.
 * 
 * @author freddy.cdi13
 */
public class Adherent extends Personne implements IAdherent {

	/**
	 * Description of the property numeroAdherent.
	 */
	private Integer numeroAdherent;

	/**
	 * Description of the property emprunts.
	 */
	private HashSet<Emprunt> emprunts = new HashSet<Emprunt>();

	/**
	 * The constructor.
	 */
	public Adherent(String prenom, String nom) {
		super(prenom, nom);
		this.numeroAdherent = NumeroAdherent.getInstance().createNewIndice();
	}

	/**
	 * Description of the method emprunter.
	 * @param livre 
	 */
	public void emprunter(Livre livre) {

	}

	/**
	 * Returns numeroAdherent.
	 * @return numeroAdherent 
	 */
	public Integer getNumeroAdherent() {
		return this.numeroAdherent;
	}

	/**
	 * Sets a value to attribute numeroAdherent. 
	 * @param newNumeroAdherent 
	 */
	public void setNumeroAdherent(Integer newNumeroAdherent) {
		this.numeroAdherent = newNumeroAdherent;
	}

	/**
	 * Returns emprunts.
	 * @return emprunts 
	 */
	public HashSet<Emprunt> getEmprunts() {
		return this.emprunts;
	}

}
