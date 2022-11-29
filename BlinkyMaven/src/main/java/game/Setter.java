package game;

import bonus.ObjDrapeau;
import bonus.ObjEclair;
import bonus.ObjFlower;
import bonus.ObjStar;

public class Setter {
    Jeu nouveaujeu;

    public Setter(Jeu nouveaujeu){
        this.nouveaujeu = nouveaujeu;
    }

    public void setObjects(){
        nouveaujeu.obj[0] = new ObjFlower();
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
        nouveaujeu.obj[4].worldY = 11*nouveaujeu.tailleCarreaux;

        nouveaujeu.obj[5] = new ObjEclair();
        nouveaujeu.obj[5].worldX = 23*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[5].worldY = 12*nouveaujeu.tailleCarreaux;

        nouveaujeu.obj[6] = new ObjDrapeau();
        nouveaujeu.obj[6].worldX = 45*nouveaujeu.tailleCarreaux;
        nouveaujeu.obj[6].worldY = 45*nouveaujeu.tailleCarreaux;


    }
}
