package sandBoxJava.junit;

public class Addition {
	
	private long op1;
	private long op2;

	public Addition(long op1, long op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public long calculer() {
		return this.op1 + this.op2;
	}
	
	public String lireSymbole() {
		return "+";
	}
	
	@Override
	public String toString() {
		return "Addition";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof Addition)) {
			return false;
		}
		
		if (this.calculer() == ((Addition)obj).calculer()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void slowPrint() {
		System.out.println("Hello");
		try {
			Thread.sleep((long)2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Good Bye");
	}
	
	public void throwsAnException() {
		throw new IllegalArgumentException("Random Exception");
	}
	
}
