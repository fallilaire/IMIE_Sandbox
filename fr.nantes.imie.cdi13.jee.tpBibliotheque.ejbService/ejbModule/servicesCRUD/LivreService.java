package servicesCRUD;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.nantes.imie.cdi13.jee.tpBibliotheque.jpa.Auteur;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.jpa.Bibliotheque;
import fr.nantes.imie.cdi13.jee.tpBibliotheque.jpa.Livre;

/**
 * Session Bean implementation class LivreService
 */
@Stateless
@LocalBean
public class LivreService {

	@PersistenceContext
	EntityManager em;
	
    /**
     * Default constructor. 
     */
    public LivreService() {
        // TODO Auto-generated constructor stub
    }
    
	public List<Livre> findAll() {
		@SuppressWarnings("unchecked")
		List<Livre> retour = em.createNamedQuery("Livre.findAll").getResultList();
		return retour;
    }
	
	public Livre findOneByTitre(String titre) {
		Livre retour = (Livre)em.createNamedQuery("Livre.findLivreByTitre").setParameter("titre", titre).getSingleResult();
		
		return retour;
	}
	
	public Livre findOneById(Integer id) {
		Livre retour = (Livre)em.createNamedQuery("Livre.findLivreById").setParameter("id", id).getSingleResult();
		
		return retour;
	}
	
	public List<Auteur> findAllAuteurs() {
		@SuppressWarnings("unchecked")
		List<Auteur> retour = em.createNamedQuery("Auteur.findAll").getResultList();
		return retour;
    }
	
	public Auteur findAuteurById(Integer id) {
		Auteur retour = (Auteur)em.createNamedQuery("Auteur.findAuteurById").setParameter("id", id).getSingleResult();
		return retour;
    }
	
	public void save(Livre livre) {
		em.persist(livre);
	}

	public void delete(Integer id) {
		Livre l = (Livre)em.createNamedQuery("Livre.findLivreById").setParameter("id", id).getSingleResult();
		em.remove(l);
	}
	
	public void update(Livre livre) {
		em.merge(livre);
	}
	
	public Bibliotheque getBibliotheque() {
		@SuppressWarnings("unchecked")
		List<Bibliotheque> bibli = em.createNamedQuery("Bibliotheque.findAll").getResultList();
		return bibli.get(0);
	}
	
}
