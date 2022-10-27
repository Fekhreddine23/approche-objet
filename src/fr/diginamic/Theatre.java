package fr.diginamic;

 
public class Theatre {
	
	
	/**cette classe a 4 attributs d’instance :
		▪ son nom
		▪ sa capacité max (en nb de personnes)
		▪ le total de clients inscrits
		▪ la recette totale de l’établissement
  **/
	
	private String nom;
	private int capaciteMax;
	private int totalClients;
	private int recetteTotal;
	
	//constructor
	public Theatre(String nom, int capaciteMax, int totalClients, int recetteTotal) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.totalClients = totalClients;
		this.recetteTotal = recetteTotal;
	
	}
	

	/**Dans la classe Theatre, créez une méthode inscrire qui prend en paramètres :
▪ le nombre de clients
▪ le prix de la place 

	 *Si la capacité max du théâtre n’est pas atteinte, 
	 *elle met à jour le nombre total de clients inscrits ainsi que la recette totale de l’établissement
	 *
	 **/

	public void inscrire(int nbrClient, int prixPlace) {
		
		if(capaciteMax == nbrClient + totalClients) {
			
			totalClients = totalClients + nbrClient;
			recetteTotal = nbrClient * prixPlace;
			
			
		}else {
			//elle affiche un message erreur
			System.out.println("Le theatre ne fait plus succès");
		}
	
	}
	
	
	//methode toString()
	@Override
		public String toString() {
			return "Le theatre a " + capaciteMax + "le total clients est " + totalClients +  "la recette est de  " + recetteTotal;
			}
	
	
	
	

// getters setters
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getCapaciteMax() {
		return capaciteMax;
	}


	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}


	public int getTotalClients() {
		return totalClients;
	}


	public void setTotalClients(int totalClients) {
		this.totalClients = totalClients;
	}


	public int getRecetteTotal() {
		return recetteTotal;
	}


	public void setRecetteTotal(int recetteTotal) {
		this.recetteTotal = recetteTotal;
	}
}
