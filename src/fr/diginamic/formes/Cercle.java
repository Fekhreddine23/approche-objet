package fr.diginamic.formes;

public class Cercle extends Form{
	
	private double rayon;
	//constructor
	public Cercle (double rayon) {
		super();
		this.rayon = rayon;
		
	}
	//faire une methode de type toString()
	@Override
	public String toString() {
		return "Cercle " + rayon ;
	}
	
	 @Override
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}
	
	//methode qui renvoi la surface su cercle
	 @Override
	public double calculerSurface() {
		return Math.PI * rayon * rayon;
	}
	
	//getters et setters
	public double getRayon() {
		return rayon;
	}

}
