package cdi13Mock.exoCalculatrice;

public class Calc {
	
	private boolean etat = true;
	private Engine engine = new Engine();

	public void appuieTouche(final String pCar) {
		if (etat) {
			this.etat = this.engine.setCarac(pCar);
		}
	}
	
	public String lireAffichage() {
		if (etat) {
			return this.engine.getAffichage();
		}
		else {
			return "ERREUR";
		}
	}
	
	public void reset() {
		this.etat = true;
	}
	
	protected void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
