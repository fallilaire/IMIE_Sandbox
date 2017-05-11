package fr.nantes.imie.cdi13.bibliotheque.api;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import fr.nantes.imie.cdi13.bibliotheque.internal.Livre;

/**
 * Description of IAdherent.
 * 
 * @author freddy.cdi13
 */
public interface IAdherent {

	/**
	 * Description of the method emprunter.
	 * @param livre 
	 */
	public void emprunter(Livre livre);


}
