package fr.nantes.imie.cdi13.tpInjection.exo2.consumer;

import fr.nantes.imie.cdi13.tpInjection.exo2.service.EnvoiMessageService;

public class MonApplicationService implements Consumer {

	private EnvoiMessageService envoiMessageService;

	public MonApplicationService(EnvoiMessageService envoiMessageService) {
		super();
		this.envoiMessageService = envoiMessageService;
	}

	@Override
	public void processMessages(String msg, String rec) {
		this.envoiMessageService.envoiMessage(msg, rec);
	}

}
