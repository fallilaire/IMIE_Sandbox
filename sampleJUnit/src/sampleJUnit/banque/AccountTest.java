package sampleJUnit.banque;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	static class WSBankStub implements IWSBank {

		@Override
		public int getRate(String devise) {
			return 2;
		}
		
	}
	
	static class FTO_Account extends Account {
		
		public void setWSBank(IWSBank wsBank) {
			super.setWsBank(wsBank);
		}
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testDebiter() {
		fail("Not yet implemented");
	}

	@Test
	public void testCrediter() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSolde() {
		fail("Not yet implemented");
	}

}
