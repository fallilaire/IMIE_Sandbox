package fr.imie.cours.heritage.join;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "cd")
public class CD extends Produit {

	private String genre;
	private Integer nbTracks;
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Integer getNbTracks() {
		return nbTracks;
	}
	public void setNbTracks(Integer nbTracks) {
		this.nbTracks = nbTracks;
	}
	
}
