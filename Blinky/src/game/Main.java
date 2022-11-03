package game;

import javax.swing.JFrame; // Cela ajoute une fenï¿½tre avec une bordure et une barre de titre 

public class Main {
	
	public static Scene scene; //
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de définir ce qu'il se passe quand on appuie sur la croix.
		window.setResizable(false); // permet de donner la taille qu'on veut à la fenêtre sans qu'elle soit redimensionnée
		window.setTitle("Blinky"); // pour afficher le titre
		window.setResizable(false); // permet de donner la taille qu'on veut a la fenetre sans qu'elle soit redimensionnee
		window.setLocationRelativeTo(null); // pas de location specifiee, windows la placera au centre
		/*Jeu gamePlan = new Jeu();
		window.add(gamePlan);
		window.pack(); // pour pouvoir voir la fenetre
		scene = new Scene(); //instanciation de l'objet scene 	
		window.setContentPane(scene);
		window.setVisible(true);*/
		Jeu jeu =new Jeu();
		window.add(jeu);
		window.pack();
		window.setLocationRelativeTo(null); // pas de location spécifiée, windows la placera au centre
		window.setVisible(true);
		jeu.startGameThread(); }



}