package sampleWebService;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.imie.cours.Person;
import fr.imie.cours.Repository;

@Path("/person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonRest {
		
	@GET
	public Response findAll() {
		
//		List<Person> person = new Repository().findAll();
		
		List<Person> list = new Repository().findAll();
		
		Person person = new Person();
		person.setFirstName("Willy");
		person.setLastName("Wonka");
		list.add(person);
		
		Person person2 = new Person();
		person2.setFirstName("Edmond");
		person2.setLastName("Dantes");
		list.add(person2);
		
		return Response.ok(list).build();
//		return list;
	}
	
	@GET
	@Path("{id}")
	public Response findOne(@PathParam("id") Integer id) {
		Person person = new Person();
		person.setFirstName("Babar");
		person.setLastName("Le Roi Des Elephants");
		return Response.ok(person).build();
	}
	
	@POST
	public Response create(Person person) {
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		return Response.ok("--POST--").build();
	}
	
	@PUT
	public Response update(Person person) {
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		return Response.ok("--PUT--").build();
	}
	
	@DELETE
	public Response delete() {
		return Response.ok("--DELETE--").build();
	}
}
