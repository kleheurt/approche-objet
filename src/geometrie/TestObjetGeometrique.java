package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] tablObjet = {
				new Cercle(10),
				new Rectangle(5, 2)
		};
		
		for(int i = 0; i < tablObjet.length ; i++) {
			ObjetGeometrique tmp = tablObjet[i];
			System.out.println(tmp.perimetre()+ " ; "+ tmp.surface());
		}

	}

}
