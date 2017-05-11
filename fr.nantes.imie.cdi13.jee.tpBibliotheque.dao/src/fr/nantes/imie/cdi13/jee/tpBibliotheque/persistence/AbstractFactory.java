package fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence;

import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.AuteurDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.LivreDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.jdbc.FactoryJDBC;

public abstract class AbstractFactory {

	public static AbstractFactory getInstance() {
		return new FactoryJDBC();
	}

	public abstract IDAO<LivreDTO> getLivreDAO();

	public abstract IDAO<AuteurDTO> getAuteurDAO();

}
