package game;

import javax.swing.JFrame; // Cela ajoute une fenêtre avec une bordure et une barre de titre 

public class Main {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de définir ce qu'il se passe quan on appuie sur la croix.
		window.setTitle("Blinky"); // pour afficher le titre
		window.setResizable(false); // permet de donner la taille qu'on veut à la fenêtre sans qu'elle soit redimensionnée
		window.setLocationRelativeTo(null); // pas de location spécifiée, windows la placera au centre
		window.setVisible(true);
		
		GamePlan gamePlan = new GamePlan();
		window.add(gamePlan);
		window.pack(); // pour pouvoir voir la fenêtre
		//ceci est un test 
		

}
}