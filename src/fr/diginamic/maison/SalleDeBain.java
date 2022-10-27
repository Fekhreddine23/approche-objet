package fr.diginamic.maison;

public class SalleDeBain extends Piece{

	public SalleDeBain(double superficie, int numEtage) {
		super(superficie, numEtage);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE_CHAMBRE;
	}

}
