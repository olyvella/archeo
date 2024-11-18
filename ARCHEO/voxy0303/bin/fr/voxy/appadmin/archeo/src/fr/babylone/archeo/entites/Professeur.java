package fr.babylone.archeo.entites;

public class Professeur extends Archeologue {
	
	static public int EC = 1 ; 
	static public int MC = 2 ; 
	
	private int corps ;
	
	public Professeur(int numero, String nom, String prenom, int corps) {
		super(numero, nom, prenom);
		this.corps = corps;
	}

	public static int getEC() {
		return EC;
	}

	public static void setEC(int eC) {
		EC = eC;
	}

	public static int getMC() {
		return MC;
	}

	public static void setMC(int mC) {
		MC = mC;
	}

	public int getCorps() {
		return corps;
	}

	public void setCorps(int corps) {
		this.corps = corps;
	}

	@Override
	public String toString() {
		return "Professeur [corps=" + corps + "]";
	}
	

	
	
	
}
