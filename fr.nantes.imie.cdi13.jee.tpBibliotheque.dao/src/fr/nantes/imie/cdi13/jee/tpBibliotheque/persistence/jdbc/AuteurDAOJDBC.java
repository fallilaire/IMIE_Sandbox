/**
 * 
 */
package fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.AuteurDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.IDAO;

/**
 * @author imiedev
 *
 */
public class AuteurDAOJDBC implements IDAO<AuteurDTO> {
	
	@Override
	public List<AuteurDTO> findAll() {
		
		Statement statement = null;
		ResultSet resultSet = null;
		List<AuteurDTO> auteurs = new ArrayList<AuteurDTO>();
		try {
			String selectAllLivresQuery = "Select id, nom, prenom from public2.\"auteur\"";
			statement = ConnectionJDBCPostgreSQL.createStatement();
			resultSet = statement.executeQuery(selectAllLivresQuery);
			while (resultSet.next()) {
				AuteurDTO auteurDTO = new AuteurDTO().initDTO(resultSet.getInt("id"), resultSet.getString("nom"),
						resultSet.getString("prenom"));
				auteurs.add(auteurDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionJDBCPostgreSQL.closeJDBC(statement, resultSet);
		}
		return auteurs;
	}

	@Override
	public AuteurDTO findOneById(Integer id) {
		return null;
	}

	@Override
	public void create(AuteurDTO auteur) {
	}

	@Override
	public void delete(AuteurDTO auteur) {
		
	}

	@Override
	public void update(AuteurDTO auteur) {

	}

}
