package fr.diginamic.maison;

public abstract class Piece {
	
	//la superficie
		// le numéro de l’étage.
		private double superficie;
		private int numEtage;
		
		
		
    //CONSTANTES qui ne bouge pas 
		/** TYPE_CHAMBRE : String*/
		public static final String TYPE_CHAMBRE = "Chambre";

		/** TYPE_SALON : String*/
		public static final String TYPE_SALON = "Salon";
		
		/** TYPE_CUISINE : String*/
		public static final String TYPE_CUISINE = "Cuisine";
		
		/** TYPE_CUISINE : String*/
		public static final String TYPE_WC = "WC";
		
		/** TYPE_CUISINE : String*/
		public static final String TYPE_SDB = "Salle de bain";
	
	//constructor
	public Piece(double superficie, int numEtage) {
		super();
		this.superficie = superficie;
		this.numEtage = numEtage;
	}
	
	///** Retourne le type de la pièce
	//methode abstract
	public abstract String getType();
		 

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}

	@Override
	public String toString() {
		return "Piece [superficie=" + superficie + ", numEtage=" + numEtage + "]";
	}

	
	

}
