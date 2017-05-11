package fr.nantes.imie.cdi13.tpInjection.exo2.client;

import fr.nantes.imie.cdi13.tpInjection.exo2.consumer.Consumer;
import fr.nantes.imie.cdi13.tpInjection.exo2.injector.EmailServiceInjector;
import fr.nantes.imie.cdi13.tpInjection.exo2.injector.FacebookMessageServiceInjector;
import fr.nantes.imie.cdi13.tpInjection.exo2.injector.MessageServiceInjector;
import fr.nantes.imie.cdi13.tpInjection.exo2.injector.SMSServiceInjector;

public class MonClient {

	public static void main(String[] args) {

		String msg = "Hello You!";
		String email = "babar@imie.com";
		String phone = "0680706050";
		String messanger = "Poke poke";
		MessageServiceInjector injector = null;
		Consumer app = null;

		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);

		// Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);

		// Send FacebookMessafe
		injector = new FacebookMessageServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, messanger);

	}

}
