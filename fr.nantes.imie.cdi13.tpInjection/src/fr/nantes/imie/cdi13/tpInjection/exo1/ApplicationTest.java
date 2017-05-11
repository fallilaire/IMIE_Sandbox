package fr.nantes.imie.cdi13.tpInjection.exo1;

public class ApplicationTest {

	public static void main(String[] args) {
		MonApplicationService application = new MonApplicationService();
		application.processMessages("Hello", "test@imie.com");
	}

}
