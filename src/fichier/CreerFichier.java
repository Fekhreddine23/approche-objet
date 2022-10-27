package fichier;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creer fichier
		// Recevoir le fichier
		Path path = Paths.get("C:\\Users\\far23\\Documents\\recensement.csv");

		// Créez un fichier et inscrivez dans ce fichier les 100 premières lignes du
		// fichier recensement.
		// Ouvrez ce fichier en fin d’exécution afin d’en vérifier le contenu.

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		for (int i = 0; i < 100; i++) {

			System.out.println(lines.get(i));//methode qui affiche les 100premiers lignes
		}
		
		//nouveau fichier
		//avec le fichier avec les 100 premieres lignes
		Path newFile = Paths.get(path.getParent()+"\\recensementNew.csv");
		Files.write(newFile, lines);
	}

	
}
