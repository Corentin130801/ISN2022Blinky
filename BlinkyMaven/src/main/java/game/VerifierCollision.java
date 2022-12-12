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
						if(nouveaujeu.obj[i].collision == true){
							object.CollisionOn = true;
						}
						if(player == true){
							index = i;
						}
					}
					break;
				case "bas":
					if(object.solidArea.intersects(nouveaujeu.obj[i].solidArea)) {
						if(nouveaujeu.obj[i].collision == true){
							object.CollisionOn = true;
						}
						if(player == true){
							index = i;
						}
					}
					object.solidArea.y+=object.speed;
					break;
				case "droite":
					if(object.solidArea.intersects(nouveaujeu.obj[i].solidArea)) {
						if(nouveaujeu.obj[i].collision == true){
							object.CollisionOn = true;
						}
						if(player == true){
							index = i;
						}
					}
					object.solidArea.x+=object.speed;
					break;
				case "gauche":
					if(object.solidArea.intersects(nouveaujeu.obj[i].solidArea)) {
						if(nouveaujeu.obj[i].collision == true){
							object.CollisionOn = true;
						}
						if(player == true){
							index = i;
						}
					}
					object.solidArea.x-=object.speed;
					break;
				}
				object.solidArea.x=object.solidAreaDefaultX;
				object.solidArea.y=object.solidAreaDefaultY;
				nouveaujeu.obj[i].solidArea.x=nouveaujeu.obj[i].solidAreaDefaultX;
				nouveaujeu.obj[i].solidArea.y=nouveaujeu.obj[i].solidAreaDefaultY;
			}
			
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


}

public int VerifierParentsObject(Parentsobject object, Parentsobject[] target) {

	int index=999;
	
	for(int i=0;i<target.length;i++) {
		if(target[i]!=null) {
			object.solidArea.x=object.worldX+ object.solidArea.x;
			object.solidArea.y=object.worldY+ object.solidArea.y;
			//________________
			target[i].solidArea.x=target[i].worldX + target[i].solidArea.x;
			target[i].solidArea.y=target[i].worldY + target[i].solidArea.y;
			switch(object.direction) {
			case "haut":
				object.solidArea.y-=object.speed;
				if(object.solidArea.intersects(target[i].solidArea)) {
					
						object.CollisionOn = true;
					index = i;
					
				}
				break;
			case "bas":
				if(object.solidArea.intersects(target[i].solidArea)) {
					
						object.CollisionOn = true;
						index = i;
					
				}
				object.solidArea.y+=object.speed;
				break;
			case "droite":
				if(object.solidArea.intersects(target[i].solidArea)) {
					object.CollisionOn = true;
					index = i;
					
				}
				object.solidArea.x+=object.speed;
				break;
			case "gauche":
				if(object.solidArea.intersects(target[i].solidArea)) {
					object.CollisionOn = true;
					index = i;
					
				}
				object.solidArea.x-=object.speed;
				break;
			default:
				index=999;
				break;
			}
			
			object.solidArea.x=object.solidAreaDefaultX;
			object.solidArea.y=object.solidAreaDefaultY;
			target[i].solidArea.x=target[i].solidAreaDefaultX;
			target[i].solidArea.y=target[i].solidAreaDefaultY;
		}
		
	}
	return index;
	

}

public void checkPlayer(Parentsobject object) {
	object.solidArea.x=object.worldX+ object.solidArea.x;
	object.solidArea.y=object.worldY+ object.solidArea.y;
	//________________
	nouveaujeu.joueur.solidArea.x=nouveaujeu.joueur.worldX + nouveaujeu.joueur.solidArea.x;
	nouveaujeu.joueur.solidArea.y=nouveaujeu.joueur.worldY + nouveaujeu.joueur.solidArea.y;
	switch(object.direction) {
	case "haut":
		object.solidArea.y-=object.speed;
		if(object.solidArea.intersects(nouveaujeu.joueur.solidArea)) {
			
				object.CollisionOn = true;
			
		}
		break;
	case "bas":
		if(object.solidArea.intersects(nouveaujeu.joueur.solidArea)) {
			
				object.CollisionOn = true;
			
		}
		object.solidArea.y+=object.speed;
		break;
	case "droite":
		if(object.solidArea.intersects(nouveaujeu.joueur.solidArea)) {
			object.CollisionOn = true;
			
		}
		object.solidArea.x+=object.speed;
		break;
	case "gauche":
		if(object.solidArea.intersects(nouveaujeu.joueur.solidArea)) {
			object.CollisionOn = true;
			
		}
		object.solidArea.x-=object.speed;
		break;
	}
	object.solidArea.x=object.solidAreaDefaultX;
	object.solidArea.y=object.solidAreaDefaultY;
	nouveaujeu.joueur.solidArea.x=nouveaujeu.joueur.solidAreaDefaultX;
	nouveaujeu.joueur.solidArea.y=nouveaujeu.joueur.solidAreaDefaultY;

}
}
			
	

