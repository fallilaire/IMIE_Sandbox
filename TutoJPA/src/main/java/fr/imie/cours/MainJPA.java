package fr.imie.cours;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.imie.cours.heritage.join.CD;
import fr.imie.cours.heritage.join.Livre;
import fr.imie.cours.heritage.perclass.Baleine;
import fr.imie.cours.heritage.perclass.Humain;
import fr.imie.cours.heritage.single.Salarie;
import fr.imie.cours.heritage.single.Stagiaire;

public class MainJPA {

	public static void main(String[] args) {
		
		testHeritance();
/*		
		Person person = r.findOne(1);
		System.out.println(person.getFirstName());
		
		List<Person> l = r.findAll();
		for (Person person2 : l) {
			System.out.println(person2.getFirstName());
		}
		
		List<Person> listByName = r.findOneByName("Lourson");
		for (Person person3 : listByName) {
			System.out.println(person3.getFirstName());
		}
*/

//		Person newPerson = new Person();
//		newPerson.setFirstName("Alea");
//		newPerson.setLastName("JactaEs");
//		r.create(newPerson);
		
	}
	
	private static void testHeritance() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TutoJPA");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		// strategy single => 1 table
		Salarie bob = new Salarie();
		bob.setNom("BOB");
		bob.setPrenom("bob");
		bob.setSalaire(64000);
		em.persist(bob);
		
		Stagiaire mike = new Stagiaire();
		mike.setNom("MIKE");
		mike.setPrenom("mike");
		mike.setTuteurStage("bob");
		em.persist(mike);
		
		// strategy per class => 2 tables
		Baleine moby = new Baleine();
		moby.setColor("blue");
		em.persist(moby);
		
		Humain jm = new Humain();
		jm.setPrenom("jm");
		em.persist(jm);
		
		// strategy join => 3 tables
		CD cd = new CD();
		cd.setNom("nevermind");
		cd.setGenre("metal");
		em.persist(cd);

		Livre livre = new Livre();
		livre.setNom("harry potter");
		livre.setIsbn("123456789");
		em.persist(livre);
		
		em.getTransaction().commit();		
	}

}
