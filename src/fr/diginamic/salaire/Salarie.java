package fr.diginamic.salaire;


//Exercice CalculSalaire
public class Salarie extends Intervenant{
	
	//montant du salaire mensuel
	private double montantSalaireMensuel;
	
	//constructor
		public Salarie(String nom, String prenom, double montantSalaireMensuel) {
			
			super(nom,prenom);
			
		    this.montantSalaireMensuel = montantSalaireMensuel;
			
		}

		@Override
		public  double getSalaire() {
			// TODO Auto-generated method stub
			return montantSalaireMensuel;
		}
		
		public  String getStatut() {
			return "Salarie";
		}

		public double getMontantSalaireMensuel() {
			return montantSalaireMensuel;
		}

		public void setMontantSalaireMensuel(double montantSalaireMensuel) {
			this.montantSalaireMensuel = montantSalaireMensuel;
		}

}
