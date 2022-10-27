package entites;

public class Salarie {
	
	private String nom;
	private String prenom;
	private double salaire;
	
	/**Créez une classe Salarie dans le package entites avec 3 attributs
	a. nom : String
	b. prenom : String
	c. salaire : double
	
	**/
       //faire le constructor
	public Salarie(String nom, String prenom, double salaire) {
		// TODO Auto-generated constructor stub
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		//this.salaire = salaire;
	} 
	
	
	
	@Override
	public String toString() {
		return "Salarie [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
	
	//getters et setters
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	} 


}
