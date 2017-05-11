package cdi13Mock.exoCalculatrice;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalcTest {
	
	private class CalcStub extends Calc {
		
		protected void setEngine(Engine pEngine) {
			super.setEngine(pEngine);
		}
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testScenario1() {
		Engine engineMock = Mockito.mock(Engine.class);
		Mockito.when(engineMock.setCarac("1")).thenReturn(true);
		Mockito.when(engineMock.setCarac("2")).thenReturn(true);
		Mockito.when(engineMock.setCarac("E")).thenReturn(false);
		Mockito.when(engineMock.getAffichage()).thenReturn("1");
		
		Calc calc = new CalcStub();
		calc.setEngine(engineMock);
		
		calc.appuieTouche("1");
		assertEquals("1", calc.lireAffichage());
		
		calc.appuieTouche("E");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("1");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("2");
		assertEquals("ERREUR", calc.lireAffichage());
		
		Mockito.verify(engineMock, Mockito.atLeast(1)).setCarac(Mockito.anyString());
		Mockito.verify(engineMock, Mockito.times(1)).setCarac("1");
		Mockito.verify(engineMock, Mockito.times(1)).setCarac("E");
		
		Mockito.verify(engineMock, Mockito.times(1)).getAffichage();
		
	}
	
	@Test
	public void testScenario2() {
		Engine engineMock = Mockito.mock(Engine.class);
		Mockito.when(engineMock.setCarac("1")).thenReturn(true);
		Mockito.when(engineMock.setCarac("2")).thenReturn(true);
		Mockito.when(engineMock.setCarac("E")).thenReturn(false);
		Mockito.when(engineMock.getAffichage()).thenReturn("1").thenReturn("12");
		
		Calc calc = new CalcStub();
		calc.setEngine(engineMock);
		
		calc.appuieTouche("1");
		assertEquals("1", calc.lireAffichage());
				
		calc.appuieTouche("2");
		assertEquals("12", calc.lireAffichage());
		
		calc.appuieTouche("E");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("1");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("2");
		assertEquals("ERREUR", calc.lireAffichage());
		
		Mockito.verify(engineMock, Mockito.atLeast(1)).setCarac(Mockito.anyString());
		Mockito.verify(engineMock, Mockito.times(1)).setCarac("1");
		Mockito.verify(engineMock, Mockito.times(1)).setCarac("2");
		Mockito.verify(engineMock, Mockito.times(1)).setCarac("E");
		
		Mockito.verify(engineMock, Mockito.times(2)).getAffichage();
		
	}
	
	@Test
	public void testScenario3() {
		Engine engineMock = Mockito.mock(Engine.class);
		Mockito.when(engineMock.setCarac("1")).thenReturn(true);
		Mockito.when(engineMock.setCarac("2")).thenReturn(true);
		Mockito.when(engineMock.setCarac("E")).thenReturn(false);
		Mockito.when(engineMock.getAffichage()).thenReturn("1").thenReturn("12");
		
		Calc calc = new CalcStub();
		calc.setEngine(engineMock);
		
		calc.appuieTouche("1");
		assertEquals("1", calc.lireAffichage());
				
		calc.appuieTouche("2");
		assertEquals("12", calc.lireAffichage());
		
		calc.appuieTouche("E");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("1");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("2");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("E");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.reset();
		
		Mockito.when(engineMock.getAffichage()).thenReturn("1").thenReturn("12");
		
		calc.appuieTouche("1");
		assertEquals("1", calc.lireAffichage());
				
		calc.appuieTouche("2");
		assertEquals("12", calc.lireAffichage());
		
		calc.appuieTouche("E");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("1");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("2");
		assertEquals("ERREUR", calc.lireAffichage());
		
		calc.appuieTouche("E");
		assertEquals("ERREUR", calc.lireAffichage());
		
		Mockito.verify(engineMock, Mockito.atLeast(1)).setCarac(Mockito.anyString());
		Mockito.verify(engineMock, Mockito.times(2)).setCarac("1");
		Mockito.verify(engineMock, Mockito.times(2)).setCarac("2");
		Mockito.verify(engineMock, Mockito.times(2)).setCarac("E");
		
		Mockito.verify(engineMock, Mockito.times(4)).getAffichage();
		
	}

}
