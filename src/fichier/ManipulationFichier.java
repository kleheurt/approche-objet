package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ManipulationFichier {
	
	//traitement des données de chaque commune
	public static String traitementChaine(String s) {
		String[] tab = s.split(";");
		String nomVille = tab[6];
		String codeDept = tab[2];
		String popTotale = tab[9].trim().replaceAll(" ","");
		
		if(Integer.parseInt(popTotale) < 25000) return null;
		
		return nomVille+";"+codeDept+";"+popTotale;
	}

	public static void main(String[] args) {
		
		//lecture du fichier
		Path path = Paths.get("C:\\Temp\\recensement.csv");
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//traitement des données
		lines.remove(0);
		lines.replaceAll(x -> traitementChaine(x));
		lines.removeAll(Collections.singleton(null));
		
		//écriture du nouveau fichier
		Path path2 = Paths.get("C:\\Temp\\communes.csv");
		try {
			Files.write(path2, lines,  StandardCharsets.UTF_8, StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
