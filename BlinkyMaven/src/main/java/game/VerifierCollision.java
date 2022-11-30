package game;

import java.awt.Window;

import bonus.SuperBonus;
import object.Joueur;
import object.Parentsobject;

public class VerifierCollision {
	
	Jeu nouveaujeu;
	
	public VerifierCollision(Jeu nouveaujeu) {
		this.nouveaujeu = nouveaujeu ;
	}
	public void VerifierDecor(Parentsobject object) {
		
		int objectGaucheX = object.worldX + object.solidArea.x;
		int objectDroiteX = object.worldX + object.solidArea.x + object.solidArea.width;
		int objectHautY = object.worldY + object.solidArea.y;
		int objectBasY = object.worldY + object.solidArea.y + object.solidArea.height;
		int objectColonneGauche =  objectGaucheX/nouveaujeu.tailleCarreaux;
		int objectColonneDroite =  objectDroiteX/nouveaujeu.tailleCarreaux;
		int objectLigneHaut =  objectHautY/nouveaujeu.tailleCarreaux;
		int objectLigneBas =  objectBasY/nouveaujeu.tailleCarreaux;	
		int decorNum1 , decorNum2 ;
		
		switch(object.direction) {
		case "haut":
			objectLigneHaut = (objectHautY - object.speed)/nouveaujeu.tailleCarreaux;
			decorNum1 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneGauche][objectLigneHaut];
			decorNum2 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneDroite][objectLigneHaut];
			if(nouveaujeu.gestionD.decor[decorNum1].collision== true || nouveaujeu.gestionD.decor[decorNum2].collision== true) {
				object.CollisionOn = true ;
			}
			break;
		case"bas":
			objectLigneBas = (objectBasY + object.speed)/nouveaujeu.tailleCarreaux;
			decorNum1 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneGauche][objectLigneBas];
			decorNum2 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneDroite][objectLigneBas];
			if(nouveaujeu.gestionD.decor[decorNum1].collision== true || nouveaujeu.gestionD.decor[decorNum2].collision== true) {
				object.CollisionOn = true ;
			}
			break;
		case "droite":
			objectColonneDroite = (objectDroiteX + object.speed)/nouveaujeu.tailleCarreaux;
			decorNum1 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneDroite][objectLigneHaut];
			decorNum2 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneDroite][objectLigneBas];
			if(nouveaujeu.gestionD.decor[decorNum1].collision== true || nouveaujeu.gestionD.decor[decorNum2].collision== true) {
				object.CollisionOn = true ;
			}
			break;
		case"gauche":
			objectColonneGauche = (objectGaucheX - object.speed)/nouveaujeu.tailleCarreaux;
			decorNum1 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneGauche][objectLigneHaut];
			decorNum2 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneGauche][objectLigneBas];
			if(nouveaujeu.gestionD.decor[decorNum1].collision== true || nouveaujeu.gestionD.decor[decorNum2].collision== true) {
				object.CollisionOn = true ;
			}
			break;
		case "diagonal haut droite":
			objectColonneDroite = (objectDroiteX + object.speed)/nouveaujeu.tailleCarreaux;
			objectLigneHaut = (objectHautY - object.speed)/nouveaujeu.tailleCarreaux;
			decorNum1 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneDroite][objectLigneHaut];
			decorNum2 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneDroite][objectLigneHaut];
			if(nouveaujeu.gestionD.decor[decorNum1].collision== true || nouveaujeu.gestionD.decor[decorNum2].collision== true) {
				object.CollisionOn = true ;
			}
			break;
		case"diagonal bas droite":
			objectColonneDroite = (objectDroiteX + object.speed)/nouveaujeu.tailleCarreaux;
			objectLigneBas = (objectBasY + object.speed)/nouveaujeu.tailleCarreaux;
			decorNum1 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneDroite][objectLigneBas];
			decorNum2 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneDroite][objectLigneBas];
			if(nouveaujeu.gestionD.decor[decorNum1].collision== true || nouveaujeu.gestionD.decor[decorNum2].collision== true) {
				object.CollisionOn = true ;
			}
			break;
		case "diagonal haut gauche":
			objectColonneGauche = (objectGaucheX - object.speed)/nouveaujeu.tailleCarreaux;
			objectLigneHaut = (objectHautY - object.speed)/nouveaujeu.tailleCarreaux;
			decorNum1 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneGauche][objectLigneHaut];
			decorNum2 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneGauche][objectLigneHaut];
			if(nouveaujeu.gestionD.decor[decorNum1].collision== true || nouveaujeu.gestionD.decor[decorNum2].collision== true) {
				object.CollisionOn = true ;
			}
			break;
		case"diagonal bas gauche":
			objectColonneGauche = (objectGaucheX - object.speed)/nouveaujeu.tailleCarreaux;
			objectLigneBas = (objectBasY + object.speed)/nouveaujeu.tailleCarreaux;
			decorNum1 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneGauche][objectLigneBas];
			decorNum2 = nouveaujeu.gestionD.mapNbCarreaux[objectColonneGauche][objectLigneBas];
			if(nouveaujeu.gestionD.decor[decorNum1].collision== true || nouveaujeu.gestionD.decor[decorNum2].collision== true) {
				object.CollisionOn = true ;
			}
			break;
		}
	}
	
