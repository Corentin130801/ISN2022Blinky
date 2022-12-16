package monstre;

import java.util.Random;

import game.Jeu;
import object.Parentsobject;

public class Bonhomme extends Parentsobject {

	public Bonhomme(Jeu nouveaujeu) {
		super(nouveaujeu);
		direction="bas";
		speed=1;
		
		getImage();

	
	}
	public void getImage() {
		up1=setup("/joueur/joueur3");
		up2=setup("/joueur/joueur3");
		down1=setup("/joueur/joueur3");
		down2=setup("/joueur/joueur3");
		left1=setup("/joueur/joueur3");
		left2=setup("/joueur/joueur3");
		right1=setup("/joueur/joueur3");
		right2=setup("/joueur/joueur3");
			
			/*up1=setup("/joueur/boy_up_1");
			up2=setup("/joueur/boy_up_2");
			down1=setup("/joueur/boy_down_1.1");
			down2=setup("/joueur/boy_down_2.1");
			left1=setup("/joueur/boy_left_1.1");
			left2=setup("/joueur/boy_left_2.1");
			right1=setup("/joueur/boy_right_1.1");
			right2=setup("/joueur/boy_right_2");*/
			
		}
	public void setAction() {
		
		actionLockCounter ++;
		if(actionLockCounter == 120) {
			
		Random random = new Random();
		int i = random.nextInt(100)+1; // prend un nome entre 1 et 100
		
		if(i<=25) {
			direction = "haut";
		}
		if(i>25 && i<=50) {
			direction = "bas";
		}
		if(i>50 && i<=75) {
			direction = "droite";
		}
		if(i>75 && i<=100) {
			direction = "gauche";
		}
		actionLockCounter=0;
	}
	}
	}