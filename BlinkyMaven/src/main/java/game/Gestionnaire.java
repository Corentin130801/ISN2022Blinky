package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Gestionnaire {
 Jeu nouveaujeu;
 Font arial_40;
 BufferedImage gameover;
 public Gestionnaire(Jeu nouveaujeu) {
	 this.nouveaujeu=nouveaujeu;
	 arial_40=new Font("Arial",Font.PLAIN,40);
	 
 }
 public void draw(Graphics2D g2) {
	 g2.setFont(arial_40);
	 g2.setColor(Color.white);
	 g2.drawString("Santé="+nouveaujeu.joueur.vie, 50, 50);
 }
 public void drawend(Graphics2D g2) {
	 g2.setFont(arial_40);
	 g2.setColor(Color.white);
	 g2.drawString("Choisir un niveau 1 2 3" , 250, 250);
 }
 
}
