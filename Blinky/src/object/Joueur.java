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
		if(entrerClavier.upPressed==true) {
		y-=speed;
		
	}
	else if(entrerClavier.downPressed==true) {
		y+=speed;
	}
	else if(entrerClavier.rightPressed==true) {
		x-=speed;	
			}
	else if(entrerClavier.leftPressed==true) {
		x+=speed;	
			}}
	
	public void draw(Graphics2D g2){
		g2.setColor(Color.white);
	
		g2.fillRect(x,y,nouveaujeu.tailleCarreaux/2 , nouveaujeu.tailleCarreaux/2);
	}
	}
