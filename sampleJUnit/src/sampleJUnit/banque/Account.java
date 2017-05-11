package sampleJUnit.banque;

public class Account {

	private int montant;
	private IWSBank wsBank;
	
	public Account() {
		wsBank = new WSBank();
		montant = 0;
	}
	
	public void debiter(int amount, String devise) {
		montant -= amount * this.wsBank.getRate(devise);
	}
	
	public void crediter(int amount, String devise) {
		montant += amount * this.wsBank.getRate(devise);
	}
	
	public int getSolde(String devise) {
		return this.montant * this.wsBank.getRate(devise);
	}
	
	public IWSBank getWsBank() {
		return wsBank;
	}

	public void setWsBank(IWSBank wsBank) {
		this.wsBank = wsBank;
	}
	
}
