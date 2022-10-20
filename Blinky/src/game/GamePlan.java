package game;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePlan extends JPanel{ //cr�ation du contenu de la fen�tre
	
	// Screen Settings
	
	final int OriginalTileSize = 16; // 16x16 carreaux(pixels) pour chaque image ou perso
	// mise � l'�chelle
	final int scale = 3;
	// on a cr�� des personnages de taille 16x16 pixels et ils auront l'air de personnages 48x48 (x3)
	final int tileSize = OriginalTileSize * scale; // 48x48 pixel
	// Combien peut on mettre de carreaux horizontalement et verticalement sur un �cran ?
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol; // 768 pixels
	final int screenHeight = tileSize * maxScreenRow; // 576 pixels
	
	// constructor
	
	public GamePlan() {
		
		this.setPreferredSize(new Dimension(screenWidth,screenHeight)); // sp�cifie la taille pr�f�r�e d'un composant. C'est la taille optimale du composant 
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); // am�liore les performances, m�me si j'ai pas trop compris ce que c'�tait
		
	}
	

}
