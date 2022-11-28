package object;

import game.Keyinput;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.util.*;
import game.Jeu;

public class Monster extends Parentsobject {
	Jeu nouveaujeu;
	
	
	public  int screenX;
	public  int screenY;
	
	public Monster (Jeu nouveaujeu,int screenX, int screenY) {
		this.nouveaujeu=nouveaujeu;
		this.screenX = screenX;
		this.screenY = screenY;
		/*this.screenX = nouveaujeu.largeurEcran/4 - (nouveaujeu.tailleCarreaux/2);
		this.screenY = nouveaujeu.hauteurEcran/2 - (nouveaujeu.tailleCarreaux/2);*/
		
		solidArea= new Rectangle();
		solidArea.x=8;
		solidArea.y=16;
		solidArea.width=32;
		solidArea.height=32;
		
		positionetvitessededepart();
		imageUpload();
}
	
	public void positionetvitessededepart(){
		worldX=nouveaujeu.tailleCarreaux * 30;
		worldY=nouveaujeu.tailleCarreaux * 2;
		speed=1;
		direction="bas";}
	public void imageUpload() {
		try {
			/*les object sont dans la classe parent*/
			Monstre=ImageIO.read(getClass().getResourceAsStream("/monstre/fantome.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		// 10.49(ici on r�cup�re les info dans le dossier ressource pour ensuite les upload)
	}
	public void update() {
		/*cette section met a jour la position du joueur  selon les action choisi par le joueur, cette methode update est appele 60 fois par seconde*/
		int a= (int)(Math.random()*8);
		if (a==1) {
			direction="haut";}
		else if(a==2) {
			direction="bas";
		}
		else if(a==3 || a==5||a==6) {
			direction="droite";
		}
		else if(a==4||a==7) {
			direction="gauche";
		}
		
		// Verification des collision
			if (direction=="haut") {
			screenY-=speed;}/*
			//case "droite":worldX+=speed;break;
			//case"gauche":worldX-=speed;break;*/
			else if(direction=="bas"){
			screenY+=speed;}
			else if(direction=="droite"){
				screenX+=speed;}
			else if(direction=="gauche"){
				screenX-=speed;}
			//case "diagona haut droite":worldX+=speed;worldY-=speed/2;break;
			//case"diagonal bas droite":worldX+=speed;worldY+=speed/2;break;
			//case "diagonal haut gauche":worldX-=speed;worldY-=speed/2;break;
			//case"diagonal bas gauche":worldX-=speed;worldY+=speed/2;break;
		
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
		
		
		BufferedImage image = Monstre;
	/*ici on peut mettre des images pour rendre les d�placements r�aliste et dans ce cas il faut mettre null sur la ligne du sessus*/
	
		g2.drawImage(image,screenX,screenY, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux, null);
		
	}
	}
