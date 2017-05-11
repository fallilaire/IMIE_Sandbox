package fr.nantes.imie.cdi13.bibliotheque.internal;
import java.util.HashSet;

import fr.nantes.imie.cdi13.bibliotheque.api.ILivre;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

/**
 * Description of Livre.
 * 
 * @author freddy.cdi13
 */
public class Livre implements ILivre {
	/**
	 * Description of the property numeroISBN.
	 */
	public String numeroISBN;

	/**
	 * Description of the property titre.
	 */
	public String titre;

	/**
	 * Description of the property auteurs.
	 */
	public HashSet<Auteur> auteurs = new HashSet<Auteur>();

	/**
	 * Description of the property catalogue.
	 */
	public Catalogue catalogue;

	/**
	 * The constructor.
	 */
	public Livre(String numeroISBN, String titre) {
		this.numeroISBN = numeroISBN;
		this.titre = titre;
	}

	/**
	 * Description of the method estDisponible.
	 */
	public void estDisponible() {

	}

	/**
	 * Returns numeroISBN.
	 * @return numeroISBN 
	 */
	public String getNumeroISBN() {
		return this.numeroISBN;
	}

	/**
	 * Sets a value to attribute numeroISBN. 
	 * @param newNumeroISBN 
	 */
	public void setNumeroISBN(String newNumeroISBN) {
		this.numeroISBN = newNumeroISBN;
	}

	/**
	 * Returns titre.
	 * @return titre 
	 */
	public String getTitre() {
		return this.titre;
	}

	/**
	 * Sets a value to attribute titre. 
	 * @param newTitre 
	 */
	public void setTitre(String newTitre) {
		this.titre = newTitre;
	}

	/**
	 * Returns auteurs.
	 * @return auteurs 
	 */
	public HashSet<Auteur> getAuteurs() {
		return this.auteurs;
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
		this.catalogue = newCatalogue;
	}
	
	@Override
	public String toString() {
		return this.titre;
	}

}
