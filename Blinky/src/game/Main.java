package game;

import javax.swing.JFrame; // Cela ajoute une fenï¿½tre avec une bordure et une barre de titre 

public class Main {
	
	public static Scene scene; //
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de définir ce qu'il se passe quand on appuie sur la croix.
		window.setResizable(false); // permet de donner la taille qu'on veut à la fenêtre sans qu'elle soit redimensionnée
		window.setTitle("Blinky"); // pour afficher le titre
<<<<<<< HEAD
		window.setResizable(false); // permet de donner la taille qu'on veut ï¿½ la fenï¿½tre sans qu'elle soit redimensionnï¿½e
		window.setLocationRelativeTo(null); // pas de location spï¿½cifiï¿½e, windows la placera au centre
		
		
		GamePlan gamePlan = new GamePlan();
		window.add(gamePlan);
		window.pack(); // pour pouvoir voir la fenï¿½tre
		
		
		scene = new Scene(); //instanciation de l'objet scene 
			
			window.setContentPane(scene);
			window.setVisible(true);
=======
		jeu jeeu =new jeu();
		window.add(jeeu);
		window.pack();
		window.setLocationRelativeTo(null); // pas de location spécifiée, windows la placera au centre
		window.setVisible(true);
		jeeu.startGameThread(); 


>>>>>>> 44a073c7ac796e34f5df9eff2664279addf716f0
}
}