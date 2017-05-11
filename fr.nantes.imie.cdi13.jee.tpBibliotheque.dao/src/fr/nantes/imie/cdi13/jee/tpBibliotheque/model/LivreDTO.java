package fr.nantes.imie.cdi13.jee.tpBibliotheque.model;

public class LivreDTO {

	private Integer id;
	private String titre;
	private AuteurDTO auteur;

	public LivreDTO initDTO(Integer id, String titre, AuteurDTO auteur) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		return this;
	}

	public LivreDTO initDTO(String titre, AuteurDTO auteur) {
		this.titre = titre;
		this.auteur = auteur;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public AuteurDTO getAuteur() {
		return auteur;
	}

	public void setAuteur(AuteurDTO auteur) {
		this.auteur = auteur;
	}

}
