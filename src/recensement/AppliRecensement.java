package recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AppliRecensement {
	
	
	public static void main(String[] args) {
		
		//lecture du fichier
		Path path = Paths.get("C:\\Temp\\recensement.csv");
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// création du traitement
		France fr = new France(lines);
		List<Region> arr = fr.getFrance();
		for (Region region : arr) {
			System.out.println(region);
		}
		
		
		
		
	}

}
