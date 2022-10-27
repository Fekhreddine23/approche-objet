package fr.diginamic.maison;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int numEtage) {
		// TODO Auto-generated constructor stub
		super(superficie, numEtage);
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE_CUISINE;
	}

}
