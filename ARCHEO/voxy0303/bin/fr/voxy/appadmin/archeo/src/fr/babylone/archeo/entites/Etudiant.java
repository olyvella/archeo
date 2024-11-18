package fr.babylone.archeo.entites;

public class Etudiant extends Archeologue {

	private int numero ; 
	private String nom ; 
	private String prenom ;
	
	private AnneEtude anne ; 
	
	
	public Etudiant(int numero, String nom, String prenom, int numero2, String nom2, String prenom2, AnneEtude anne) {
		super(numero, nom, prenom);
		numero = numero2;
		nom = nom2;
		prenom = prenom2;
		this.anne = anne;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Etudiant [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", anne=" + anne + "]";
	}
	
	
	
	
	

}
