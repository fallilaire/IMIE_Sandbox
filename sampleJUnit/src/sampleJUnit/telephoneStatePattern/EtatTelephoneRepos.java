package sampleJUnit.telephoneStatePattern;

public class EtatTelephoneRepos extends EtatTelephone {

	
	public EtatTelephoneRepos(Telephone telephone) {
		super(telephone);
	}

	@Override
	public void appelEntrant() {
		this.getTelephone().setEtat(new EtatTelephoneSonnerie(this.getTelephone()));
	}

	@Override
	public void decrocher() {
		this.getTelephone().setEtat(new EtatTelephoneDecroche(this.getTelephone()));
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

	}

}
