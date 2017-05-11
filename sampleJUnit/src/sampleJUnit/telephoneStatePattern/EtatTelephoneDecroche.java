package sampleJUnit.telephoneStatePattern;

public class EtatTelephoneDecroche extends EtatTelephone {

	public EtatTelephoneDecroche(Telephone telephone) {
		super(telephone);
	}

	@Override
	public void appelEntrant() {
	}

	@Override
	public void decrocher() {
	}

	//Decroche	Raccrocher	Repos
	@Override
	public void raccrocher() {
		this.getTelephone().setEtat(new EtatTelephoneRepos(this.getTelephone()));
	}

	@Override
	public void numeroter() {
		this.getTelephone().setEtat(new EtatTelephoneEnAppel(this.getTelephone()));
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
