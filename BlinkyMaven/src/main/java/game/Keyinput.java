package game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Keyinput implements KeyListener{
	/*ici la touche z permet d'aller en haut ,s en bas,d � droite,q � gauche*/
	public boolean toucheZ,toucheS,toucheQ,toucheD,touche1,touche2,touche3,espace,enter;
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int  code =e.getKeyCode(); // retourne le keyCode associ� � la touche pressee	 
		if(code==KeyEvent.VK_Z) {
			toucheZ=true;
		}
		if(code==KeyEvent.VK_S) {
			toucheS=true;
				}
		if(code==KeyEvent.VK_Q) {
			toucheQ=true;
		}
		if(code==KeyEvent.VK_D) {
			toucheD=true;
				}
		if(code==KeyEvent.VK_1){
			touche1=true;
		}
		if(code==KeyEvent.VK_2){
			touche2=true;
		}
		if(code==KeyEvent.VK_3){
			touche3=true;
		}
		if(code==KeyEvent.VK_SPACE){
			espace=true;
		}
		if(code==KeyEvent.VK_ENTER){
			enter=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code=e.getKeyCode();
		
		if(code==KeyEvent.VK_Z) {
			toucheZ=false;
		}
		if(code==KeyEvent.VK_S) {
			toucheS=false;
				}
		if(code==KeyEvent.VK_Q) {
			toucheQ=false;
		}
		if(code==KeyEvent.VK_D) {
			toucheD=false;
				}
		if(code==KeyEvent.VK_1) {
			touche1=false;
		}
		if(code==KeyEvent.VK_2) {
			touche2=false;
		}if(code==KeyEvent.VK_3) {
			touche3=false;
		}
		if(code==KeyEvent.VK_SPACE){
			espace=false;
		}
		if(code==KeyEvent.VK_ENTER){
			enter=false;
		}
	}

		

}

