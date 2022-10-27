package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Créer 2 instances d’AdressePostale en renseignant les valeurs de tous les attributs.
		
		AdressePostale adr1 = new AdressePostale(12, "rue", 30000, "Nimes");
		AdressePostale adr2 = new AdressePostale(12, "avenue", 34000, "Montpellier");
		
		System.out.println(adr1);
		System.out.println(adr2);
	}

}
