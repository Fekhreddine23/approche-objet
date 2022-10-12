package fr.diginamic.banque.entites;



public class Compte {
  
	private int numeroDeCompte;
	private double soldeDeCompte;
	
	
	//constructor pas de void dans le constructor 
	//et meme nom que la classe
	public  Compte (int numeroDeCompte, double soldeDeCompte) {
		
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDeCompte = soldeDeCompte;
	}
//methodes 
	
	//public Compte(int numeroDeCompte2, double soldeDeCompte2) {
		// TODO Auto-generated constructor stub
	//}

	public void afficherCompte() {
		System.out.println("votre numero est " + numeroDeCompte + " solde" + soldeDeCompte);
	}
	
	//methode toString()
	public String toString() {
		return "votre numero est " + numeroDeCompte + " solde " + soldeDeCompte;
		}
	
	//get
	public int getnumeroDeCompte() { return numeroDeCompte; }
	
	//set
	public int setnumeroDeCompte(int newnumeroDeCompte) {
		return this.numeroDeCompte = newnumeroDeCompte;
	}
}
