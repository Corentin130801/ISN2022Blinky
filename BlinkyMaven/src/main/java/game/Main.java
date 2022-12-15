package game;

import javax.swing.*;

public class Main {
	

	
	public static void main(String[] args) {
		
		/*JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de definir ce qu'il se passe quand on appuie sur la croix.
		window.setResizable(false); // permet de donner la taille qu'on veut a la fenetre sans qu'elle soit redimensionnee
		window.setTitle("Blinky"); // pour afficher le titre
		window.setResizable(false); // permet de donner la taille qu'on veut a la fenetre sans qu'elle soit redimensionnee
		window.setLocationRelativeTo(null); // pas de location specifiee, windows la placera au centre*/
		
		Window.init();
		Jeu jeu =new Jeu("worldMap");
		Window.start(jeu);
		JLayeredPane frame = new JLayeredPane();
		frame.FirstWindow();
		
		/*window.add(jeu);qq
		window.pack();
		window.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		window.setVisible(true);
		jeu.setUpGame();



		jeu.startGameThread();*/ 
		/*if(jeu.joueur.update()==1) {
			window.dispose();
		}*/}


}
