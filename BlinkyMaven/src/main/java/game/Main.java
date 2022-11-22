package game;

import javax.swing.JFrame; // Cela ajoute une fen�tre avec une bordure et une barre de titre 

public class Main {
	
	public static Scene scene; //
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de definir ce qu'il se passe quand on appuie sur la croix.
		window.setResizable(false); // permet de donner la taille qu'on veut a la fenetre sans qu'elle soit redimensionnee
		window.setTitle("Blinky"); // pour afficher le titre
		window.setResizable(false); // permet de donner la taille qu'on veut a la fenetre sans qu'elle soit redimensionnee
		window.setLocationRelativeTo(null); // pas de location specifiee, windows la placera au centre
		Jeu jeu =new Jeu();
		window.add(jeu);
		window.pack();
		window.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		window.setVisible(true);
		//jeu.setUpGame();



		jeu.startGameThread(); }



}