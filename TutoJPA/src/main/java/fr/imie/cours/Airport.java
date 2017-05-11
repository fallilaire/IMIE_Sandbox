package fr.imie.cours;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="\"public2\".Airport")
public class Airport {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@ManyToMany
	@JoinTable(
		name="\"public2\".flight_airport", 
		joinColumns = @JoinColumn(name="id_flight", referencedColumnName="id"),
		inverseJoinColumns = @JoinColumn(name="id_airport", referencedColumnName="id")
	)
	private List<Flight> listFlights = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
