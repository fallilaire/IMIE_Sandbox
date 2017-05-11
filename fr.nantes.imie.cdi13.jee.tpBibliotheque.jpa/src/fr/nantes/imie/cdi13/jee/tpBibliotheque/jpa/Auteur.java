package fr.nantes.imie.cdi13.jee.tpBibliotheque.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the auteur database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Auteur.findAll", query="SELECT a FROM Auteur a"),
	@NamedQuery(name="Auteur.findAuteurById", query = "SELECT a FROM Auteur a WHERE a.id =:id ")
})

public class Auteur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
 	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String nom;

	private String prenom;

	public Auteur() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}