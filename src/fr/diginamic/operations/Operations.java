package fr.diginamic.operations;



public class Operations {
	
	private double a;
	private double b;
	private char operateur;
	//methode de class calcul cette classe a une méthode de classe calcul qui prend en paramètre
	//2 double a et b
	//et un opérateur qui est de type char.
	public static double calcul(double a, double b, char operateur) {
		
				
		//o Si l’opérateur vaut ‘+’ alors la méthode calcul retourne a+b
		//o Si l’opérateur vaut ‘-‘ alors la méthode calcul retourne a-b
		//o Faites la même chose pour les opérateurs *et /
		switch (operateur) {
		case '+': {

			return a + b;
		}	
		case '-': {
			return a - b;
		}

		case '*':{
			return a * b;
		}


		case '/':{
			return a / b;
		}

		default:
			return 0;
		}
	}
	
	//getter
	public char getOperateur() {
		return operateur;
	}
	//setter
	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}
	
	// getter
	public double a() {
		return a;
	}
	
	//setter
	public void seta(double a) {
		this.a = a;
	}
	
	//getter
	public double b() {
		return b;
	}
	
	public void setb(double b) {
		this.b = b;
	}
	
}