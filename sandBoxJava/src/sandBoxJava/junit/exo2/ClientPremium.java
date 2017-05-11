package sandBoxJava.junit.exo2;

public class ClientPremium extends Client {

	public ClientPremium(float enCours) {
		super(enCours);
	}

	@Override
	public boolean accepte(float montant) {
		// Premium_RG1
		if (this.enCours > 3000 && montant > 5000) {
			return false;
		}
		else {
			return true;
		}
	}

}
