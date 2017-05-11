package fr.nantes.imie.cdi13.tpInjection.exo1;

public class EmailService {

	public void sendMail(String txt, String rec) {
		System.out.println("Email send to " + rec + " with message " + txt);
	}

}
