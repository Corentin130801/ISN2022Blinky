package game;

import bonus.ObjDrapeau;
import bonus.ObjEclair;
import bonus.ObjFlower;
import bonus.ObjStar;
import monstre.Bonhomme;
import monstre.Fantome;

public class Setter {
    Jeu nouveaujeu;

    public Setter(Jeu nouveaujeu){
        this.nouveaujeu = nouveaujeu;
    }

	public Jeu getNouveaujeu() {
		return nouveaujeu;
	}

	public  void setObjects(){

        nouveaujeu.obj[0] = new ObjEclair();
        nouveaujeu.obj[0].worldX = 29*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[0].worldY = 4*nouveaujeu.tailleCarreaux;

        
        nouveaujeu.obj[1] = new ObjEclair();
        nouveaujeu.obj[1].worldX = 30*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[1].worldY = 16*nouveaujeu.tailleCarreaux;
        
        nouveaujeu.obj[2] = new ObjEclair();
        nouveaujeu.obj[2].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[2].worldY = 34*nouveaujeu.tailleCarreaux;
        
        nouveaujeu.obj[3] = new ObjDrapeau();
        nouveaujeu.obj[3].worldX = 45*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[3].worldY = 45*nouveaujeu.tailleCarreaux;
        
        nouveaujeu.obj[4] = new ObjFlower();
        nouveaujeu.obj[4].worldX = 20*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[4].worldY = 13*nouveaujeu.tailleCarreaux;

        nouveaujeu.obj[6] = new ObjStar();
        nouveaujeu.obj[6].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[6].worldY = 8*nouveaujeu.tailleCarreaux;

		nouveaujeu.obj[7] = new ObjFlower();
		nouveaujeu.obj[7].worldX = 4*nouveaujeu.tailleCarreaux;
		nouveaujeu.obj[7].worldY = 8*nouveaujeu.tailleCarreaux;


		nouveaujeu.obj[8]= new ObjStar();
		nouveaujeu.obj[8].worldX = 35*nouveaujeu.tailleCarreaux;
		nouveaujeu.obj[8].worldY = 35*nouveaujeu.tailleCarreaux;

		nouveaujeu.obj[9] = new ObjStar();
		nouveaujeu.obj[9].worldX = 10*nouveaujeu.tailleCarreaux;
		nouveaujeu.obj[9].worldY = 32*nouveaujeu.tailleCarreaux;

	}
    public void setMonstre(){
    	nouveaujeu.Fmonstre[0]= new Fantome(nouveaujeu);
    	nouveaujeu.Fmonstre[0].worldX = 22*nouveaujeu.tailleCarreaux;
    	nouveaujeu.Fmonstre[0].worldY = 10*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.Fmonstre[1]= new Fantome(nouveaujeu);
    	nouveaujeu.Fmonstre[1].worldX = 21*nouveaujeu.tailleCarreaux;
    	nouveaujeu.Fmonstre[1].worldY = 12*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.Fmonstre[2]= new Fantome(nouveaujeu);
    	nouveaujeu.Fmonstre[2].worldX = 24*nouveaujeu.tailleCarreaux;
    	nouveaujeu.Fmonstre[2].worldY = 15*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.Fmonstre[3]= new Fantome(nouveaujeu);
    	nouveaujeu.Fmonstre[3].worldX = 45*nouveaujeu.tailleCarreaux;
    	nouveaujeu.Fmonstre[3].worldY = 42*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.Fmonstre[4]= new Fantome(nouveaujeu);
    	nouveaujeu.Fmonstre[4].worldX = 32*nouveaujeu.tailleCarreaux;
    	nouveaujeu.Fmonstre[4].worldY = 34*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.Fmonstre[5]= new Fantome(nouveaujeu);
    	nouveaujeu.Fmonstre[5].worldX = 27*nouveaujeu.tailleCarreaux;
    	nouveaujeu.Fmonstre[5].worldY = 24*nouveaujeu.tailleCarreaux;

		nouveaujeu.Fmonstre[6]= new Fantome(nouveaujeu);
		nouveaujeu.Fmonstre[6].worldX = 40*nouveaujeu.tailleCarreaux;
		nouveaujeu.Fmonstre[6].worldY = 40*nouveaujeu.tailleCarreaux;

		nouveaujeu.Fmonstre[7]= new Fantome(nouveaujeu);
		nouveaujeu.Fmonstre[7].worldX = 19*nouveaujeu.tailleCarreaux;
		nouveaujeu.Fmonstre[7].worldY = 19*nouveaujeu.tailleCarreaux;

		nouveaujeu.Fmonstre[8]= new Fantome(nouveaujeu);
		nouveaujeu.Fmonstre[8].worldX = 25*nouveaujeu.tailleCarreaux;
		nouveaujeu.Fmonstre[8].worldY = 25*nouveaujeu.tailleCarreaux;

		nouveaujeu.Fmonstre[9]= new Fantome(nouveaujeu);
		nouveaujeu.Fmonstre[9].worldX = 13*nouveaujeu.tailleCarreaux;
		nouveaujeu.Fmonstre[9].worldY = 18*nouveaujeu.tailleCarreaux;


    	
    	nouveaujeu.monstre[0]= new Bonhomme(nouveaujeu);
    	nouveaujeu.monstre[0].worldX = 21*nouveaujeu.tailleCarreaux;
    	nouveaujeu.monstre[0].worldY = 7*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.monstre[1]= new Bonhomme(nouveaujeu);
    	nouveaujeu.monstre[1].worldX = 15*nouveaujeu.tailleCarreaux;
    	nouveaujeu.monstre[1].worldY = 21*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.monstre[2]= new Bonhomme(nouveaujeu);
    	nouveaujeu.monstre[2].worldX = 22*nouveaujeu.tailleCarreaux;
    	nouveaujeu.monstre[2].worldY = 24*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.monstre[3]= new Bonhomme(nouveaujeu);
    	nouveaujeu.monstre[3].worldX = 37*nouveaujeu.tailleCarreaux;
    	nouveaujeu.monstre[3].worldY = 39*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.monstre[4]= new Bonhomme(nouveaujeu);
    	nouveaujeu.monstre[4].worldX = 38*nouveaujeu.tailleCarreaux;
    	nouveaujeu.monstre[4].worldY = 29*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.monstre[5]= new Bonhomme(nouveaujeu);
    	nouveaujeu.monstre[5].worldX = 30*nouveaujeu.tailleCarreaux;
    	nouveaujeu.monstre[5].worldY = 24*nouveaujeu.tailleCarreaux;

		nouveaujeu.monstre[6]= new Bonhomme(nouveaujeu);
		nouveaujeu.monstre[6].worldX = 37*nouveaujeu.tailleCarreaux;
		nouveaujeu.monstre[6].worldY = 43*nouveaujeu.tailleCarreaux;

		nouveaujeu.monstre[7]= new Bonhomme(nouveaujeu);
		nouveaujeu.monstre[7].worldX = 4*nouveaujeu.tailleCarreaux;
		nouveaujeu.monstre[7].worldY = 35*nouveaujeu.tailleCarreaux;

		nouveaujeu.monstre[8]= new Bonhomme(nouveaujeu);
		nouveaujeu.monstre[8].worldX = 30*nouveaujeu.tailleCarreaux;
		nouveaujeu.monstre[8].worldY = 23*nouveaujeu.tailleCarreaux;

		nouveaujeu.monstre[9]= new Bonhomme(nouveaujeu);
		nouveaujeu.monstre[9].worldX = 23*nouveaujeu.tailleCarreaux;
		nouveaujeu.monstre[9].worldY = 32*nouveaujeu.tailleCarreaux;
    }

	public int getObjectX(int k){
		int X = nouveaujeu.obj[k].worldX;
		return X;
	}
	private int getObjectY(int k){
		int Y = nouveaujeu.obj[k].worldY;
		return Y;
	}



}
