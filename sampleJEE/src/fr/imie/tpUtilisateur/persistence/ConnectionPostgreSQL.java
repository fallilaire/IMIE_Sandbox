package fr.imie.tpUtilisateur.persistence;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPostgreSQL {

	/**
	 * URL de connection
	 */
	private static String url = "jdbc:postgresql://localhost:5433/postgres";

	/**
	 * Nom du user
	 */
	private static String user = "postgres";

	/**
	 * Mot de passe du user
	 */
	private static String passwd = "admin";
	
	public static Statement createStatement() throws SQLException {
		Class<?> driverClass;
		try {
			driverClass = Class.forName("org.postgresql.Driver");
			DriverManager.registerDriver((Driver) driverClass.newInstance());
			Connection connection = DriverManager.getConnection(url, user, passwd);
			Statement statement = connection.createStatement();
			return statement;
		} catch (ReflectiveOperationException e) {
			throw new SQLException(e);
		}
	}
	
	public static PreparedStatement createPreparedStatement(String query) throws SQLException {
		Class<?> driverClass;
		try {
			driverClass = Class.forName("org.postgresql.Driver");
			DriverManager.registerDriver((Driver) driverClass.newInstance());
			Connection connection = DriverManager.getConnection(url, user, passwd);
			PreparedStatement statement = connection.prepareStatement(query);
			return statement;
		} catch (ReflectiveOperationException e) {
			throw new SQLException(e);
		}
	}
	
	public static void closeJDBC(Statement statement, ResultSet resultSet) {
		try {
			if (resultSet != null && !resultSet.isClosed()) {
				resultSet.close();
			}
			if (statement != null && !statement.isClosed()) {
				statement.close();
			}
			Connection connection = statement.getConnection();
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}