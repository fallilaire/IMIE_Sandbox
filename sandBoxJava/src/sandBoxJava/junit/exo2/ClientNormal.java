package sandBoxJava.junit.exo2;

public class ClientNormal extends Client {

	public ClientNormal(float enCours) {
		super(enCours);
	}

	@Override
	public boolean accepte(float montant) {
		// Normal_RG1
		if (this.enCours > 1000 && this.enCours < 3000 && montant > 5000) {
			return false;
		}
		// Normal_RG2
		else if (this.enCours > 3000 && montant > 1000) {
			return false;
		}
		else {
			return true;
		}
	}

}
