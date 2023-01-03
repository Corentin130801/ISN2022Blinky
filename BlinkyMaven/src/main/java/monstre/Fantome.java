package monstre;

import java.util.Random;

import game.Jeu;
import object.Parentsobject;

public class Fantome extends Parentsobject {

	public Fantome(Jeu nouveaujeu) {
		super(nouveaujeu);
		direction="bas";
		speed=1;
		setVie(1);
		
		getImage();

	
	}
	public void getImage() {
		
			
			up1=setup("/monstre/Fdroite1");
			up2=setup("/monstre/Fdroite1");
			down1=setup("/monstre/Fgauche1");
			down2=setup("/monstre/Fgauche1");
			left1=setup("/monstre/Fgauche2");
			left2=setup("/monstre/Fgauche1");
			right1=setup("/monstre/Fdroite1");
			right2=setup("/monstre/Fdroite2");
			
		}
	@Override
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
	
	
