package fr.nantes.imie.cdi13.jee.tpBibliotheque.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bibliotheque database table.
 * 
 */
@Entity
@NamedQuery(name="Bibliotheque.findAll", query="SELECT b FROM Bibliotheque b")
public class Bibliotheque implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	public Bibliotheque() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}