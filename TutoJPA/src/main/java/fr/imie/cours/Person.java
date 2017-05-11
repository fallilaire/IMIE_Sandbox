package fr.imie.cours;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="\"public2\".Person")
@NamedQuery(name = "Person.findPersonByName", query = "SELECT p FROM Person p WHERE p.lastName =:lastname ")
public class Person {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) { 
		this.id = id; 
	}
	
	public String getFirstName() { 
		return firstName; 
	}
	
	public void setFirstName(String firstName) { 
		this.firstName = firstName; 
	}
	
	public String getLastName() { 
		return lastName; 
	}
	
	public void setLastName(String lastName) { 
		this.lastName = lastName; 
	}

}
