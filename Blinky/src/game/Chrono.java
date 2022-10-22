package game;

public class Chrono implements Runnable{
	
	private final int PAUSE =3; //temps de pause entre 2 tours de boucle ici c'est 3ms
	@Override
	public void run() {
		while(true) {
			
			Main.scene.repaint(); //appel a redessiner le fond d ecran et le reste des images
			
			try {
				Thread.sleep(PAUSE); // Thread c est le flux 
			} catch (InterruptedException e){} // Le try and catch eviter certain soucis car fonction sensible 
			
			// Permet de faire un arret de 3 ms
				
		}
		
	}

}
