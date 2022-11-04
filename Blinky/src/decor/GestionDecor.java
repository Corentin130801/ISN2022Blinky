package decor;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.Jeu;

public class GestionDecor {
	
	Jeu nouveaujeu;
	Decor[] decor;
	
	public GestionDecor(Jeu nouveaujeu) {
		this.nouveaujeu = nouveaujeu;
		// determiner la taille du Decor[]
		decor= new Decor[10];  // creation de 10 decors differents
		
		getDecorImage();
	}
	
	public void getDecorImage() {  // meme facon qu'avec les differentes images du hero dans la classe joueur
		
		try {
			
			decor[0] = new Decor();
			decor[0].image = ImageIO.read(getClass().getResourceAsStream("/decors/sable.png"));
			
			decor[1]=new Decor();
			decor[1].image = ImageIO.read(getClass().getResourceAsStream("/decors/mur.png"));
					
		}catch(IOException e){
			e.printStackTrace();   // pour trouver les exceptions
			
		}
		
	}
	
	public void draw(Graphics2D g2) {
		
		// x et y coordonnées  ;  tous les 48 car un carreau fait 48 de L et l
		
		// placer des murs autour, a titre d'exemple
		for(int x=0;x<16;x++) {
			for(int y=0;y<16;y++) {				
				
					g2.drawImage(decor[1].image,48*x , 0, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux, null);
					g2.drawImage(decor[1].image,0 , 48*y, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux, null);
					g2.drawImage(decor[1].image,48*x , 528, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux, null);
					g2.drawImage(decor[1].image,720 , 48*y, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux, null);						
			
		}
		}
	
		// placer du sable au centre de la carte
		
		for(int x=48;x<=48*14;x++) {
			for(int y=48;y<=10*48;y++) {
				g2.drawImage(decor[0].image,x , y, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux, null);
			}
				
			}			
		
	}
		
	}
	
	



