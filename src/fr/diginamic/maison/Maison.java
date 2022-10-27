package fr.diginamic.maison;

public class Maison {
	
	//La classe Maison va représenter une maison avec un unique attribut : 
	//un tableau d’objets de type Piece.
	private Piece[] piece;
	
	
	//constructeur
	public Maison() {
		piece = new Piece[0];
	}
	
	
	
	//cette classe possède une méthode ajouterPiece(Piece piece) 
	//qui permet d’ajouter une pièce à la maison.
	public void ajoutPiece(Piece newPiece) {
		 
		
		//on creer un newTab avec longueur du tab piece +1
		 Piece[] newTab = new Piece[piece.length + 1];
		 
		 //on boucle sur le tableau piece et rajout newTab
		 for(int i = 0; i < piece.length; i++) {
			 newTab[i] = piece[i];
		 }
		 
		// On place en dernière position dans le nouveau tableau la nouvelle
			// pièce
			newTab[newTab.length-1]=newPiece;
		
			// Enfin on affecte newTab à piece
			this.piece=newTab;	
			
		}
		
		
		//methode superficieTotal
		public double getSuperficieTotal()
		{
			double total = 0;
			
			for (Piece p : piece)
			{
				total += p.getSuperficie();
			}
			
			return total;
		
		
	}
		
		
		//methode superficieParEtage
		public double getSuperficieParEtage(int numEtage)
		{
			double total = 0;
			
			for (int i = 0; i < piece.length; i++)
			{
				if (numEtage == this.piece[i].getNumEtage()) {
					
					total += this.piece[i].getSuperficie();
					
				}
					
			}
			
			return total;
		}
		
		/**methode superficieTypePiece
		* @param typePiece type de pièce
		 * @return double
		 */
		public double getSuperficieTypePiece(String type) {
			double total = 0;
			
			for (int i = 0; i < piece.length; i++) {
				if (type!=null && type.equals(this.piece[i].getType())) {
					total = total + this.piece[i].getSuperficie();
				}
			}
			return total;
		}
         //Methode calculerSurface
		///** Retourne la surface totale
		 //@return double
		public double calculerSurface() {
			double total = 0;

			for (int i = 0; i < piece.length; i++) {
				total = total + this.piece[i].getSuperficie();
			}

			return total;
		}

	public Piece[] getPiece() {
		return piece;
	}



	public void setPiece(Piece[] piece) {
		this.piece = piece;
	}

}
