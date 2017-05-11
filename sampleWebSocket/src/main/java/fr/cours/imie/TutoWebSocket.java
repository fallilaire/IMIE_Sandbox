package fr.cours.imie;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/tuto")
public class TutoWebSocket {

	@OnOpen
	public void onOpen(Session session) {
		System.out.println(session.getId());
	}
	
	@OnClose
	public void onClose(Session session) {
		System.out.println(session.getId());
	}
	
	@OnMessage
	public void onMessage(String message) {
		System.out.println(message);
	}
	
}