public int VerifierBonus(Parentsobject object,boolean player) {
		int index=999;
		
		for(int i=0;i<nouveaujeu.obj.length;i++) {
			if(nouveaujeu.obj[i]!=null) {
				object.solidArea.x=object.worldX+ object.solidArea.x;
				object.solidArea.y=object.worldY+ object.solidArea.y;
				//________________
				nouveaujeu.obj[i].solidArea.x=nouveaujeu.obj[i].worldX + nouveaujeu.obj[i].solidArea.x;
				nouveaujeu.obj[i].solidArea.y=nouveaujeu.obj[i].worldY + nouveaujeu.obj[i].solidArea.y;
				switch(object.direction) {
				case "haut":
					object.solidArea.y-=object.speed;
					if(object.solidArea.intersects(nouveaujeu.obj[i].solidArea)) {
					System.out.println("yes");				}
					break;
				case "bas":
					if(object.solidArea.intersects(nouveaujeu.obj[i].solidArea)) {
						System.out.println("yes");				}
					object.solidArea.y+=object.speed;
					break;
				case "droite":
					if(object.solidArea.intersects(nouveaujeu.obj[i].solidArea)) {
						System.out.println("yes");				}
					object.solidArea.x+=object.speed;
					break;
				case "gauche":
					if(object.solidArea.intersects(nouveaujeu.obj[i].solidArea)) {
						System.out.println("yes");				}
					object.solidArea.x-=object.speed;
					break;
				}
			}
			object.solidArea.x=object.solidAreaDefaultX;
			object.solidArea.y=object.solidAreaDefaultY;
			nouveaujeu.obj[i].solidArea.x=nouveaujeu.obj[i].solidAreaDefaultX;
			nouveaujeu.obj[i].solidArea.y=nouveaujeu.obj[i].solidAreaDefaultY;
			
			
		}
		return index;
		
}
public int VerifierBonus2(Joueur joueur) {
	int index=1;
	if((23*nouveaujeu.tailleCarreaux==joueur.worldX && 8*nouveaujeu.tailleCarreaux==joueur.worldY)||
			(joueur.worldX==23*nouveaujeu.tailleCarreaux&&
     joueur.worldY==30*nouveaujeu.tailleCarreaux)||(30*nouveaujeu.tailleCarreaux==joueur.worldX && 16*nouveaujeu.tailleCarreaux==joueur.worldY)) {
		joueur.speed=10;
		System.out.println("vitesse");
	}
	else if((45*nouveaujeu.tailleCarreaux==joueur.worldX && 45*nouveaujeu.tailleCarreaux==joueur.worldY)||
			(joueur.worldX==44*nouveaujeu.tailleCarreaux&&
		     joueur.worldY==45*nouveaujeu.tailleCarreaux)||
			(45*nouveaujeu.tailleCarreaux==joueur.worldX && 44*nouveaujeu.tailleCarreaux==joueur.worldY)) {
		joueur.speed=0;
		System.out.println("findujeu");
		
	}
			
	return index;


}}
			
	

