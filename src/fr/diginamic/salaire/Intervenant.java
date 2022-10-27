package fr.diginamic.salaire;

public abstract class Intervenant {
	
	//instancier les variables
	private String nom;
	private String prenom;
	
	//constructor
	public Intervenant(String nom, String prenom) {
		
		
		this.nom = nom;
	    this.prenom = prenom;
		
	}
	
	
	//methode getSalaire et getStatut
	
	//cette classe a une méthode abstraite getSalaire()
	public abstract double getSalaire();
	
	//methode abstract statut
	public abstract String getStatut();
	
	
	//methode toString
	public String toString() {
		return "Intervenant [nom=" + nom + ", prenom=" + prenom + ", status=" + getStatut() + ", salaire=" + getSalaire() + "]";
		 
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

}
