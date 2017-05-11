package sampleJUnit.telephoneStatePattern;

public abstract class EtatTelephone implements ITelephone {

	protected Telephone telephone;
	
	public EtatTelephone(Telephone telephone) {
		this.telephone = telephone;
	}
	
	public Telephone getTelephone() {
		return this.telephone;
	}
	
}
