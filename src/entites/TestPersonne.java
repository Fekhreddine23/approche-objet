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
		pers1.modifAdresse(adresse1);
		
		
		String identite = pers1.nomEtPrenom();
		System.out.println(identite);
		
		
		pers1.modifNom("popo");
		
		String nom = pers1.returName();
		System.out.println(nom);
		
		//pers1.adresse = new AdressePostale();
		/*pers1.nom = "toto";
		pers1.prenom = "coco";
		
		pers1.adresse.numeroRue = 5;
		pers1.adresse.libelleRue = "rue";
		pers1.adresse.codePostal = 56000;
		pers1.adresse.ville = "56000;**/
		
		
		
		
		
		Personne pers2 = new Personne("momo","koko",adresse2);
		pers2.modifAdresse(adresse2);
		
		/*pers2.nom = "momo";
		pers2.prenom = "koko";
		pers2.adresse = new AdressePostale();
		pers2.adresse.numeroRue = 9;
		pers2.adresse.libelleRue = "avenue";
		pers2.adresse.codePostal = 84000;
		pers2.adresse.ville = "avignon";**/
		
		
	
		

	}

}
