package entites2;

import javax.sound.midi.VoiceStatus;

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
    	this.AdressePostale = adresse;
    	
    	
    }
    
    //methode afficher majuscule
    public void nomEtPrenom() {
    	System.out.println(nom.toUpperCase()+ " " + prenom.toUpperCase());
    }
    
    //Dans la classe Personne, ajoutez une méthode qui prend un argument en paramètre 
    //et permet de modifier la variable d’instance nom de Personne.
    public void modifNom(String nom) {
    	this.nom = nom;
    }
    
    //Dans la classe Personne, ajoutez une méthode similaire pour modifier le prénom.
    public void modifPrenom(String prenom) {
    	this.prenom = prenom;
    }
    
    //Dans la classe Personne, ajoutez une méthode similaire pour modifier l’adresse.
    public void modifAdresse(AdressePostale adresse) {
    	
    	this.AdressePostale = adresse;
    }
    
    //Dans la classe Personne, ajoutez une méthode qui retourne le nom.
    public String returName() {	return nom; }
    
    //Dans la classe Personne, ajoutez une méthode qui retourne le prénom.
    public String returnPrenom() { return prenom;}
    
    //Dans la classe Personne, ajoutez une méthode qui retourne l’adresse.
    public AdressePostale returnAdresse() {return AdressePostale};
    
    
}
