package listes;

public class TestEquals {

	public TestEquals() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//
		
		Ville v1 = new Ville("Montpellier", 450000, null);
		Ville v2 = new Ville("Montpellier", 450000, null);
		
		
		//teste la methode equals qui a etaite redefini dans la class Ville
		 
		    boolean isSame = (v1 == v2); //NE JAMAIS METTRE == sur des instances objets.
		    System.out.println(isSame);
		    
		    boolean isEqual = (v1.equals(v2));
		    System.out.println(isEqual);

	}

}
