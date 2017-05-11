package sampleJUnit.telephoneStatePattern;

public class EtatTelephoneEnAppel extends EtatTelephone {

	public EtatTelephoneEnAppel(Telephone telephone) {
		super(telephone);
	}	

	
	@Override
	public void appelEntrant() {
	}

	@Override
	public void decrocher() {
	}

	@Override
	public void raccrocher() {
		this.getTelephone().setEtat(new EtatTelephoneRepos(this.getTelephone()));
	}

	@Override
	public void numeroter() {
	}

	@Override
	public void correspondantDecroche() {
		this.getTelephone().setEtat(new EtatTelephoneEnConversation(this.getTelephone()));
	}

	@Override
	public void correspondantRaccroche() {
	}

	@Override
	public void timeOut() {
		this.getTelephone().setEtat(new EtatTelephoneDecroche(this.getTelephone()));
	}

}
