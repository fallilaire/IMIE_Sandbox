package sampleJUnit.telephoneStatePattern;

public class Telephone implements ITelephone {
	
	private EtatTelephone etat;
	
	public Telephone() {
		this.etat = new EtatTelephoneRepos(this);
	}
	
	public void appelEntrant() {
		this.getEtat().appelEntrant();
	}
	
	public void decrocher() {
		this.getEtat().decrocher();
	}
	
	public void raccrocher() {
		this.getEtat().raccrocher();
	}
	
	public void numeroter() {
		this.getEtat().numeroter();
	}
	
	public void correspondantDecroche() {
		this.getEtat().correspondantDecroche();
	}
	
	public void correspondantRaccroche() {
		this.getEtat().correspondantRaccroche();
	}
	
	public void timeOut() {
		this.getEtat().timeOut();
	}

	public EtatTelephone getEtat() {
		return etat;
	}

	public void setEtat(EtatTelephone etat) {
		this.etat = etat;
	}

	
}
