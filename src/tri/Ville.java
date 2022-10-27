package tri;

public class Ville implements Comparable<Ville>{
	
	 

	 
		
		//Créez une classe Ville possédant 2 attributs : nom, nb d’habitants.
		private String nom;
		private int nombreHabitant;
		
		//constructor
		public  Ville(String nom, int nombreHabitant) {
			this.nom = nom;
			this.nombreHabitant = nombreHabitant;
		}
	    
		//faire la methode compareTo
		public int compareTo(Ville ville2) {
			if(this.nombreHabitant > ville2.getNombreHabitant()) {
				return 1;
			}else if (this.nombreHabitant < ville2.getNombreHabitant()){
				return -1;
			}else {
				return 0;
			}
		}
		
		

		
		
		
		
		
		
		
		
		
		//FAIRE la methode to string
		public String toString() {
			   return "[Nom : " + nom + "| nombre habitants : " + nombreHabitant + "],";
				   
			}
		
		//getter et setters
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getNombreHabitant() {
			return nombreHabitant;
		}

		public void setNombreHabitant(int nombreHabitant) {
			this.nombreHabitant = nombreHabitant;
		}


		
	}


