package fr.nantes.imie.cdi13.tpInjection.exo2.injector;

import fr.nantes.imie.cdi13.tpInjection.exo2.consumer.Consumer;
import fr.nantes.imie.cdi13.tpInjection.exo2.consumer.MonApplicationService;
import fr.nantes.imie.cdi13.tpInjection.exo2.service.SMSServiceImp;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MonApplicationService(new SMSServiceImp());
	}

}
