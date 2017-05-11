package fr.imie.cours;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Repository {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("TutoJPA");

	private EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public List<Person> findAll() {
		return getEntityManager().createQuery("from Person p").getResultList();
	}

	public Person findOne(int id) {
		return getEntityManager().find(Person.class, id);
	}
	
	public List<Person> findOneByName(String name) {
		EntityManager em = getEntityManager();		
		return em.createNamedQuery("Person.findPersonByName").setParameter("lastname", name).getResultList();
	}
	
	public Person findOne(Person data) {
		return findOne(data.getId());
	}

	public void create(Person data) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		try {
			em.persist(data);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();	
		}
	}

	public void update(Person data) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		try {
			em.merge(data);
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();	
		}
	}

	public void delete(Person data) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		try {
			em.remove(em.getReference(Person.class, data.getId()));
		} catch (Exception ex) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

}
