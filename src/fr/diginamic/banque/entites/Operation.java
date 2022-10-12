package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String dateOperation;
	private double montantOperation;
	
	//constructor
	public Operation(String dateOperation, double montantOperation) {
		// TODO Auto-generated constructor stub
		super();
		
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}  

	//methode toString
	public String toString() {
		return "la date de l'operation est " + dateOperation + " le montant est de " + montantOperation +" $";
	}
	
	
	
	//methode abstract getType()
	public abstract String getType();
	
	
	 //getters et setters
	 
	 public String getDateOperation() {
		return dateOperation;
	}
	 
	 public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	 
	 public double getMontantOperation() {
		return  montantOperation;
	}
	 
	 public void setMontantOperation(int montantOperation) {
		this.montantOperation = montantOperation;
	}
}
