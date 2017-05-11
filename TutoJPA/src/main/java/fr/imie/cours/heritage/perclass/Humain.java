package fr.imie.cours.heritage.perclass;

import javax.persistence.Entity;

@Entity
public class Humain extends Mamifere {

	private String prenom;

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
