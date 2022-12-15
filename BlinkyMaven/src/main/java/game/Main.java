package game;

import javax.swing.JFrame; // Cela ajoute une fenetre avec une bordure et une barre de titre

public class Main {
	

	
	public static void main(String[] args) {
		
		/*JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de definir ce qu'il se passe quand on appuie sur la croix.
		window.setResizable(false); // permet de donner la taille qu'on veut a la fenetre sans qu'elle soit redimensionnee
		window.setTitle("Blinky"); // pour afficher le titre
		window.setResizable(false); // permet de donner la taille qu'on veut a la fenetre sans qu'elle soit redimensionnee
		window.setLocationRelativeTo(null); // pas de location specifiee, windows la placera au centre*/
		
		Window.init();
		Jeu jeu =new Jeu(null);
		Window.start(jeu);
		/*window.add(jeu);
		window.pack();
		window.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		window.setVisible(true);
		jeu.setUpGame();



		jeu.startGameThread();*/ 
		/*if(jeu.joueur.update()==1) {
			window.dispose();
		}*/}


}
