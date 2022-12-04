package game;

import bonus.ObjDrapeau;
import bonus.ObjEclair;
import bonus.ObjFlower;
import bonus.ObjStar;
import bonus.ObjTuto;
import monstre.Bonhomme;
import monstre.Fantome;

public class Setter {
    Jeu nouveaujeu;

    public Setter(Jeu nouveaujeu){
        this.nouveaujeu = nouveaujeu;
    }

    public  void setObjects(){
      /*  nouveaujeu.obj[0] = new ObjFlower();
        nouveaujeu.obj[0].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[0].worldY = 7*nouveaujeu.tailleCarreaux;

        nouveaujeu.obj[1] = new ObjFlower();
        nouveaujeu.obj[1].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[1].worldY = 8*nouveaujeu.tailleCarreaux;

        nouveaujeu.obj[2] = new ObjStar();
        nouveaujeu.obj[2].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[2].worldY = 9*nouveaujeu.tailleCarreaux;

        nouveaujeu.obj[3] = new ObjStar();
        nouveaujeu.obj[3].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[3].worldY = 10*nouveaujeu.tailleCarreaux;

        nouveaujeu.obj[4] = new ObjEclair();
        nouveaujeu.obj[4].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[4].worldY = 11*nouveaujeu.tailleCarreaux;*/

        nouveaujeu.obj[0] = new ObjEclair();
        nouveaujeu.obj[0].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[0].worldY = 8*nouveaujeu.tailleCarreaux;
        
        nouveaujeu.obj[1] = new ObjEclair();
        nouveaujeu.obj[1].worldX = 30*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[1].worldY = 16*nouveaujeu.tailleCarreaux;
        
        nouveaujeu.obj[2] = new ObjEclair();
        nouveaujeu.obj[2].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[2].worldY = 30*nouveaujeu.tailleCarreaux;
        
        nouveaujeu.obj[3] = new ObjDrapeau();
        nouveaujeu.obj[3].worldX = 45*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[3].worldY = 45*nouveaujeu.tailleCarreaux;
        
       /* nouveaujeu.obj[4] = new ObjTuto();
        nouveaujeu.obj[4].worldX = 18*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[4].worldY = 10*nouveaujeu.tailleCarreaux;*/


    }
    public void setMonstre(){
    	nouveaujeu.Fmonstre[0]= new Fantome(nouveaujeu);
    	nouveaujeu.Fmonstre[0].worldX = 22*nouveaujeu.tailleCarreaux;
    	nouveaujeu.Fmonstre[0].worldY = 7*nouveaujeu.tailleCarreaux;
    	
    	nouveaujeu.monstre[0]= new Bonhomme(nouveaujeu);
    	nouveaujeu.monstre[0].worldX = 21*nouveaujeu.tailleCarreaux;
    	nouveaujeu.monstre[0].worldY = 7*nouveaujeu.tailleCarreaux;
    }
}
