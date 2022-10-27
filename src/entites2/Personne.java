package entites2;

 

import entites.AdressePostale;

public class Personne {

	//initialisation variables
	public String nom;
	public String prenom;
    public AdressePostale adresse;
	
			
	 
    
    //le constructor
    public Personne(String nom1, String prenom1) {
    	this.nom = nom1;
    	this.prenom = prenom1;
    	
    }
    
    
 // 2 constructor
    public Personne(String nom2, String prenom2, AdressePostale adresse) {
    	
    	
    	this.nom = nom2;
    	this.prenom = prenom2;
    	this.adresse = adresse;
    	
    	
    }
    
    //methode afficher majuscule
    public String nomEtPrenom() {
    	return nom.toUpperCase()+ " " + prenom.toUpperCase();
    }
    
    //Dans la classe Personne, ajoutez une méthode qui prend un argument en paramètre 
    //et permet de modifier la variable d’instance nom de Personne.
    public void setNom(String nvNom) {
    	this.nom = nvNom;
    }
    
    //Dans la classe Personne, ajoutez une méthode similaire pour modifier le prénom.
    public void setPrenom(String nvPrenom) {
    	this.prenom = nvPrenom;
    }
    
    //Dans la classe Personne, ajoutez une méthode similaire pour modifier l’adresse.
    public void setAdresse(AdressePostale NvAdresse) {
    	
    	this.adresse = NvAdresse;
    }
    
    //Dans la classe Personne, ajoutez une méthode qui retourne le nom.
    public String returName() {	return this.nom; }
    
    //Dans la classe Personne, ajoutez une méthode qui retourne le prénom.
    public String returnPrenom() { return this.prenom;}
    
    //Dans la classe Personne, ajoutez une méthode qui retourne l’adresse.
    public AdressePostale returnAdresse() {return this.adresse;}
    
    
}
