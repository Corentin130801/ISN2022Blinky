package bonus;

import game.Jeu;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SuperBonus {
    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;
    public Rectangle solidArea= new Rectangle(0,0,12,12); 
    public int solidAreaDefaultX=0;
    public int solidAreaDefaultY=0;
    public String direction;
    public int speed;
	
    public void draw(Graphics2D g2, Jeu nouveaujeu){
        int screenX = worldX - nouveaujeu.joueur.worldX +nouveaujeu.joueur.screenX; // l endroit ou sur l ecran on va dessiner
        int screenY = worldY - nouveaujeu.joueur.worldY + nouveaujeu.joueur.screenY;

        if(worldX +nouveaujeu.tailleCarreaux >nouveaujeu.joueur.worldX - nouveaujeu.joueur.screenX &&
                worldX - nouveaujeu.tailleCarreaux < nouveaujeu.joueur.worldX + nouveaujeu.joueur.screenX &&
                worldY + nouveaujeu.tailleCarreaux > nouveaujeu.joueur.worldY - nouveaujeu.joueur.screenY &&
                worldY - nouveaujeu.tailleCarreaux < nouveaujeu.joueur.worldY + nouveaujeu.joueur.screenY){

            g2.drawImage(   image,screenX,screenY,nouveaujeu.tailleCarreaux,nouveaujeu.tailleCarreaux,null);

        }




    }


}
