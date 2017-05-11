package sandBoxJava.junit.exo2;

public abstract class Client {
	
	protected float enCours;
	
	public Client(float enCours) {
		this.enCours = enCours;
	}
	
	public abstract boolean accepte(final float montant);

}
