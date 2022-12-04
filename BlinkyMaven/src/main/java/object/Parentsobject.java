package object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.Jeu;
import game.OutilUtile;


public class Parentsobject {
	
	Jeu nouveaujeu;
public int worldX,worldY; // position du joueur sur la map
public int speed;
public BufferedImage up1,up2,down1,down2,left1,left2,right1,right2,toutedirection, DiagBasDroite1,DiagBasDroite2,
                     DiagBasGauche1, DiagBasGauche2, DiagHautDroite1, DiagHautDroite2, DiagHautGauche1, DiagHautGauche2,Monstre,gameover;  // BufferedImage decrit une image, cela permet d'utiliser et de manipuler l'image
public String direction;
public int spriteCounter=0; // sprite est un element graphique
public int spriteNum=1;
public Rectangle solidArea = new Rectangle(0,0,48,48);
public int solidAreaDefaultX,solidAreaDefaultY;
public boolean CollisionOn = false ;
public int actionLockCounter = 0 ;


public Parentsobject(Jeu nouveaujeu) {
	this.nouveaujeu=nouveaujeu;
}
public void setAction() {
	
}

public void updateSansCollision() {
	setAction();
	CollisionOn = false ; 
	nouveaujeu.Verifier.checkPlayer(this);
	
	if(CollisionOn== false) {
	switch(direction) {
	case"haut":worldY-=speed;break;
	case "droite":worldX+=speed;break;
	case"gauche":worldX-=speed;break;
	case"bas":worldY+=speed;break;
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

// FCT qui prend en compte les murs a choisir dans le public update dans jeu.java
public void updateAvecCollision() {
	setAction();
	CollisionOn = false ; 
	nouveaujeu.Verifier.VerifierDecor(this);
	nouveaujeu.Verifier.checkPlayer(this);
	
	// Si collision est fausse, il peut bouger
	if(CollisionOn== false) {
		switch(direction) {
		case"haut":worldY-=speed;break;
		case "droite":worldX+=speed;break;
		case"gauche":worldX-=speed;break;
		case"bas":worldY+=speed;break;

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


public void draw(Graphics2D g2){
	
	BufferedImage image = null;

    int screenX = worldX - nouveaujeu.joueur.worldX +nouveaujeu.joueur.screenX; // l endroit ou sur l ecran on va dessiner
    int screenY = worldY - nouveaujeu.joueur.worldY + nouveaujeu.joueur.screenY;

    if(worldX +nouveaujeu.tailleCarreaux >nouveaujeu.joueur.worldX - nouveaujeu.joueur.screenX &&
            worldX - nouveaujeu.tailleCarreaux < nouveaujeu.joueur.worldX + nouveaujeu.joueur.screenX &&
            worldY + nouveaujeu.tailleCarreaux > nouveaujeu.joueur.worldY - nouveaujeu.joueur.screenY &&
            worldY - nouveaujeu.tailleCarreaux < nouveaujeu.joueur.worldY + nouveaujeu.joueur.screenY){
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
			}

        g2.drawImage(image,screenX,screenY,nouveaujeu.tailleCarreaux,nouveaujeu.tailleCarreaux,null);

    }
    	




}
public BufferedImage setup(String imagePath) {
	
	OutilUtile uOutil= new OutilUtile();
	BufferedImage scaledImage = null ;
	
	try {
		scaledImage = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
		scaledImage = uOutil.scaleImage(scaledImage, nouveaujeu.tailleCarreaux, nouveaujeu.tailleCarreaux);
	}catch(IOException e) {
		e.printStackTrace();
	}
	return scaledImage; 
	
}


}
