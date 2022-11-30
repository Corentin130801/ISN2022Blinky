package object;

import game.Keyinput;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.Jeu;

public class Joueur extends Parentsobject {
	Jeu nouveaujeu;
	Keyinput entrerClavier;

	public final int screenX;
	public final int screenY;
	
	public Joueur (Jeu nouveaujeu,Keyinput entrerClavier) {
		this.nouveaujeu=nouveaujeu;
		this.entrerClavier=entrerClavier;
		screenX = nouveaujeu.largeurEcran/2 - (nouveaujeu.tailleCarreaux/2);
		screenY = nouveaujeu.hauteurEcran/2 - (nouveaujeu.tailleCarreaux/2);
		
		solidArea= new Rectangle();
		solidArea.x=8;
		solidArea.y=16;
		solidAreaDefaultX=solidArea.x;
		solidAreaDefaultY=solidArea.y;
		solidArea.width=32;
		solidArea.height=28;
		
		
		positionetvitessededepart();
		imageUpload();
}
	public void positionetvitessededepart(){
		worldX=nouveaujeu.tailleCarreaux * 30;
		worldY=nouveaujeu.tailleCarreaux * 2;
		speed=4;
		direction="bas";}
	public void imageUpload() {
		try {
			/*les object sont dans la classe parent*/
			up1=ImageIO.read(getClass().getResourceAsStream("/joueur2/Haut1.png"));
			up2=ImageIO.read(getClass().getResourceAsStream("/joueur2/Haut2.png"));
			down1=ImageIO.read(getClass().getResourceAsStream("/joueur2/Bas1.png"));
			down2=ImageIO.read(getClass().getResourceAsStream("/joueur2/Bas2.png"));
			left1=ImageIO.read(getClass().getResourceAsStream("/joueur2/Gauche1.png"));
			left2=ImageIO.read(getClass().getResourceAsStream("/joueur2/Gauche2.png"));
			right1=ImageIO.read(getClass().getResourceAsStream("/joueur2/Droite1.png"));
			right2=ImageIO.read(getClass().getResourceAsStream("/joueur2/Droite2.png"));
			DiagBasDroite1=ImageIO.read(getClass().getResourceAsStream("/joueur2/diagonalbasdroite1.png"));
			DiagBasDroite2=ImageIO.read(getClass().getResourceAsStream("/joueur2/diagonalbasdroite2.png"));
			DiagBasGauche1=ImageIO.read(getClass().getResourceAsStream("/joueur2/diagonalbasgauche1.png"));
			DiagBasGauche2 = ImageIO.read(getClass().getResourceAsStream("/joueur2/diagonalbasgauche1.png"));
			DiagHautDroite1=ImageIO.read(getClass().getResourceAsStream("/joueur2/diagonalhautdroite1.png"));
			DiagHautDroite2=ImageIO.read(getClass().getResourceAsStream("/joueur2/diagonalhautdroite2.png"));
			DiagHautGauche1=ImageIO.read(getClass().getResourceAsStream("/joueur2/diagonalhautgauche1.png"));
			DiagHautGauche2=ImageIO.read(getClass().getResourceAsStream("/joueur2/diagonalhautgauche2.png"));
			toutedirection=ImageIO.read(getClass().getResourceAsStream("/joueur/joueur3.png"));
			gameover=ImageIO.read(getClass().getResourceAsStream("/joueur/th.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		// 10.49(ici on r�cup�re les info dans le dossier ressource pour ensuite les upload)
	}
	public void update() {
		/*cette section met a jour la position du joueur  selon les action choisi par le joueur, cette methode update est appele 60 fois par seconde*/
		if(entrerClavier.toucheZ==true ||entrerClavier.toucheQ==true||
				entrerClavier.toucheS==true ||entrerClavier.toucheD==true) {
		
		if(entrerClavier.toucheZ==true && entrerClavier.toucheQ==true) {
			
			direction="diagonal haut gauche";
		}
		else if(entrerClavier.toucheS==true && entrerClavier.toucheD==true) {
			
			direction="diagonal bas droite";
		}
		else if(entrerClavier.toucheS==true && entrerClavier.toucheQ==true) {
			
			direction="diagonal bas gauche";
		}
		else if(entrerClavier.toucheZ==true && entrerClavier.toucheD==true) {
			
			direction="diagonal haut droite";
		}
		else if(entrerClavier.toucheZ==true) {
			//on va en haut
			direction="haut";}
		
		else if(entrerClavier.toucheS==true) {
		//on va en bas
		direction="bas";
	}
		else if(entrerClavier.toucheD==true) {
			//on va  a droite
		direction="droite";
			}
		else if(entrerClavier.toucheQ==true) {
		
		direction="gauche";// on va a gauche
			}
		// Verification des collision
		
		CollisionOn = false ;
		nouveaujeu.Verifier.VerifierDecor(this);
		
		int obj=nouveaujeu.Verifier.VerifierBonus2(this);
		
		
		// Si collision est fausse, il peut bouger
		//int obj=nouveaujeu.Verifier.VerifierBonus(this,true);
		
		if(CollisionOn== false) {
			switch(direction) {
			case"haut":worldY-=speed;break;
			case "droite":worldX+=speed;break;
			case"gauche":worldX-=speed;break;
			case"bas":worldY+=speed;break;
			case "diagonal haut droite":worldX+=speed;worldY-=speed/2;break;
			case"diagonal bas droite":worldX+=speed;worldY+=speed/2;break;
			case "diagonal haut gauche":worldX-=speed;worldY-=speed/2;break;
			case"diagonal bas gauche":worldX-=speed;worldY+=speed/2;break;
		}
	}
		
		
		
			spriteCounter++; // le compteur augmente de 1 a chaque frame
			if(spriteCounter>10) {
				// on va changer l'image toutes les 10 frames sachant qu'il y en a 60/s, ce qui implique qu'on verra l'hero courir
				// on pourra donc ajuster ce nombre d'actualisation d'image/s
				if(spriteNum==1) {	
					spriteNum=2;
				}
				else if(spriteNum==2) {
					spriteNum=1;
				}
				spriteCounter=0; // on le reinitialise
			}
		}
	}
/*On peut rajouter si l'on veut l'option que le perso ne bouge pas quand on appuie sur aucune touche en remettant toute la partie d'avant
 * dans un autre if si on touche aucune touche */	
 
	
	/*note
	 *  si on ne veut pas avoir l'option d'aller en diagonal il faut rajout� un else devant les trois dernier if
	 *  aller en diagonal augmente la vitesse par2 si on ne veut pas que cela ce produise il faut rajouter des else if avec une condition du style
	 *  (entrerClavier.toucheS==true andentrerClavier.toucheD==true) */
	
	public void draw(Graphics2D g2){
		/*g2.setColor(Color.white);
		g2.fillRect(x,y,nouveaujeu.tailleCarreaux/2 , nouveaujeu.tailleCarreaux/2);*/
		
		
		BufferedImage image = null;
		
	/*ici on peut mettre des images pour rendre les d�placements r�aliste et dans ce cas il faut mettre null sur la ligne du sessus*/
		switch(direction) {
		case"haut":
			if(spriteNum==1) {
				image=up1;
			}
			if(spriteNum==2) {
				image=up2;
			}
			break;
		case"bas":
			if(spriteNum==1) {
				image=down1;
			}
			if(spriteNum==2) {
				image=down2;
			}
			break;
		case"gauche":
			if(spriteNum==1) {
				image=left1;
			}
			if(spriteNum==2) {
				image=left2;
			}
			break;
		case"droite":
			if(spriteNum==1) {
				image=right1;
			}
			if(spriteNum==2) {
				image=right2;
			}
			break;
		case"diagonale haut droite":
			if(spriteNum==1) {
				image=DiagHautDroite1;
			}
			if(spriteNum==2) {
				image=DiagHautDroite2;
			}

			break;
		case"diagonale haut gauche":
			if(spriteNum==1) {
				image=DiagHautGauche1;
			}
			if(spriteNum==2) {
				image=DiagHautGauche2;
			}

			break;
		case"diagonale bas droite":
			if(spriteNum==1) {
				image=DiagBasDroite1;
			}
			if(spriteNum==2) {
				image=DiagBasDroite2;
			}

			break;
		case"diagonale bas gauche":
			if(spriteNum==1) {
				image=DiagBasGauche1;
			}
			if(spriteNum==2) {
				image=DiagBasGauche2;
			}

			break;
		}
		
		
		g2.drawImage(image,screenX,screenY, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux, null);}
		
	}
	
