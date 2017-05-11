package sampleJUnit.telephoneStatePattern;

public class EtatTelephoneSonnerie extends EtatTelephone {

	
	public EtatTelephoneSonnerie(Telephone telephone) {
		super(telephone);
	}

	@Override
	public void appelEntrant() {
	}

	@Override
	public void decrocher() {
		this.getTelephone().setEtat(new EtatTelephoneEnConversation(this.getTelephone()));
	}

	@Override
	public void raccrocher() {
	}

	@Override
	public void numeroter() {
	}

	@Override
	public void correspondantDecroche() {
	}

	@Override
	public void correspondantRaccroche() {
	}
	
	@Override
	public void timeOut() {
		this.getTelephone().setEtat(new EtatTelephoneRepos(this.getTelephone()));
	}

}
