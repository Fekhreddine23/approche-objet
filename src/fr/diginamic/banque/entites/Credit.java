package fr.diginamic.banque.entites;

public class Credit extends Operation {

	
	
	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "credit";
	}
	
	
	// setters et getters pas besoin de les redéclarés dans les classes filles
}
