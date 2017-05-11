/**
 * 
 */
package fr.imie.tpUtilisateur.persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.imie.tpUtilisateur.model.UtilisateurDTO;

/**
 * @author imiedev
 *
 */
public class UtilisateurDAO implements IUtilisateurDAO {
	
	

	@Override
	public List<UtilisateurDTO> listAllUtilisateur() {
		
		Statement statement = null;
		ResultSet resultSet = null;
		List<UtilisateurDTO> etablissementDTOs = new ArrayList<>();
		try {
			String selectAllUtilisateurQuery = "Select id, login, email, password from utilisateur";
			statement = ConnectionPostgreSQL.createStatement();
			resultSet = statement.executeQuery(selectAllUtilisateurQuery);
			while (resultSet.next()) {
				UtilisateurDTO utilisateurDTO = new UtilisateurDTO().initDTO(resultSet.getString("id"),
						resultSet.getString("login"), resultSet.getString("email"), resultSet.getString("password"));
				etablissementDTOs.add(utilisateurDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
		return etablissementDTOs;
	}

	@Override
	public void createUtilisateur(UtilisateurDTO utilisateur) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			String createUtilisateur = "INSERT INTO utilisateur (login, email, password) " + "VALUES ('"
					+ utilisateur.getLogin() + "', '" + utilisateur.getEmail() + "', '" + utilisateur.getPassword()
					+ "')";
			statement = ConnectionPostgreSQL.createPreparedStatement(createUtilisateur);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
	}

	@Override
	public void deleteUtilisateur(UtilisateurDTO utilisateur) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			String deleteEtablissement = "DELETE FROM utilisateur "
					+ "WHERE id = " + utilisateur.getId();
			statement = ConnectionPostgreSQL.createPreparedStatement(deleteEtablissement);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
		
	}

	@Override
	public void updateUtilisateur(UtilisateurDTO utilisateur) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			String updateUtilisateur = "UPDATE utilisateur SET login = '" + utilisateur.getLogin() + "', email = '"
					+ utilisateur.getEmail() + "', password = '" + utilisateur.getPassword() + " WHERE id = "
					+ utilisateur.getId();
			statement = ConnectionPostgreSQL.createPreparedStatement(updateUtilisateur);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
		
	}

	@Override
	public UtilisateurDTO getUtilisateurAvecNom(String login) {
		Statement statement = null;
		ResultSet resultSet = null;
		UtilisateurDTO utilisateur = null;
		try {
			String selectAllUtilisateurQuery = "Select id, login, email, password from public.\"Utilisateur\" where login = '"
					+ login + "'";
			statement = ConnectionPostgreSQL.createStatement();
			resultSet = statement.executeQuery(selectAllUtilisateurQuery);
			
			if (resultSet.isBeforeFirst() ) {
				resultSet.next();
				utilisateur = new UtilisateurDTO().initDTO(resultSet.getString("id"), resultSet.getString("login"),
						resultSet.getString("email"), resultSet.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
		return utilisateur;
	}

}
