package fr.nantes.imie.cdi13.bibliotheque.internal;
import java.util.HashSet;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

/**
 * Description of Auteur.
 * 
 * @author freddy.cdi13
 */
public class Auteur extends Personne {
	/**
	 * Description of the property livres.
	 */
	public HashSet<Livre> livres = new HashSet<Livre>();

	/**
	 * The constructor.
	 */
	public Auteur(String prenom, String nom) {
		super(prenom, nom);
	}

	/**
	 * Returns livres.
	 * @return livres 
	 */
	public HashSet<Livre> getLivres() {
		return this.livres;
	}

}
