package sampleJUnit.telephone;

public class Telephone {
	
	private Etat etat;
	
	public Telephone() {
		this.etat = Etat.Repos;
	}
	
	// repos --> sonnerie
	public void appelEntrant() {
		if (this.getEtat().equals(Etat.Repos)) {
			this.setEtat(Etat.Sonnerie);
		}
	}
	
	// repos --> decroche
	// sonnerie --> enConversation
	public void decrocher() {
		if (this.getEtat().equals(Etat.Repos)) {
			this.setEtat(Etat.Decroche);
		}
		else if (this.getEtat().equals(Etat.Sonnerie)) {
			this.setEtat(Etat.EnConversation);
		}
	}
	
	// decroche --> repos
	// EnAppel --> Repos
	// EnConversation --> Repos
	public void raccrocher() {
		if (this.getEtat().equals(Etat.Decroche)) {
			this.setEtat(Etat.Repos);
		}
		else if (this.getEtat().equals(Etat.EnAppel)) {
			this.setEtat(Etat.Repos);
		}
		else if (this.getEtat().equals(Etat.EnConversation)) {
			this.setEtat(Etat.Repos);
		}
	}
	
	// decroche --> enAppel
	public void numeroter() {
		if (this.getEtat().equals(Etat.Decroche)) {
			this.setEtat(Etat.EnAppel);
		}
	}
	
	// enAppel --> enConversation
	public void correspondantDecroche() {
		if (this.getEtat().equals(Etat.EnAppel)) {
			this.setEtat(Etat.EnConversation);
		}
	}
	
	// EnConversation --> Decroche
	public void correspondantRaccroche() {
		if (this.getEtat().equals(Etat.EnConversation)) {
			this.setEtat(Etat.Decroche);
		}
	}
	
	// sonnerie --> repos
	// enAppel --> decroche
	public void timeOut() {
		if (this.getEtat().equals(Etat.Sonnerie)) {
			this.setEtat(Etat.Repos);
		}
		else if (this.getEtat().equals(Etat.EnAppel)) {
			this.setEtat(Etat.Decroche);
		}
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	
}
