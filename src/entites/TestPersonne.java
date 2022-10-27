package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//instancier new adresse de la class AdressePostale
		AdressePostale adresse1 = new AdressePostale(28, "rue", 30000, "Nimes");
		
		AdressePostale adresse2 = new AdressePostale(34, "route",34000, "Montpellier");
		
		//Modifiez la classe TestPersonne afin d’utiliser le second constructeur de la classe Personne
		//Ajoutez un second constructeur à la classe Personne avec les 3 paramètres 
		//permettant de valoriser les attributs nom, prenom et adresse.
		
		Personne pers1 = new Personne("toto","coco");
		pers1.adresse = adresse1;
		pers1.setAdresse(adresse1);
		
		
		String identite = pers1.nomEtPrenom();
		System.out.println(identite);
		
		//modifie le nom
		pers1.setNom("popo");
		
		String nom = pers1.returName();
		System.out.println(nom);
		
		
		
		
		
		
		
		Personne pers2 = new Personne("momo","koko",adresse2);
		pers2.setAdresse(adresse2); //modifie l'adresse
		
		
		
		
	
		

	}

}
