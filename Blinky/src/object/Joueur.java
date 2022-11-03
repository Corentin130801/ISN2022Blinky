package object;

import game.Keyinput;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.Jeu;

public class Joueur extends Parentsobject {
	Jeu nouveaujeu;
	Keyinput entrerClavier;
	
	public Joueur (Jeu nouveaujeu,Keyinput entrerClavier) {
		this.nouveaujeu=nouveaujeu;
		this.entrerClavier=entrerClavier;
		positionetvitessededepart();
		imageUpload();
}
	public void positionetvitessededepart(){
		x=100;
		y=100;
		speed=4;
		direction="bas";}
	public void imageUpload() {
		try {
			up1=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_up_1.png"));
			up2=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_up_2.png"));
			down1=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_down_1.1.png"));
			down2=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_down_2.1.png"));
			left1=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_left_1.1.png"));
			left2=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_left_2.1.png"));
			right1=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_right_1.1.png"));
			right2=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_right_2.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		// 10.49(ici on récupère les info dans le dossier ressource pour ensuite les upload)
	}
	public void update() {
		/*cette section met a jour la position du joueur  selon les action choisi par le joueur, cette methode update est appele 60 fois par seconde*/
		if(entrerClavier.toucheZ==true && entrerClavier.toucheQ==true) {
			x-=speed;
			y-=speed/2;
			direction="diagonal haut droite";
		}
		else if(entrerClavier.toucheS==true && entrerClavier.toucheD==true) {
			x+=speed;
			y+=speed/2;
			direction="diagonal bas droite";
		}
		else if(entrerClavier.toucheS==true && entrerClavier.toucheQ==true) {
			x-=speed;
			y+=speed/2;
			direction="diagonal bas gauche";
		}
		else if(entrerClavier.toucheZ==true && entrerClavier.toucheD==true) {
			x+=speed;
			y-=speed/2;
			direction="diagonal haut gauche";
		}
		else if(entrerClavier.toucheZ==true) {
			y-=speed;//on va en haut
			direction="bas";}
		
		else if(entrerClavier.toucheS==true) {
		y+=speed;//on va en bas
		direction="haut";
	}
		else if(entrerClavier.toucheD==true) {
		x+=speed;	//on va  a droite
		direction="droite";
			}
		else if(entrerClavier.toucheQ==true) {
		x-=speed;
		direction="gauche";// on va a gauche
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
/*On peut rajouter si l'on veut l'option que le perso ne bouge pas quand on appuie sur aucune touche en remettant toute la partie d'avant
 * dans un autre if si on touche aucune touche */	
 
	
	/*note
	 *  si on ne veut pas avoir l'option d'aller en diagonal il faut rajouté un else devant les trois dernier if
	 *  aller en diagonal augmente la vitesse par2 si on ne veut pas que cela ce produise il faut rajouter des else if avec une condition du style
	 *  (entrerClavier.toucheS==true andentrerClavier.toucheD==true) */
	
	public void draw(Graphics2D g2){
		/*g2.setColor(Color.white);
		g2.fillRect(x,y,nouveaujeu.tailleCarreaux/2 , nouveaujeu.tailleCarreaux/2);*/
		
		
		BufferedImage image = null;
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
			image=up1;
			break;
		case"diagonale haut gauche":
			image=up2;
			break;
		case"diagonale bas droite":
			image=down2;
			break;
		case"diagonale bas gauche":
			image=down1;
			break;
		}
		g2.drawImage(image,x,y, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux, null);
		
	}
	}
