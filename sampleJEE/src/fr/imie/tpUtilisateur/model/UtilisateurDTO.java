/**
 * 
 */
package fr.imie.tpUtilisateur.model;

/**
 * @author imiedev
 *
 */
public class UtilisateurDTO {

	private String id;
	private String login;
	private String email;

	public UtilisateurDTO initDTO(String id, String login, String email, String password) {
		this.id = id;
		this.login = login;
		this.email = email;
		this.password = password;
		return this;
	}

	public UtilisateurDTO initDTO(String login, String email, String password) {
		this.login = login;
		this.email = email;
		this.password = password;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
}
