package fr.nantes.imie.cdi13.jee.tpBibliotheque.model;

public class AdministrateurDTO {

	private Integer id;
	private String login;
	private String password;

	public AdministrateurDTO initDTO(Integer id, String login, String password) {
		this.id = id;
		this.login = login;
		this.password = password;
		return this;
	}

	public AdministrateurDTO initDTO(String login, String password) {
		this.login = login;
		this.password = password;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
