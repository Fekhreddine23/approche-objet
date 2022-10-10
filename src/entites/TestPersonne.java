package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne pers1 = new Personne();
		pers1.nom = "toto";
		pers1.prenom = "coco";
		pers1.adresse.numeroRue = 5;
		pers1.adresse.libelleRue = "rue";
		pers1.adresse.codePostal = 56000;
		pers1.adresse.ville = "paris";
		
		
		Personne pers2 = new Personne();
		pers2.nom = "momo";
		pers2.prenom = "koko";
		pers2.adresse.numeroRue = 9;
		pers2.adresse.libelleRue = "avenue";
		pers2.adresse.codePostal = 84000;
		pers2.adresse.ville = "avignon";
		

	}

}
