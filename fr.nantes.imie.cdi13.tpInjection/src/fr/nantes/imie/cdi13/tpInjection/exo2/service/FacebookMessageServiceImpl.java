package fr.nantes.imie.cdi13.tpInjection.exo2.service;

public class FacebookMessageServiceImpl implements EnvoiMessageService {

	@Override
	public void envoiMessage(String msg, String rec) {
		System.out.println("Voici le message : " + msg + " venant de " + rec + " via FacebookMessage");

	}

}