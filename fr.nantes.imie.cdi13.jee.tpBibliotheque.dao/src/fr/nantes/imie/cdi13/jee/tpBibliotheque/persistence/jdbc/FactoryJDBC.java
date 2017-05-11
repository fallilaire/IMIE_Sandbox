package fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.jdbc;

import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.AuteurDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.LivreDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.AbstractFactory;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.IDAO;

public class FactoryJDBC extends AbstractFactory {

	@Override
	public IDAO<LivreDTO> getLivreDAO() {
		return new LivreDAOJDBC();
	}

	@Override
	public IDAO<AuteurDTO> getAuteurDAO() {
		return new AuteurDAOJDBC();
	}

}
