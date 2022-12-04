package decor;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import game.Jeu;
import game.OutilUtile;

public class GestionDecor {
	
	Jeu nouveaujeu;
	public Decor[] decor;
	public int mapNbCarreaux[][];
	
	public GestionDecor(Jeu nouveaujeu) {
		this.nouveaujeu = nouveaujeu;
		// determiner la taille du Decor[]
		decor= new Decor[10];  // creation de 10 decors differents
		
		mapNbCarreaux = new int[nouveaujeu.maxWorldColonne][nouveaujeu.maxWorldLigne];
		
		getDecorImage();
		loadMap();
		/*for (int i=0;i<mapNbCarreaux.length;i++){
			for (int j=0;j<mapNbCarreaux[0].length;j++){
				System.out.print(mapNbCarreaux[i][j] + " ");

			}
			System.out.println();
		}*/

	}
	
	public void getDecorImage() {  // meme facon qu'avec les differentes images du hero dans la classe joueur
		
		
		
		setup(0,"sable",false);
		setup(1,"mur",true);
		
		
		
		/*try {
			
			decor[0] = new Decor();
			decor[0].image = ImageIO.read(getClass().getResourceAsStream("/decors/sable.png"));
			
			decor[1]=new Decor();
			decor[1].image = ImageIO.read(getClass().getResourceAsStream("/decors/mur.png"));
			decor[1].collision = true ;
			
			
		}catch(IOException e){
			e.printStackTrace();   // pour trouver les exceptions
			
		}*/
		
	}
	
	
	
	public void setup (int index, String ImagePath, boolean collision) {
		OutilUtile uOutil = new OutilUtile(); 
		try {
			decor [index]= new Decor();
			decor[index].image = ImageIO.read(getClass().getResourceAsStream("/decors/"+ImagePath+".png"));
			decor[index].image= uOutil.scaleImage(decor[index].image, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux);
			decor[index].collision= collision; 
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void loadMap() {
		try {
			InputStream is = getClass().getResourceAsStream("/maps/worldMap.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

		
			int colonne=0;
			int ligne=0;
			
			while(colonne<nouveaujeu.maxWorldColonne && ligne< nouveaujeu.maxWorldLigne) {
				
				String line = br.readLine(); // lis les lignes et les mets dans le string line
				String numbers[] = line.split(" ");  // supprime les espaces et split chaque numero
				while(colonne<nouveaujeu.maxWorldColonne) {

					int num = Integer.parseInt(numbers[colonne]); // on convertit les strings en nombre
					
					mapNbCarreaux[colonne][ligne] = num;
					colonne++;
					
					
				}
				
				if(colonne == nouveaujeu.maxWorldColonne) {
					colonne=0;
					ligne++;
				}
				
			}
			br.close();
		}catch(Exception e) {
		
		}
	}	
	
	
	public void draw(Graphics2D g2) {
			// 2e methode :  on recouvre tout le plateau de sable mais assez contraignant
	
			/*int colonne=0;
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
				
			}*/
	
	
		
	// 3e methode : avec l'utilisation d'un fichier texte et grace a la fonction loadMap
	
	
			int worldColonne=0;
			int worldLigne=0;
			
			while(worldColonne < nouveaujeu.maxWorldColonne && worldLigne < nouveaujeu.maxWorldLigne ) {
				
				int NbCarreaux = mapNbCarreaux[worldColonne][worldLigne];  // recuperer le numero de quel mati�re on veut notre carreau
				int worldX = worldColonne*nouveaujeu.tailleCarreaux;
				int worldY = worldLigne*nouveaujeu.tailleCarreaux;
				int screenX = worldX - nouveaujeu.joueur.worldX +nouveaujeu.joueur.screenX; // l endroit ou sur l ecran on va dessiner
				int screenY = worldY - nouveaujeu.joueur.worldY + nouveaujeu.joueur.screenY;

				if(worldX +nouveaujeu.tailleCarreaux >nouveaujeu.joueur.worldX - nouveaujeu.joueur.screenX &&
					worldX - nouveaujeu.tailleCarreaux < nouveaujeu.joueur.worldX + nouveaujeu.joueur.screenX &&
					worldY + nouveaujeu.tailleCarreaux > nouveaujeu.joueur.worldY - nouveaujeu.joueur.screenY &&
					worldY - nouveaujeu.tailleCarreaux < nouveaujeu.joueur.worldY + nouveaujeu.joueur.screenY){

					g2.drawImage(decor[NbCarreaux].image,screenX,screenY,null);

				}
				worldColonne++;
				//x+=nouveaujeu.tailleCarreaux;
				
				if(worldColonne==nouveaujeu.maxWorldColonne) {
					worldColonne=0;
					//x=0;
					worldLigne++;
					//y+=nouveaujeu.tailleCarreaux;
				}
				
			}	
			
		}
		
		
	}
		
	
	
	



