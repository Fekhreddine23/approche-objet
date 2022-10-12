package fr.diginamic.banque.entites;

 

public class CompteTaux extends Compte{
    
	//instancie la variable txderemuneration
	private double tauxDeRemuneration = 3.56;
    
	
	//constructor
	public CompteTaux(int numeroDeCompte, int soldeDeCompte, double tauxDeRemuneration) {
		//super =commun a la classe compte
		super(numeroDeCompte, soldeDeCompte);
		// TODO Auto-generated constructor stub
		
		this.tauxDeRemuneration = tauxDeRemuneration;
	}
	
	//Methode toString
	@Override
	public String toString() {
		return super.toString()+" le taux est " + tauxDeRemuneration;
	}
	
	

}
