package cdi13Mock;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class UserTest {

	@Test
	public void test1() {
		User oUser = new User();
		oUser.setLogin("Bob");
		assertEquals("Bob", oUser.getLogin());
	}
	
	@Test
	public void testMock1() {
		User oUserMock = Mockito.mock(User.class);
		oUserMock.setLogin("Bob");
		assertNull(oUserMock.getLogin());
	}
	
	@Test
	public void testMockWhen() {
		User oUserMock = Mockito.mock(User.class);
		// Redefinition du comportement de la méthode getLogin()
		Mockito.when(oUserMock.getLogin()).thenReturn("Marley");
		
		oUserMock.setLogin("Bob");
		assertEquals("Marley", oUserMock.getLogin());
		
		oUserMock.setLogin("Maurice");
		assertEquals("Marley", oUserMock.getLogin());
	}
	
	@Test
	public void testMockWhenCallRealMethod() {
		User oUserMock = Mockito.mock(User.class);
		
		Mockito.when(oUserMock.getLogin()).thenCallRealMethod();
		Mockito.doCallRealMethod().when(oUserMock).setLogin("Bob");
		
		oUserMock.setLogin("Bob");
		assertEquals("Bob", oUserMock.getLogin());
		
		oUserMock.setLogin("Maurice");
		assertEquals("Bob", oUserMock.getLogin());
	}
	
	@Test
	public void testSpy() {
		
		// Creation d'un objet normal
		User userNormal = new User();
		// Utilisation des méthodes normales
		userNormal.setLogin("Bob");
		assertEquals("Bob", userNormal.getLogin());
		
		// Spy d'un objet reel
		User userSpy = Mockito.spy(userNormal);
		// Verification de l'utilisation des methodes reelles
		userSpy.setLogin("Marley");
		assertEquals("Marley", userSpy.getLogin());
		
		// Mock de getLogin
		Mockito.when(userSpy.getLogin()).thenReturn("Bob");
		userSpy.setLogin("Marley");
		// Verification de l'appel du mock
		assertEquals("Bob", userSpy.getLogin());
		
	}
	
	
	@Test
	public void testVerify() {
		User user = Mockito.mock(User.class);
		user.setLogin("Bob");
		assertNull(user.getLogin());
		
		Mockito.verify(user, Mockito.times(1)).getLogin(); // Verification de l'appel de getLogin()
		
		Mockito.verify(user, Mockito.times(1)).setLogin("Bob"); // Verification de l'appel de setLogin avec un param
		Mockito.verify(user, Mockito.never()).setLogin("Marley");
		
		Mockito.verify(user, Mockito.atLeastOnce()).setLogin(Mockito.anyString());
	}
	
	@Test
	public void testVerifySpy() {
		User user = Mockito.spy(new User());
		user.setLogin("Bob");
		assertEquals("Bob", user.getLogin());
		
		Mockito.verify(user, Mockito.times(1)).getLogin(); // Verification de l'appel de getLogin()
		
		Mockito.verify(user, Mockito.times(1)).setLogin("Bob"); // Verification de l'appel de setLogin avec un param
		Mockito.verify(user, Mockito.never()).setLogin("Marley");
		
		Mockito.verify(user, Mockito.atLeastOnce()).setLogin(Mockito.anyString());
	}
}
