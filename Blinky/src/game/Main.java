package game;

import javax.swing.JFrame; // Cela ajoute une fenï¿½tre avec une bordure et une barre de titre 

public class Main {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
<<<<<<< HEAD
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de définir ce qu'il se passe quand on appuie sur la croix.
		window.setResizable(false); // permet de donner la taille qu'on veut à la fenêtre sans qu'elle soit redimensionnée
		window.setTitle("Blinky"); // pour afficher le titre
		jeu jeeu =new jeu();
		window.add(jeeu);
		window.pack();
		window.setLocationRelativeTo(null); // pas de location spécifiée, windows la placera au centre
		window.setVisible(true);
		jeeu.startGameThread(); 
=======
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de dï¿½finir ce qu'il se passe quan on appuie sur la croix.
		window.setTitle("Blinky"); // pour afficher le titre
		window.setResizable(false); // permet de donner la taille qu'on veut ï¿½ la fenï¿½tre sans qu'elle soit redimensionnï¿½e
		window.setLocationRelativeTo(null); // pas de location spï¿½cifiï¿½e, windows la placera au centre
		window.setVisible(true);
		
		GamePlan gamePlan = new GamePlan();
		window.add(gamePlan);
		window.pack(); // pour pouvoir voir la fenï¿½tre
		//ceci est un test 
		//test leo
>>>>>>> 69425afa0e239f3812a2abbc18ef6c02d2a16267

}
}