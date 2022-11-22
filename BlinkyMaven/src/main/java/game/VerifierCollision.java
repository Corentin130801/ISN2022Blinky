package game;

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
		
	
}