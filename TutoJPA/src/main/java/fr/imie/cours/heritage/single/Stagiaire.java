package fr.imie.cours.heritage.single;

import javax.persistence.Entity;

@Entity
public class Stagiaire extends Personne {

	private String tuteurStage;

	public String getTuteurStage() {
		return tuteurStage;
	}

	public void setTuteurStage(String tuteurStage) {
		this.tuteurStage = tuteurStage;
	}
	
}
