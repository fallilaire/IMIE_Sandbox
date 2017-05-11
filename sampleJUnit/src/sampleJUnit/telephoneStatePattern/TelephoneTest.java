package sampleJUnit.telephoneStatePattern;

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

	//Repos	AppelEntrant Sonnerie
	@Test
	public void testReposAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneRepos(telephone));
		telephone.appelEntrant();
		assertEquals(EtatTelephoneSonnerie.class, telephone.getEtat().getClass());
	}
	
	//Repos Timeout	Erreur	
	@Test
	public void testReposTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneRepos(telephone));
		telephone.timeOut();;
		assertEquals(EtatTelephoneRepos.class, telephone.getEtat().getClass());
	}
	
	//Repos Decrocher Decroche
	@Test
	public void testReposDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneRepos(telephone));
		telephone.decrocher();;
		assertEquals(EtatTelephoneDecroche.class, telephone.getEtat().getClass());
	}
	
	//Repos Raccrocher Erreur	
	@Test
	public void testReposRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneRepos(telephone));
		telephone.raccrocher();;
		assertEquals(EtatTelephoneRepos.class, telephone.getEtat().getClass());
	}
	
	//Repos Numeroter Erreur	
	@Test
	public void testReposNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneRepos(telephone));
		telephone.numeroter();;
		assertEquals(EtatTelephoneRepos.class, telephone.getEtat().getClass());
	}
	
	//Repos DecrocherCorrespondant Erreur	
	@Test
	public void testReposDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneRepos(telephone));
		telephone.correspondantDecroche();
		assertEquals(EtatTelephoneRepos.class, telephone.getEtat().getClass());
	}
	
	//Repos	RaccrocherCorrespondant Erreur	
	@Test
	public void testReposRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneRepos(telephone));
		telephone.correspondantRaccroche();
		assertEquals(EtatTelephoneRepos.class, telephone.getEtat().getClass());
	}
	
	//Sonnerie AppelEntrant Erreur	
	@Test
	public void testSonnerieAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneSonnerie(telephone));
		telephone.appelEntrant();
		assertEquals(EtatTelephoneSonnerie.class, telephone.getEtat().getClass());
	}
	
	//Sonnerie	Timeout	Repos		
	@Test
	public void testSonnerieTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneSonnerie(telephone));
		telephone.timeOut();
		assertEquals(EtatTelephoneRepos.class, telephone.getEtat().getClass());
	}
	
	//Sonnerie	Decrocher	EnConversation		
	@Test
	public void testSonnerieDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneSonnerie(telephone));
		telephone.decrocher();
		assertEquals(EtatTelephoneEnConversation.class, telephone.getEtat().getClass());
	}
	
	//Sonnerie	Raccrocher		Erreur	
	@Test
	public void testSonnerieRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneSonnerie(telephone));
		telephone.raccrocher();
		assertEquals(EtatTelephoneSonnerie.class, telephone.getEtat().getClass());
	}
	
	//Sonnerie	Numeroter		Erreur
	@Test
	public void testSonnerieNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneSonnerie(telephone));
		telephone.numeroter();
		assertEquals(EtatTelephoneSonnerie.class, telephone.getEtat().getClass());
	}
	
	//Sonnerie	DecrocherCorrespondant		Erreur	
	@Test
	public void testSonnerieDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneSonnerie(telephone));
		telephone.correspondantDecroche();
		assertEquals(EtatTelephoneSonnerie.class, telephone.getEtat().getClass());
	}
	
	//Sonnerie	RaccrocherCorrespondant		Erreur	
	@Test
	public void testSonnerieRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneSonnerie(telephone));
		telephone.correspondantRaccroche();
		assertEquals(EtatTelephoneSonnerie.class, telephone.getEtat().getClass());
	}
	
	//EnConversation	AppelEntrant		Erreur	
	@Test
	public void testEnConversationAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnConversation(telephone));
		telephone.appelEntrant();
		assertEquals(EtatTelephoneEnConversation.class, telephone.getEtat().getClass());
	}
	
	//EnConversation	Timeout		Erreur	
	@Test
	public void testEnConversationTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnConversation(telephone));
		telephone.timeOut();
		assertEquals(EtatTelephoneEnConversation.class, telephone.getEtat().getClass());
	}
	
	//EnConversation	Decrocher		Erreur	
	@Test
	public void testEnConversationDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnConversation(telephone));
		telephone.decrocher();
		assertEquals(EtatTelephoneEnConversation.class, telephone.getEtat().getClass());
	}
	
	//EnConversation	Raccrocher	Repos		
	@Test
	public void testEnConversationRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnConversation(telephone));
		telephone.raccrocher();
		assertEquals(EtatTelephoneRepos.class, telephone.getEtat().getClass());
	}
	
	//EnConversation	Numeroter		Erreur	
	@Test
	public void testEnConversationNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnConversation(telephone));
		telephone.numeroter();
		assertEquals(EtatTelephoneEnConversation.class, telephone.getEtat().getClass());
	}
	
	//EnConversation	DecrocherCorrespondant		Erreur	
	@Test
	public void testEnConversationDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnConversation(telephone));
		telephone.correspondantDecroche();
		assertEquals(EtatTelephoneEnConversation.class, telephone.getEtat().getClass());
	}
	
	//EnConversation	RaccrocherCorrespondant	Decroche
	@Test
	public void testEnConversationRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnConversation(telephone));
		telephone.correspondantRaccroche();
		assertEquals(EtatTelephoneDecroche.class, telephone.getEtat().getClass());
	}
	
	//Decroche	AppelEntrant		Erreur	
	@Test
	public void testDecrocheAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneDecroche(telephone));
		telephone.appelEntrant();
		assertEquals(EtatTelephoneDecroche.class, telephone.getEtat().getClass());
	}
	
	//Decroche	Timeout		Erreur	
	@Test
	public void testDecrocheTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneDecroche(telephone));
		telephone.timeOut();
		assertEquals(EtatTelephoneDecroche.class, telephone.getEtat().getClass());
	}
	
	//Decroche	Decrocher		Erreur	
	@Test
	public void testDecrocheDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneDecroche(telephone));
		telephone.decrocher();
		assertEquals(EtatTelephoneDecroche.class, telephone.getEtat().getClass());
	}
	
	//Decroche	Raccrocher	Repos		
	@Test
	public void testDecrocheRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneDecroche(telephone));
		telephone.raccrocher();
		assertEquals(EtatTelephoneRepos.class, telephone.getEtat().getClass());
	}
	
	//Decroche	Numeroter	EnAppel
	@Test
	public void testDecrocheNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneDecroche(telephone));
		telephone.numeroter();
		assertEquals(EtatTelephoneEnAppel.class, telephone.getEtat().getClass());
	}
	
	//Decroche	DecrocherCorrespondant		Erreur	
	@Test
	public void testDecrocheDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneDecroche(telephone));
		telephone.correspondantDecroche();
		assertEquals(EtatTelephoneDecroche.class, telephone.getEtat().getClass());
	}
	
	//Decroche	RaccrocherCorrespondant		Erreur	
	@Test
	public void testDecrocheRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneDecroche(telephone));
		telephone.correspondantRaccroche();
		assertEquals(EtatTelephoneDecroche.class, telephone.getEtat().getClass());
	}
	
	//EnAppel	AppelEntrant		Erreur	
	@Test
	public void testEnAppelAppelEntrant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnAppel(telephone));
		telephone.appelEntrant();
		assertEquals(EtatTelephoneEnAppel.class, telephone.getEtat().getClass());
	}
	
	//EnAppel	Timeout	Decroche		
	@Test
	public void testEnAppelTimeout() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnAppel(telephone));
		telephone.timeOut();
		assertEquals(EtatTelephoneDecroche.class, telephone.getEtat().getClass());
	}
	
	//EnAppel	Decrocher		Erreur	
	@Test
	public void testEnAppelDecrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnAppel(telephone));
		telephone.decrocher();
		assertEquals(EtatTelephoneEnAppel.class, telephone.getEtat().getClass());
	}
	
	//EnAppel	Raccrocher	Repos		
	@Test
	public void testEnAppelRaccrocher() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnAppel(telephone));
		telephone.raccrocher();
		assertEquals(EtatTelephoneRepos.class, telephone.getEtat().getClass());
	}
	
	//EnAppel	Numeroter		Erreur	
	@Test
	public void testEnAppelNumeroter() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnAppel(telephone));
		telephone.numeroter();
		assertEquals(EtatTelephoneEnAppel.class, telephone.getEtat().getClass());
	}
	
	//EnAppel	DecrocherCorrespondant	EnConversation		
	@Test
	public void testEnAppelDecrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnAppel(telephone));
		telephone.correspondantDecroche();
		assertEquals(EtatTelephoneEnConversation.class, telephone.getEtat().getClass());
	}
	
	//EnAppel	RaccrocherCorrespondant		Erreur	
	@Test
	public void testEnAppelRaccrocherCorrespondant() {
		Telephone telephone = new Telephone();
		telephone.setEtat(new EtatTelephoneEnAppel(telephone));
		telephone.correspondantRaccroche();
		assertEquals(EtatTelephoneEnAppel.class, telephone.getEtat().getClass());
	}
	
}
