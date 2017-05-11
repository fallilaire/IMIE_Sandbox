package fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.csv;

import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.AuteurDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.LivreDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.AbstractFactory;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.IDAO;

public class FactoryCSV extends AbstractFactory {

	@Override
	public IDAO<LivreDTO> getLivreDAO() {
		return new LivreDAOCSV();
	}

	@Override
	public IDAO<AuteurDTO> getAuteurDAO() {
		return new AuteurDAOCSV();
	}

}
