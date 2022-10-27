package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {
	
	public static void main(String args[]) {
		
		
		String chaine = "Durand;Marcel;2 523.5";
		
		
		//1) Utilisez la méthode charAt(int index) pour afficher le premier caractère de la chaine de caractères.
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		//2) Utilisez la méthode length() pour afficher la longueur de la chaine de caractères
		int longCaractere = chaine.length();
		System.out.println("longueur: " + longCaractere);
		
		
		//Utilisez la méthode indexOf(char c) pour afficher l’index du premier « ; » contenu dans la chaine de caractères.
		int premierePointVergule = chaine.indexOf(';');
		System.out.println("index ';' : " + premierePointVergule);
		
		
		//La méthode substring(int start, int end) permet d’extraire une portion de chaine de caractères comprise
		//entre un index de début (inclus) et un index de fin (exclu).
		
		String extractChaine = chaine.substring(0, chaine.indexOf(';'));
		System.out.println("chaine extraite " + extractChaine);
		
		
		//Combinez la méthode substring et indexOf pour extraire le nom de famille de la personne
		String nomFamille = chaine.substring(0, chaine.indexOf(';'));
		System.out.println("nom de famille est "+ nomFamille);
		
		//Utilisez la méthode toUpperCase() pour afficher le nom de famille en majuscules.
		String nomFamilleMaj = nomFamille.toUpperCase();
		System.out.println("nom de famille en MAJ "+ nomFamilleMaj);
		
		//6) Utilisez la méthode toLowerCase() pour afficher le nom de famille en minuscules.
		String nomFamilleMini = nomFamille.toLowerCase();
		System.out.println("nom de famille en mini "+ nomFamilleMini);
		
		
		//Utilisez la méthode split pour découper la chaine de caractères en morceaux. La méthode Le séparateur est le caractère « ; ».
		//Cette méthode retourne un tableau. Affichez le tableau ainsi obtenu.
		
		String[] tabString = chaine.split(";");
		
		for(String n : tabString) {
			System.out.println("decoupage en morceaux " + n);
		}
		
		/**
			A partir des 3 morceaux de chaine de caractères précédents, créez une instance de Salarie :
			a. Consigne : le nombre « 2 523.5» contient un espace qu’il faut supprimer en utilisant la méthode replace(String, String)
			de la classe String
			b. Astuce : pour transformer une chaine de caractères en double, 
			utilisez la méthode static de la classe Double : Double.parseDouble(String)
			**/
			Salarie salaire1 = new Salarie(tabString[0], tabString[1], Double.parseDouble(tabString[2].replace(" ", "")));
			System.out.println(salaire1);
	} 
    
} 
