package object;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Parentsobject {
public int worldX,worldY; // position du joueur sur la map
public int speed;
public BufferedImage up1,up2,down1,down2,left1,left2,right1,right2,toutedirection, DiagBasDroite1,DiagBasDroite2,
                     DiagBasGauche1, DiagBasGauche2, DiagHautDroite1, DiagHautDroite2, DiagHautGauche1, DiagHautGauche2;  // BufferedImage decrit une image, cela permet d'utiliser et de manipuler l'image
public String direction;
public int spriteCounter=0; // sprite est un element graphique
public int spriteNum=1;
public Rectangle solidArea; 
public boolean CollisionOn = false ;
}
