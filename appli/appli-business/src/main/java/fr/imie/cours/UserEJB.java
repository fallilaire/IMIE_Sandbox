package fr.imie.cours;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.imie.cours.model.User;

@Stateless
public class UserEJB implements UserLocal {

	@PersistenceContext
	EntityManager em;

	public List<User> findAll() {
		return em.createQuery("select u from User u", User.class).getResultList();
	}

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public User findOne(User data) {
		return findOne(data.getId());
	}

	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public User findOne(int id) {
		return em.find(User.class, id);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void create(User data) {
		em.persist(data);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void update(User data) {
		em.merge(data);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void delete(User data) {
		delete(data.getId());
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void delete(Integer id) {
		em.remove(em.getReference(User.class, id));
	}

	
}
