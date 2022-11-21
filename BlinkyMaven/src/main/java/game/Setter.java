package game;

import bonus.Bonus;

public class Setter {
    Jeu nouveaujeu;

    public Setter(Jeu nouveaujeu){
        this.nouveaujeu = nouveaujeu;
    }

    public void setObjects(){
        nouveaujeu.bonus[0] = new Bonus();
    }
}
