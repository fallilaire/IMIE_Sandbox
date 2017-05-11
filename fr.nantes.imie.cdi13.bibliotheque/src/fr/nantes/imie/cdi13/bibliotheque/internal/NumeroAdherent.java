package fr.nantes.imie.cdi13.bibliotheque.internal;

public class NumeroAdherent {

	private static Integer indice = new Integer(0);
	
	private NumeroAdherent() {
	}

	/** Holder */
	private static class SingletonHolder {
		/** Instance unique non préinitialisée */
		private final static NumeroAdherent instance = new NumeroAdherent();
	}

	/** Point d'accès pour l'instance unique du singleton */
	public static NumeroAdherent getInstance() {
		return SingletonHolder.instance;
	}
	
	public Integer createNewIndice() {
		return indice++;
	}
	
}
