package fr.nantes.imie.cdi13.bibliotheque.internal;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

/**
 * Description of Personne.
 * 
 * @author freddy.cdi13
 */
public abstract class Personne {
	/**
	 * Description of the property prenom.
	 */
	private String prenom;

	/**
	 * Description of the property nom.
	 */
	private String nom;

	/**
	 * The constructor.
	 */
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	/**
	 * Returns prenom.
	 * @return prenom 
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * Sets a value to attribute prenom. 
	 * @param newPrenom 
	 */
	public void setPrenom(String newPrenom) {
		this.prenom = newPrenom;
	}

	/**
	 * Returns nom.
	 * @return nom 
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Sets a value to attribute nom. 
	 * @param newNom 
	 */
	public void setNom(String newNom) {
		this.nom = newNom;
	}

}
