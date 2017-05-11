package fr.imie.cours.heritage.perclass;

import javax.persistence.Entity;

@Entity
public class Baleine extends Mamifere {
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
