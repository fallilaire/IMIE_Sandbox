package fr.nantes.imie.cdi13.bibliotheque.internal;
import java.util.HashSet;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

/**
 * Description of Catalogue.
 * 
 * @author freddy.cdi13
 */
public class Catalogue {
	/**
	 * Description of the property liste.
	 */
	public HashSet<Livre> liste = new HashSet<Livre>();

	/**
	 * The constructor.
	 */
	public Catalogue() {

	}

	/**
	 * Returns liste.
	 * @return liste 
	 */
	public HashSet<Livre> getListe() {
		return this.liste;
	}

}
