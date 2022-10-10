package entites;

public class AdressePostale {
	
	//initialisation variable
	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	
	
	//constructor
	public AdressePostale(int num, String libelleRueString, int codePostalCh, String villes) {
		
	  this.numeroRue = num;
	  this.libelleRue = libelleRueString;
	  this.codePostal = codePostalCh;
	  this.ville = villes;
	}
}
