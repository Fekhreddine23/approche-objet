package fichier;

import java.io.IOException;
import java.net.NoRouteToHostException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
 //exo lire fichier
	
	
	public static void main(String[] args) throws IOException {
		// Dans la classe LectureFichier en début de méthode main, 
		//créez une ArrayList de objets Ville vide
		List<Ville>  villes = new ArrayList<>();
		
		
		
		Path path = Paths.get("C:\\Users\\far23\\Documents\\recensement.csv");
		
		System.out.println(path.getRoot()); //la racine
		System.out.println(path.getParent()); //le dossier parent
		System.out.println(path.getFileName()); //nom du fichier
		
		
		//exercice 2
		//Exercice LireFichierAvecInstanciation
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		for(int i = 1; i < lines.size();i++) {
			String[] tokens = lines.get(i).split(";");
			villes.add(new Ville(tokens[6], tokens[2], tokens[1], Integer.parseInt(tokens[9].trim().
					replace(" ", ""))));
		}
		
		
		for (Ville ville : villes) {
			System.out.println(ville.toString());
		}
		
		//exercice 3
		//Générez maintenant un fichier de sortie ne contenant que les villes 
		//de plus de 25 000 habitants.
		
		//new array list de string
		List<String>  villes2 = new ArrayList<>();
		
		for(Ville ville : villes) {
			if(ville.getPopTotale() >= 25000) {
				
				villes2.add(ville.getNom() + ";" + ville.getNomRegion() + ";" + ville.getCodeDepartement()
				+
	            ";" + ville.getPopTotale());
					
			}
			
			//Exemple pour écrire dans un fichier:
			//je remplace dans le fichier les lignes
			//pour afficher les villes de 25k habitants
			String fichierString = "\"C:\\\\Users\\\\far23\\\\Documents\\\\recensement.csv\"";
			
			Path path2 = Paths.get(fichierString);
			
			Files.write(path2, villes2);
		}

	}

}
