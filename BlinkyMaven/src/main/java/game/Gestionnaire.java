package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Gestionnaire {
 Jeu nouveaujeu;
 Font arial_40;
 Font book_antique;
 Font header;
 
 BufferedImage gameover;
 public Gestionnaire(Jeu nouveaujeu) {
	 this.nouveaujeu=nouveaujeu;
	 arial_40=new Font("Arial",Font.PLAIN,40);
	 book_antique=new Font("Book Antiqua",Font.PLAIN,40);
	 header=new Font("Book Antiqua",Font.BOLD,60);
 }
 public void draw(Graphics2D g2) {
	 g2.setFont(arial_40);
	 g2.setColor(Color.white);
	 g2.drawString("Santé="+nouveaujeu.joueur.getVie(), 50, 50);
 }
 public void drawstart(Graphics2D g2) {
	 g2.setFont(header);
	 g2.setColor(Color.red);
	 g2.drawString("Bienvenue dans notre Jeu : BLINKY" , 20, 60);
	 g2.setFont(book_antique);
	 g2.setColor(Color.white);
	 g2.drawString("Espace sur un monstre pour le tuer " , 50, 100);
	 g2.drawString("Z pour aller en haut " , 50, 150);
	 g2.drawString("Q pour aller à gauche " , 50, 200);
	 g2.drawString("S pour aller en bas " , 50, 250);
	 g2.drawString("D pour aller à droite" , 50, 300);
	 g2.drawString("Le but est d'atteindre le drapeau " , 50, 350);
	 g2.setColor(Color.yellow);
	 g2.drawString("Mais attention aux monstres!!" , 50, 400);
	 g2.drawString("Les monstres  roses enlèvent 1 HP  " , 50, 450);
	 g2.drawString("Les fantômes tuent au contact  " , 50, 500);
	 g2.setColor(Color.GREEN);
	 g2.drawString("Appuyez sur espace pour commencer" , 50, 550);
	 
 }
 public void drawend(Graphics2D g2) {
	 g2.setFont(header);
	 g2.setColor(Color.red);
	 g2.drawString("Tu as Perdu!!" , 230, 250);
	 g2.drawString("GAME OVER !!" , 230, 320);
	 g2.setFont(book_antique);
	 g2.setColor(Color.white);
	 /*g2.drawString("Pour se déplacer appuie sur : " , 50, 150);
	 g2.drawString("Z pour aller en haut " , 50, 200);
	 g2.drawString("Q pour aller à gauche " , 50, 250);
	 g2.drawString("S pour aller en bas " , 50, 300);
	 g2.drawString("D pour aller à droite" , 50, 350);
	 g2.drawString("Le but est d'atteindre le drapeau " , 50, 400);
	 g2.setColor(Color.yellow);
	 g2.drawString("Mais attention aux monstres!!" , 50, 450);*/
	 g2.setColor(Color.GREEN);
	 g2.drawString("Appuyez sur entrée pour finir le jeu" , 50, 500);
	 
 }
 public void drawvictoire(Graphics2D g2) {
	 g2.setFont(header);
	 g2.setColor(Color.red);
	 g2.drawString("Tu as Gagné:" , 230, 250);
	 g2.drawString("T'es un boss !" , 230, 320);
	 g2.setFont(book_antique);
	 g2.setColor(Color.white);
	 /*g2.drawString("Pour se déplacer appuie sur : " , 50, 150);
	 g2.drawString("Z pour aller en haut " , 50, 200);
	 g2.drawString("Q pour aller à gauche " , 50, 250);
	 g2.drawString("S pour aller en bas " , 50, 300);
	 g2.drawString("D pour aller à droite" , 50, 350);
	 g2.drawString("Le but est d'atteindre le drapeau " , 50, 400);
	 g2.setColor(Color.yellow);
	 g2.drawString("Mais attention aux monstres!!" , 50, 450);*/
	 g2.setColor(Color.GREEN);
	 g2.drawString("Appuyez sur entrée pour finir le jeu" , 50, 500);
	 
 }
 
}
