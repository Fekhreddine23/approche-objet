package fr.diginamic.maison;

public class Salon extends Piece{

	public Salon(double superficie, int numEtage) {
		// TODO Auto-generated constructor stub
		super(superficie, numEtage);
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE_SALON;
	}

}
