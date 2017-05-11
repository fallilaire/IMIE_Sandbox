package sampleJUnit.telephoneStatePattern;

public class EtatTelephoneEnConversation extends EtatTelephone {

	public EtatTelephoneEnConversation(Telephone telephone) {
		super(telephone);
	}
	
	@Override
	public void appelEntrant() {
	}

	@Override
	public void decrocher() {
	}

	//	EnConversation	Raccrocher	Repos
	@Override
	public void raccrocher() {
		this.getTelephone().setEtat(new EtatTelephoneRepos(this.getTelephone()));
	}

	@Override
	public void numeroter() {
	}

	@Override
	public void correspondantDecroche() {
	}

	@Override
	public void correspondantRaccroche() {
		this.getTelephone().setEtat(new EtatTelephoneDecroche(this.getTelephone()));
	}

	@Override
	public void timeOut() {
	}

}
