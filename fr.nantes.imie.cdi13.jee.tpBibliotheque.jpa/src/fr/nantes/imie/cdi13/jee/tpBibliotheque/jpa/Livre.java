package fr.nantes.imie.cdi13.jee.tpBibliotheque.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the livre database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Livre.findAll", query="SELECT l FROM Livre l"),
	@NamedQuery(name = "Livre.findLivreByTitre", query = "SELECT l FROM Livre l WHERE l.titre =:titre "),
	@NamedQuery(name = "Livre.findLivreById", query = "SELECT l FROM Livre l WHERE l.id =:id ")
})
public class Livre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String titre;

	//uni-directional many-to-one association to Auteur
	@ManyToOne
	@JoinColumn(name="id_auteur")
	private Auteur auteur;

	//uni-directional many-to-one association to Bibliotheque
	@ManyToOne
	@JoinColumn(name="id_bibliotheque")
	private Bibliotheque bibliotheque;

	public Livre() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Auteur getAuteur() {
		return this.auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public Bibliotheque getBibliotheque() {
		return this.bibliotheque;
	}

	public void setBibliotheque(Bibliotheque bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

}