package entites2;

import entites.AdressePostale;

public class Personne {

	
	public String nom;
	public String prenom;
    public AdressePostale adresse;
	
			
	//constructor
    
    public Personne(String nom1, String prenom1) {
    	
    	nom = nom1;
    	prenom = prenom1;
    	
    	
    }
    
    //2 constructor
    public Personne(String nom2, String prenom2, AdressePostale adresse2) {
    	
    	
    	nom = nom2;
    	prenom = prenom2;
    	adresse = adresse2;
    	
    	
    }
}
