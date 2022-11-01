package object;

import game.Keyinput;

import java.awt.Color;
import java.awt.Graphics2D;

import game.Jeu;

public class Joueur extends Parentsobject {
	Jeu nouveaujeu;
	Keyinput entrerClavier;
	
	public Joueur (Jeu nouveaujeu,Keyinput entrerClavier) {
		this.nouveaujeu=nouveaujeu;
		this.entrerClavier=entrerClavier;
		positionetvitessededepart();
}
	public void positionetvitessededepart(){
		x=100;
		y=100;
		speed=4;}
	public void imageUpload() {
		//10.49(ici on récupère les info dans le dossier ressource pour ensuite les upload)
	}
	public void update() {
		/*cette section met a jour la position du joueur  selon les action choisi par le joueur*/
		if(entrerClavier.toucheZ==true) {
		y-=speed;//on va en haut
		
	}
	 if(entrerClavier.toucheS==true) {
		y+=speed;//on va en bas
	}
	 if(entrerClavier.toucheD==true) {
		x-=speed;	//on va  à droite
			}
	 if(entrerClavier.toucheQ==true) {
		x+=speed;	// on va à gauche
			}}
	/*note
	 *  si on ne veut pas avoir l'option d'aller en diagonal il faut rajouté un else devant les trois dernier if
	 *  aller en diagonal augmente la vitesse par2 si on ne veut pas que cela ce produise il faut rajouter des else if avec une condition du style
	 *  (entrerClavier.toucheS==true andentrerClavier.toucheD==true) */
	
	public void draw(Graphics2D g2){
		g2.setColor(Color.white);
	
		g2.fillRect(x,y,nouveaujeu.tailleCarreaux/2 , nouveaujeu.tailleCarreaux/2);
	}
	}
