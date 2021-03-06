package fr.imie.nantes.cdi13.tpaeroport.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StopOver {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date dateDepartureFlight;
	private Date dateArrivalFlight;
	
	private Flight flight;
	
}
