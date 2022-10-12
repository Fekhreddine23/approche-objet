package fr.diginamic.banque.entites;

public class TestOperation  {

	
	public static void main(String [] args) {
		
		Operation[] tableOperations = new Operation[4];
		
		tableOperations[0] = new Debit("05/12/1896",56.35);
		tableOperations[1] = new Credit("24/05/2022",45.12);
		tableOperations[2] = new Debit("17/07/1965", 63.80);
		tableOperations[3] = new Credit("12/03/1896", 78.27);
		
		//boucle
		
		for(Operation compteOperation : tableOperations) {
			System.out.println("infos des " + compteOperation + " " + compteOperation.getType());
		}
		//initialise la variable somme
		double montantOperation = 0;
		
		//2éme boucle pour faire le montant total de tableOperations
		
		for(Operation totalOperation : tableOperations) {
			
			if (totalOperation.getType().equals("credit")) {
				montantOperation +=  totalOperation.getMontantOperation();
				
			}else {
				montantOperation -= totalOperation.getMontantOperation();
			}
		}
		
		System.out.println("Le montant total des opérations est de : " + montantOperation);
		  
	}
	
}
