package fr.diginamic;

public class Cercle {
	
	private double rayon;
	//constructor
	public Cercle (double rayon) {
		
		this.rayon = rayon;
		
	}
	//faire une methode de type toString()
	@Override
	public String toString() {
		return "Cercle " + rayon ;
	}
	
	
	public double getPerimetre() {
		return 2 * Math.PI * rayon;
	}
	
	//methode qui renvoi la surface su cercle
	public double getSurface() {
		return Math.PI * rayon * rayon;
	}
	
	//getters et setters
	public double getRayon() {
		return rayon;
	}

}
