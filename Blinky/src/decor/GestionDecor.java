package decor;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import game.Jeu;

public class GestionDecor {
	
	Jeu nouveaujeu;
	public Decor[] decor;
	public int mapNbCarreaux[][];
	
	public GestionDecor(Jeu nouveaujeu) {
		this.nouveaujeu = nouveaujeu;
		// determiner la taille du Decor[]
		decor= new Decor[10];  // creation de 10 decors differents
		
		mapNbCarreaux = new int[nouveaujeu.colonneEcran][nouveaujeu.ligneEcran];
		
		getDecorImage();
		loadMap();
	}
	
	public void getDecorImage() {  // meme facon qu'avec les differentes images du hero dans la classe joueur
		
		try {
			
			decor[0] = new Decor();
			decor[0].image = ImageIO.read(getClass().getResourceAsStream("/decors/sable.png"));
			
			decor[1]=new Decor();
			decor[1].image = ImageIO.read(getClass().getResourceAsStream("/decors/mur.png"));
			decor[1].collision = true ;
			
			
		}catch(IOException e){
			e.printStackTrace();   // pour trouver les exceptions
			
		}
		
	}
	
	public void loadMap() {
		try {
			InputStream is = getClass().getResourceAsStream("/maps/map01.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		
			int colonne=0;
			int ligne=0;
			
			while(colonne<nouveaujeu.colonneEcran && ligne< nouveaujeu.ligneEcran) {
				
				String line = br.readLine(); // lis les lignes et les mets dans le string line
				
				while(colonne<nouveaujeu.colonneEcran) {
					String numbers[] = line.split(" "); // supprime les espaces et split chaque numero
					
					int num = Integer.parseInt(numbers[colonne]); // on convertit les strings en nombre
					
					mapNbCarreaux[colonne][ligne] = num;
					colonne++;
					
					
				}
				
				if(colonne == nouveaujeu.colonneEcran) {
					colonne=0;
					ligne++;
				}
				
			}
			br.close();
		}catch(Exception e) {
		
		}
	}	
	
	
	public void draw(Graphics2D g2) {
		
		// 1e methode mais ne fonctionne pas car le perso se teleporte
		// x et y coordonn�es  ;  tous les 48 car un carreau fait 48 de L et l
		
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
		
	/*	for(int x=48;x<=48*14;x++) {
			for(int y=48;y<=10*48;y++) {
				g2.drawImage(decor[0].image,x , y, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux, null);
			}
				
			}			
		*/
	// 2e methode :  on recouvre tout le plateau de sable mais assez contraignant
	
			int colonne=0;
			int ligne=0;
			int x=0;
			int y=0;
			
			while(colonne<nouveaujeu.colonneEcran && ligne < nouveaujeu.ligneEcran) {
				int NbCarreaux = mapNbCarreaux[colonne][ligne];
				g2.drawImage(decor[NbCarreaux].image,x,y,nouveaujeu.tailleCarreaux,nouveaujeu.tailleCarreaux,null);
				colonne++;
				x+=nouveaujeu.tailleCarreaux;
				
				if(colonne==nouveaujeu.colonneEcran) {
					colonne=0;
					x=0;
					ligne++;
					y+=nouveaujeu.tailleCarreaux;
				}
				
			}
	
	
		
	// 3e methode : avec l'utilisation d'un fichier texte et grace a la fonction loadMap
	
	
			/*int colonne=0;
			int ligne=0;
			int x=0;
			int y=0;
			
			while(colonne < nouveaujeu.colonneEcran && ligne < nouveaujeu.ligneEcran) {
				
				int NbCarreaux = mapNbCarreaux[colonne][ligne];  // recuperer le numero de quel mati�re on veut notre carreau
				
				g2.drawImage(decor[NbCarreaux].image,x,y,nouveaujeu.tailleCarreaux,nouveaujeu.tailleCarreaux,null);
				colonne++;
				x+=nouveaujeu.tailleCarreaux;
				
				if(colonne==nouveaujeu.colonneEcran) {
					colonne=0;
					x=0;
					ligne++;
					y+=nouveaujeu.tailleCarreaux;
				}
				
			}*/		
			
		}
		
		
	}
		
	
	
	



