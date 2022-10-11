package fr.diginamic.banque.entites;



public class Compte {
  
	private int numeroDeCompte;
	private int soldeDeCompte;
	
	
	//constructor pas de void dans le constructor 
	//et meme nom que la classe
	public  Compte (int numeroDeCompte, int soldeDeCompte) {
		
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDeCompte = soldeDeCompte;
	}
//methodes 
	
	public void afficherCompte() {
		System.out.println("votre numero est" + numeroDeCompte + "solde" + soldeDeCompte);
	}
	
	//get
	public int getnumeroDeCompte() { return numeroDeCompte; }
}
