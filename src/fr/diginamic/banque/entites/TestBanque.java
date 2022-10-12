package fr.diginamic.banque.entites;

public class TestBanque {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instance de compte dans la variable soldeNouveau1
		//Compte soldeNouveau1 = new Compte(23,54);
		//dans la console un retour de chiffres 
		//System.out.println(soldeNouveau1.toString());
		
		
		// tp7
		Compte compte1 = new Compte(456, 563.5);
		System.out.println(compte1);
		
		
		//tableau de compte herite de class Compte
		// dans la variable tableau de tableDeComptes
		Compte[] tableDeComptes = new Compte[2];
		tableDeComptes[0] = new Compte(456, 235.5);
		tableDeComptes[1] = new CompteTaux(457, 256, 3.56);
		
		
		//boucle sur compte
		for(Compte compteInfo : tableDeComptes) {
			System.out.println("Informations des " + compteInfo);
			
		}
	}

	 

}
