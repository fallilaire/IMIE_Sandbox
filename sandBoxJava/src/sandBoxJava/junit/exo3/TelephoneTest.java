package sandBoxJava.junit.exo3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelephoneTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//Repos	AppelEntrant	Sonnerie		
	@Test
	public void testReposAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Repos);
		telephone.appelEntrant();
		assertEquals(Etat.Sonnerie, telephone.getEtat());
	}
	
	//Repos	Timeout		Erreur	
	@Test
	public void testReposTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Repos);
		telephone.timeOut();;
		assertEquals(Etat.Repos, telephone.getEtat());
	}
	
	//Repos	Decrocher	Decroche
	@Test
	public void testReposDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Repos);
		telephone.decrocher();;
		assertEquals(Etat.Decroche, telephone.getEtat());
	}
	
	//Repos	Raccrocher		Erreur	
	@Test
	public void testReposRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Repos);
		telephone.raccrocher();;
		assertEquals(Etat.Repos, telephone.getEtat());
	}
	
	//Repos	Numeroter		Erreur	
	@Test
	public void testReposNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Repos);
		telephone.numeroter();;
		assertEquals(Etat.Repos, telephone.getEtat());
	}
	
	//Repos	DecrocherCorrespondant		Erreur	
	@Test
	public void testReposDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Repos);
		telephone.correspondantDecroche();
		assertEquals(Etat.Repos, telephone.getEtat());
	}
	
	//Repos	RaccrocherCorrespondant		Erreur	
	@Test
	public void testReposRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Repos);
		telephone.correspondantRaccroche();
		assertEquals(Etat.Repos, telephone.getEtat());
	}
	
	//Sonnerie	AppelEntrant		Erreur	
	@Test
	public void testSonnerieAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Sonnerie);
		telephone.appelEntrant();
		assertEquals(Etat.Sonnerie, telephone.getEtat());
	}
	
	//Sonnerie	Timeout	Repos		
	@Test
	public void testSonnerieTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Sonnerie);
		telephone.timeOut();
		assertEquals(Etat.Repos, telephone.getEtat());
	}
	
	//Sonnerie	Decrocher	EnConversation		
	@Test
	public void testSonnerieDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Sonnerie);
		telephone.decrocher();
		assertEquals(Etat.EnConversation, telephone.getEtat());
	}
	
	//Sonnerie	Raccrocher		Erreur	
	@Test
	public void testSonnerieRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Sonnerie);
		telephone.raccrocher();
		assertEquals(Etat.Sonnerie, telephone.getEtat());
	}
	
	//Sonnerie	Numeroter		Erreur
	@Test
	public void testSonnerieNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Sonnerie);
		telephone.numeroter();
		assertEquals(Etat.Sonnerie, telephone.getEtat());
	}
	
	//Sonnerie	DecrocherCorrespondant		Erreur	
	@Test
	public void testSonnerieDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Sonnerie);
		telephone.correspondantDecroche();
		assertEquals(Etat.Sonnerie, telephone.getEtat());
	}
	
	//Sonnerie	RaccrocherCorrespondant		Erreur	
	@Test
	public void testSonnerieRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Sonnerie);
		telephone.correspondantRaccroche();
		assertEquals(Etat.Sonnerie, telephone.getEtat());
	}
	
	//EnConversation	AppelEntrant		Erreur	
	@Test
	public void testEnConversationAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnConversation);
		telephone.appelEntrant();
		assertEquals(Etat.EnConversation, telephone.getEtat());
	}
	
	//EnConversation	Timeout		Erreur	
	@Test
	public void testEnConversationTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnConversation);
		telephone.timeOut();
		assertEquals(Etat.EnConversation, telephone.getEtat());
	}
	
	//EnConversation	Decrocher		Erreur	
	@Test
	public void testEnConversationDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnConversation);
		telephone.decrocher();
		assertEquals(Etat.EnConversation, telephone.getEtat());
	}
	
	//EnConversation	Raccrocher	Repos		
	@Test
	public void testEnConversationRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnConversation);
		telephone.raccrocher();
		assertEquals(Etat.Repos, telephone.getEtat());
	}
	
	//EnConversation	Numeroter		Erreur	
	@Test
	public void testEnConversationNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnConversation);
		telephone.numeroter();
		assertEquals(Etat.EnConversation, telephone.getEtat());
	}
	
	//EnConversation	DecrocherCorrespondant		Erreur	
	@Test
	public void testEnConversationDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnConversation);
		telephone.correspondantDecroche();
		assertEquals(Etat.EnConversation, telephone.getEtat());
	}
	
	//EnConversation	RaccrocherCorrespondant	Decroche		
	@Test
	public void testEnConversationRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnConversation);
		telephone.correspondantRaccroche();
		assertEquals(Etat.Decroche, telephone.getEtat());
	}
	
	//Decroche	AppelEntrant		Erreur	
	@Test
	public void testDecrocheAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Decroche);
		telephone.appelEntrant();
		assertEquals(Etat.Decroche, telephone.getEtat());
	}
	
	//Decroche	Timeout		Erreur	
	@Test
	public void testDecrocheTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Decroche);
		telephone.timeOut();
		assertEquals(Etat.Decroche, telephone.getEtat());
	}
	
	//Decroche	Decrocher		Erreur	
	@Test
	public void testDecrocheDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Decroche);
		telephone.decrocher();
		assertEquals(Etat.Decroche, telephone.getEtat());
	}
	
	//Decroche	Raccrocher	Repos		
	@Test
	public void testDecrocheRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Decroche);
		telephone.raccrocher();
		assertEquals(Etat.Repos, telephone.getEtat());
	}
	
	//Decroche	Numeroter	EnAppel		
	@Test
	public void testDecrocheNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Decroche);
		telephone.numeroter();
		assertEquals(Etat.EnAppel, telephone.getEtat());
	}
	
	//Decroche	DecrocherCorrespondant		Erreur	
	@Test
	public void testDecrocheDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Decroche);
		telephone.correspondantDecroche();
		assertEquals(Etat.Decroche, telephone.getEtat());
	}
	
	//Decroche	RaccrocherCorrespondant		Erreur	
	@Test
	public void testDecrocheRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.Decroche);
		telephone.correspondantRaccroche();
		assertEquals(Etat.Decroche, telephone.getEtat());
	}
	
	//EnAppel	AppelEntrant		Erreur	
	@Test
	public void testEnAppelAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnAppel);
		telephone.appelEntrant();
		assertEquals(Etat.EnAppel, telephone.getEtat());
	}
	
	//EnAppel	Timeout	Decroche		
	@Test
	public void testEnAppelTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnAppel);
		telephone.timeOut();
		assertEquals(Etat.Decroche, telephone.getEtat());
	}
	
	//EnAppel	Decrocher		Erreur	
	@Test
	public void testEnAppelDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnAppel);
		telephone.decrocher();
		assertEquals(Etat.EnAppel, telephone.getEtat());
	}
	
	//EnAppel	Raccrocher	Repos		
	@Test
	public void testEnAppelRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnAppel);
		telephone.raccrocher();
		assertEquals(Etat.Repos, telephone.getEtat());
	}
	
	//EnAppel	Numeroter		Erreur	
	@Test
	public void testEnAppelNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnAppel);
		telephone.numeroter();
		assertEquals(Etat.EnAppel, telephone.getEtat());
	}
	
	//EnAppel	DecrocherCorrespondant	EnConversation		
	@Test
	public void testEnAppelDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnAppel);
		telephone.correspondantDecroche();
		assertEquals(Etat.EnConversation, telephone.getEtat());
	}
	
	//EnAppel	RaccrocherCorrespondant		Erreur	
	@Test
	public void testEnAppelRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(Etat.EnAppel);
		telephone.correspondantRaccroche();
		assertEquals(Etat.EnAppel, telephone.getEtat());
	}
	
}
