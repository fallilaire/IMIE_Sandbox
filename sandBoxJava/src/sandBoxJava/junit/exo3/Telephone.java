package sandBoxJava.junit.exo3;

public class Telephone {
	
	private Etat etat;
	
	public Telephone() {
		this.etat = Etat.Repos;
	}
	
	// repos --> sonnerie
	public void appelEntrant() {
		
	}
	
	// repos --> decroche
	// sonnerie --> enConversation
	public void decrocher() {
		
	}
	
	// decroche --> repos
	public void raccrocher() {
		
	}
	
	// decroche --> enAppel
	public void numeroter() {
		
	}
	
	// enAppel --> enConversation
	public void correspondantDecroche() {
		
	}
	
	// enConversation --> repos
	public void correspondantRaccroche() {
		
	}
	
	// sonnerie --> repos
	// enAppel --> decroche
	public void timeOut() {
		
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	
}
