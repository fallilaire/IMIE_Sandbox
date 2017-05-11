package fr.nantes.imie.cdi13.bibliotheque.main;

import fr.nantes.imie.cdi13.bibliotheque.internal.Livre;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		Livre livre = new Livre("0001", "Dune");
		System.out.println(livre.toString());
	}

}
