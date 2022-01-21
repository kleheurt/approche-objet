package fr.diginamic.maison;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMaison {
	
	private Maison maison;
	
	@BeforeEach
	public void setUp() {
		this.maison = new Maison();
	}
	
	@Test
	public void testAjouterPieceNull() {
		this.maison.ajouterPiece(null);
		assertEquals(maison.getTab().length, 0);
	}
	
	@Test
	public void testAjouterPieceNeg() {
		Piece piece = new Salon(-1,0);
		this.maison.ajouterPiece(piece);
		assertEquals(maison.getTab().length,0);
		
	}

}
