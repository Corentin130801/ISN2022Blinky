package game;

import javax.swing.JFrame; // Cela ajoute une fen�tre avec une bordure et une barre de titre 

public class Main {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
<<<<<<< HEAD
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de d�finir ce qu'il se passe quand on appuie sur la croix.
		window.setResizable(false); // permet de donner la taille qu'on veut � la fen�tre sans qu'elle soit redimensionn�e
		window.setTitle("Blinky"); // pour afficher le titre
		jeu jeeu =new jeu();
		window.add(jeeu);
		window.pack();
		window.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		window.setVisible(true);
		jeeu.startGameThread(); 
=======
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de d�finir ce qu'il se passe quan on appuie sur la croix.
		window.setTitle("Blinky"); // pour afficher le titre
		window.setResizable(false); // permet de donner la taille qu'on veut � la fen�tre sans qu'elle soit redimensionn�e
		window.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		window.setVisible(true);
		
		GamePlan gamePlan = new GamePlan();
		window.add(gamePlan);
		window.pack(); // pour pouvoir voir la fen�tre
		//ceci est un test 
		//test leo
>>>>>>> 69425afa0e239f3812a2abbc18ef6c02d2a16267

}
}