package game;

import javax.swing.JFrame; // Cela ajoute une fen�tre avec une bordure et une barre de titre 

public class Main {
	
	public static Scene scene; //
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de d�finir ce qu'il se passe quand on appuie sur la croix.
		window.setResizable(false); // permet de donner la taille qu'on veut � la fen�tre sans qu'elle soit redimensionn�e
		window.setTitle("Blinky"); // pour afficher le titre
<<<<<<< HEAD
		window.setResizable(false); // permet de donner la taille qu'on veut � la fen�tre sans qu'elle soit redimensionn�e
		window.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		
		
		GamePlan gamePlan = new GamePlan();
		window.add(gamePlan);
		window.pack(); // pour pouvoir voir la fen�tre
		
		
		scene = new Scene(); //instanciation de l'objet scene 
			
			window.setContentPane(scene);
			window.setVisible(true);
=======
		jeu jeeu =new jeu();
		window.add(jeeu);
		window.pack();
		window.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		window.setVisible(true);
		jeeu.startGameThread(); 


>>>>>>> 44a073c7ac796e34f5df9eff2664279addf716f0
}
}