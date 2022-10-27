package fr.diginamic.operations;




public class CalculMoyenne {
	
	//Cette classe a un attribut d’instance de type tableau de double.
	private double[] tableau = new double [9];

	//Cette classe a également une méthode ajout qui permet d’ajouter un double au tableau. 
		//Vous aurez besoin de gérer l’agrandissement du tableau
	public double[]  ajout(double b) {
		
		
		//cree un new tableau2 avec le mot new double + 1 valeur
		double[] tableau2 = new double[tableau.length + 1];
		
		//boucle a travers tableau et injecte dans tab2
		for(int i = 0; i < tableau.length - 1; i++) {
			 tableau2[i] = tableau[i];
			//rajout au nouveau tableau tableau2 une nouvelle valeur
				tableau2[tableau.length - 1] =  b;
		}
		
		//return le nouveau tableau2
		return tableau2;
		
	}
	
	//Enfin cette classe a une méthode calcul qui ne prend pas de paramètre 
	//et retourne la moyenne des éléments du tableau.
	public double calcul() {
	
	      int somme = 0;
	      for(int i = 0; i < tableau.length ; i++){
	         somme += tableau[i];
	      }
	      return somme / tableau.length; 
	}
	
}
