package object;

import game.Keyinput;

import java.awt.Color;
import java.awt.Graphics2D;
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
			down2=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_down_2.1png"));
			left1=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_left_1.1.png"));
			left2=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_left_2.1png"));
			right1=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_right_1.1.png"));
			right2=ImageIO.read(getClass().getResourceAsStream("/joueur/boy_right_2.1png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		//10.49(ici on récupère les info dans le dossier ressource pour ensuite les upload)
	}
	public void update() {
		/*cette section met a jour la position du joueur  selon les action choisi par le joueur*/
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
			direction="bas";
		}
		else if(entrerClavier.toucheS==true) {
		y+=speed;//on va en bas
		direction="haut";
	}
		else if(entrerClavier.toucheD==true) {
		x+=speed;	//on va  à droite
		direction="droite";
			}
		else if(entrerClavier.toucheQ==true) {
		x-=speed;
		direction="gauche";// on va à gauche
			}
		}
	/*note
	 *  si on ne veut pas avoir l'option d'aller en diagonal il faut rajouté un else devant les trois dernier if
	 *  aller en diagonal augmente la vitesse par2 si on ne veut pas que cela ce produise il faut rajouter des else if avec une condition du style
	 *  (entrerClavier.toucheS==true andentrerClavier.toucheD==true) */
	
	public void draw(Graphics2D g2){
		g2.setColor(Color.white);
	
		g2.fillRect(x,y,nouveaujeu.tailleCarreaux/2 , nouveaujeu.tailleCarreaux/2);
	}
	}
