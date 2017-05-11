package sandBoxJava.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

	@Test
	public void testCalculerOK() {
		Addition myOp = new Addition(2, 3);
		assertEquals((long)5, (long)myOp.calculer());
	}
	
	@Test
	public void testCalculerFailed() {
		Addition myOp = new Addition(3, 3);
		assertNotEquals((long)5, (long)myOp.calculer());
	}

	@Test
	public void testLireSymboleOK() {
		Addition myOp = new Addition(2, 3);
		assertEquals("+", myOp.lireSymbole());
	}
	
	@Test
	public void testLireSymboleFailed() {
		Addition myOp = new Addition(2, 3);
		assertNotEquals("-", myOp.lireSymbole());
	}

	@Test
	public void testToStringOK() {
		Addition myOp = new Addition(2, 3);
		assertEquals("Addition", myOp.toString());
	}
	
	@Test
	public void testToStringFailed() {
		Addition myOp = new Addition(2, 3);
		assertNotEquals("Nothing", myOp.toString());
	}

	@Test
	public void testEqualsOK() {
		Addition myOp = new Addition(2, 3);
		assertEquals(true, myOp.equals(new Addition(2, 3)));
	}
	
	@Test
	public void testEqualsFailed() {
		Addition myOp = new Addition(3, 3);
		assertNotEquals(true, myOp.equals(new Addition(2, 3)));
	}
	
	@Test
	public void testEqualsNull() {
		Addition obj = new Addition(2, 3);
		assertFalse(obj.equals(false));
	}
	
	@Test
	public void testEqualsOther() {
		Addition obj = new Addition(3, 2);
		assertFalse(obj.equals(new Addition(3, 3)));
	}
	
	@Test
	public void testEqualsThis() {
		Addition obj = new Addition(3, 2);
		assertTrue(obj.equals(obj));
	}
	
	@Test(timeout=3000)
	public void testSlowPrint() {
		Addition obj = new Addition(3, 2);
		obj.slowPrint();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowAnException() {
		Addition obj = new Addition(3, 2);
		obj.throwsAnException();
	}
	
}
