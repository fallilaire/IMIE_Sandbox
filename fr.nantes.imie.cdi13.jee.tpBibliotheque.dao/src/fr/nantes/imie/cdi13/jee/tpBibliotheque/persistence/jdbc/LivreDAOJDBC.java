/**
 * 
 */
package fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.AuteurDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.model.LivreDTO;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence.IDAO;

/**
 * @author imiedev
 *
 */
public class LivreDAOJDBC implements IDAO<LivreDTO> {
	
	@Override
	public List<LivreDTO> findAll() {
		
		Statement statement = null;
		ResultSet resultSet = null;
		List<LivreDTO> livres = new ArrayList<LivreDTO>();
		try {
			String selectAllLivresQuery = "Select l.id, titre, id_auteur, nom, prenom from public2.\"livre\" l, public2.\"auteur\" a where l.id_auteur = a.id";
			statement = ConnectionJDBCPostgreSQL.createStatement();
			resultSet = statement.executeQuery(selectAllLivresQuery);
			while (resultSet.next()) {
				AuteurDTO auteurDTO = new AuteurDTO().initDTO(resultSet.getInt("id_auteur"), resultSet.getString("nom"),
						resultSet.getString("prenom"));
				LivreDTO livreDTO = new LivreDTO().initDTO(resultSet.getInt("id"), resultSet.getString("titre"),
						auteurDTO);
				livres.add(livreDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionJDBCPostgreSQL.closeJDBC(statement, resultSet);
		}
		return livres;
	}

	@Override
	public LivreDTO findOneById(Integer id) {
		Statement statement = null;
		ResultSet resultSet = null;
		LivreDTO livre = null;
		try {
			String selectLivreQuery = "Select l.id, titre, id_auteur, nom, prenom from public2.\"livre\" l, public2.\"auteur\" a where l.id_auteur = a.id AND l.id = '"
					+ id + "'";
			statement = ConnectionJDBCPostgreSQL.createStatement();
			resultSet = statement.executeQuery(selectLivreQuery);

			if (resultSet.isBeforeFirst()) {
				resultSet.next();
				AuteurDTO auteurDTO = new AuteurDTO().initDTO(resultSet.getInt("id_auteur"), resultSet.getString("nom"),
						resultSet.getString("prenom"));
				livre = new LivreDTO().initDTO(resultSet.getInt("id"), resultSet.getString("titre"),
						auteurDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionJDBCPostgreSQL.closeJDBC(statement, resultSet);
		}
		return livre;
	}

	@Override
	public void create(LivreDTO livre) {
		 PreparedStatement statement = null;
		 ResultSet resultSet = null;
		 try {
			String createLivre = "INSERT INTO public2.\"livre\" (id_bibliotheque, titre, id_auteur) VALUES (1, '"
					+ livre.getTitre() + "', "
					+ livre.getAuteur().getId() + ")";
			statement = ConnectionJDBCPostgreSQL.createPreparedStatement(createLivre);
			statement.executeUpdate();
		 } catch (SQLException e) {
			e.printStackTrace();
		 } finally {
			ConnectionJDBCPostgreSQL.closeJDBC(statement, resultSet);
		 }
	}

	@Override
	public void delete(LivreDTO utilisateur) {
		// PreparedStatement statement = null;
		// ResultSet resultSet = null;
		// try {
		// String deleteEtablissement = "DELETE FROM public2.\"Utilisateur\" "
		// + "WHERE id = " + utilisateur.getId();
		// statement =
		// ConnectionPostgreSQL.createPreparedStatement(deleteEtablissement);
		// statement.executeUpdate();
		// } catch (SQLException e) {
		// e.printStackTrace();
		// } finally {
		// ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		// }
		
	}

	@Override
	public void update(LivreDTO livre) {
		 PreparedStatement statement = null;
		 ResultSet resultSet = null;
		 try {
			String updateUtilisateur = "UPDATE public2.\"livre\" SET titre = '" + livre.getTitre()
					+ "' WHERE id = " + livre.getId();
			statement = ConnectionJDBCPostgreSQL.createPreparedStatement(updateUtilisateur);
			statement.executeUpdate();
		 } catch (SQLException e) {
			e.printStackTrace();
		 } finally {
			ConnectionJDBCPostgreSQL.closeJDBC(statement, resultSet);
		 }
	}

}
