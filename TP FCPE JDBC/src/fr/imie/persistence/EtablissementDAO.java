/**
 * 
 */
package fr.imie.persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.imie.model.AdresseDTO;
import fr.imie.model.EtablissementDTO;
import fr.imie.persistence.util.ConnectionPostgreSQL;

/**
 * @author imiedev
 *
 */
public class EtablissementDAO implements IUtilisateurDAO {
	
	

	@Override
	public List<EtablissementDTO> listAllEtablissement() {
		
		Statement statement = null;
		ResultSet resultSet = null;
		List<EtablissementDTO> etablissementDTOs = new ArrayList<>();
		try {
			String selectAllEtablissementQuery = "Select id, nom, num_rue, nom_rue, code_postal, ville from etablissement";
			statement = ConnectionPostgreSQL.createStatement();
			resultSet = statement.executeQuery(selectAllEtablissementQuery);
			while (resultSet.next()) {
				AdresseDTO adresseDTO = new AdresseDTO().initDTO(resultSet.getInt("num_rue"),
						resultSet.getString("nom_rue"), resultSet.getString("code_postal"),
						resultSet.getString("ville"));
				EtablissementDTO etablissement = new EtablissementDTO().initDTO(resultSet.getString("id"), resultSet.getString("nom"), adresseDTO);

				etablissementDTOs.add(etablissement);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
		return etablissementDTOs;
	}

	@Override
	public void createEtablissement(EtablissementDTO etablissement) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			String createEtablissement = "INSERT INTO etablissement (nom, nom_rue, code_postal, ville, num_rue) "
					+ "VALUES ('" + etablissement.getNom() + "', '" + etablissement.getAdresse().getNomVoie() + "', '" + etablissement.getAdresse().getCP() + "', '" + etablissement.getAdresse().getVille() + "', '" + etablissement.getAdresse().getNumero() + "')";
			statement = ConnectionPostgreSQL.createPreparedStatement(createEtablissement);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
	}

	@Override
	public void deleteEtablissement(EtablissementDTO etablissement) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			String deleteEtablissement = "DELETE FROM etablissement "
					+ "WHERE id = " + etablissement.getId();
			statement = ConnectionPostgreSQL.createPreparedStatement(deleteEtablissement);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
		
	}

	@Override
	public void updateEtablissement(EtablissementDTO etablissement) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			String updateEtablissement = "UPDATE etablissement SET nom = '" + etablissement.getNom() + "', nom_rue = '" + etablissement.getAdresse().getNomVoie() + "', code_postal = '" + etablissement.getAdresse().getCP() + "', ville = '" + etablissement.getAdresse().getVille() + "', num_rue = " + etablissement.getAdresse().getNumero() + " WHERE id = " + etablissement.getId();
			statement = ConnectionPostgreSQL.createPreparedStatement(updateEtablissement);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
		
	}

	@Override
	public EtablissementDTO getEtablissementAvecNom(String nom) {
		Statement statement = null;
		ResultSet resultSet = null;
		EtablissementDTO etablissement = null;
		try {
			String selectAllEtablissementQuery = "Select id, nom, num_rue, nom_rue, code_postal, ville from etablissement where nom = '" + nom + "'";
			statement = ConnectionPostgreSQL.createStatement();
			resultSet = statement.executeQuery(selectAllEtablissementQuery);
			
			if (resultSet.isBeforeFirst() ) {
				resultSet.next();
				AdresseDTO adresseDTO = new AdresseDTO().initDTO(resultSet.getInt("num_rue"),
						resultSet.getString("nom_rue"), resultSet.getString("code_postal"),
						resultSet.getString("ville"));
				etablissement = new EtablissementDTO().initDTO(resultSet.getString("id"), resultSet.getString("nom"), adresseDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionPostgreSQL.closeJDBC(statement, resultSet);
		}
		return etablissement;
	}
	
	

}
