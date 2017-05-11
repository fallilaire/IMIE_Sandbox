package fr.nantes.imie.cdi13.jee.tpBibliotheque.model;

public class AuteurDTO {

	private Integer id;
	private String nom;
	private String prenom;
	
	public AuteurDTO initDTO(Integer id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		return this;
	}
	
	public AuteurDTO initDTO(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		return this;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
