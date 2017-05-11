package fr.nantes.imie.cdi13.tpInjection.exo1;

public class MonApplicationService {

	private EmailService email = new EmailService();

	public void processMessages(String msg, String rec) {
		email.sendMail(msg, rec);
	}

}
