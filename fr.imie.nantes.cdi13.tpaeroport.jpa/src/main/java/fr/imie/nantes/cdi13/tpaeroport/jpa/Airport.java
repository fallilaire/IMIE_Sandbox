package fr.imie.nantes.cdi13.tpaeroport.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airport {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private City city;

	private List<Flight> departureFlights;
	private List<Flight> arrivalFlights;
	
}
