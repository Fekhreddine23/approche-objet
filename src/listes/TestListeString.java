package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Dans cette classe instanciez une ArrayList de String contenant les éléments suivants :
		//o Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
		ArrayList<String> villes = new ArrayList<String>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");
		
		System.out.println(villes);
		
		//Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		
		String nomPlusLong = villes.get(0); //1er ville Nice
		
		
		for(var i = 0; i < villes.size(); i++) {
			
			String p = villes.get(i);
	    	//System.out.println(p);
			//Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
			if( p.length() > nomPlusLong.length() ) {
				nomPlusLong = p;
				
				System.out.println("la ville la plus longue est " + p);
			}
		}
		
		//Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules.
		for (int i= 0; i < villes.size(); i++) {
			String p = villes.get(i).toUpperCase();
			System.out.println("Toutes les villes en MAJ " + p);
			
			
			}
		

		 //iteration avc remove()
		Iterator<String> iter = villes.iterator();
		while (iter.hasNext()) { 
			String p = iter.next(); 
			if (p.charAt(0) == 'N') { 
				iter.remove(); 
				
			} 
			
		}

		System.out.println("les villes qui commence avec N sont supprimés "+villes);
	
	}   
	

	}

/**Supprimez de la liste les villes dont le nom commence par la lettre N.
if(p.charAt(0) == 'N') {
	
	villes.remove(i);
	System.out.println("les villes qui commence avec N sont supprimés "+villes);
**/