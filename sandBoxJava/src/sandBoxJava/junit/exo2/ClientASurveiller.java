package sandBoxJava.junit.exo2;

public class ClientASurveiller extends Client {

	public ClientASurveiller(float enCours) {
		super(enCours);
	}

	@Override
	public boolean accepte(float montant) {
		// A_Surveiller_RG1
		if (this.enCours > 1000 && montant > 1000) {
			return false;
		}
		// A_Surveiller_RG2
		else if (montant > 5000) {
			return false;
		}
		else {
			return true;
		}
	}

}
