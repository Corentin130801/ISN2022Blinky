package game;

import javax.swing.JFrame; // Cela ajoute une fen�tre avec une bordure et une barre de titre 

public class Main {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de d�finir ce qu'il se passe quand on appuie sur la croix.
		window.setResizable(false); // permet de donner la taille qu'on veut � la fen�tre sans qu'elle soit redimensionn�e
		window.setTitle("Blinky"); // pour afficher le titre
		jeu jeeu =new jeu();
		window.add(jeeu);
		window.pack();
		window.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		window.setVisible(true);
		jeeu.startGameThread(); 

}
}