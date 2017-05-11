package sandBoxJava.junit.exo2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAccepteClientNormalOK1() {
		Client client = new ClientNormal(0);
		assertTrue(client.accepte(10000));
	}
	
	@Test
	public void testAccepteClientNormalOK2() {
		Client client = new ClientNormal(2000);
		assertTrue(client.accepte(4000));
	}
	
	@Test
	public void testAccepteClientNormalOK3() {
		Client client = new ClientNormal(8000);
		assertTrue(client.accepte(500));
	}
	
	@Test
	// Normal_RG1_1
	public void testAccepteClientNormalFail_RG1_1() {
		Client client = new ClientNormal(2000);
		assertFalse(client.accepte(6000));
	}
	
	@Test
	// Normal_RG2
	public void testAccepteClientNormalFail_RG2() {
		Client client = new ClientNormal(4000);
		assertFalse(client.accepte(1020));
	}
	
	@Test
	public void testAccepteClientPremiumOK1() {
		Client client = new ClientPremium(4000);
		assertTrue(client.accepte(500));
	}
	
	@Test
	public void testAccepteClientPremiumOK2() {
		Client client = new ClientPremium(2000);
		assertTrue(client.accepte(6000));
	}

	@Test
	// Premium_RG1
	public void testAccepteClientPremiumFail_RG1() {
		Client client = new ClientPremium(4000);
		assertFalse(client.accepte(6000));
	}
	
	@Test
	public void testAccepteClientASurveillerOK1() {
		Client client = new ClientASurveiller(0);
		assertTrue(client.accepte(10));
	}
	
	@Test
	public void testAccepteClientASurveillerOK2() {
		Client client = new ClientASurveiller(2000);
		assertTrue(client.accepte(10));
	}
	
	@Test
	// A_Surveiller_RG1 - if (this.enCours > 1000 && montant > 1000) {
	public void testAccepteClientASurveillerFail_RG1() {
		Client client = new ClientASurveiller(1020);
		assertFalse(client.accepte(2000));
	}
	
	@Test
	// A_Surveiller_RG2 - 
	public void testAccepteClientASurveillerFail_RG2() {
		Client client = new ClientASurveiller(0);
		assertFalse(client.accepte(10000));
	}

}
