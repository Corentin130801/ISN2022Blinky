package game;

import javax.swing.JFrame; // Cela ajoute une fen�tre avec une bordure et une barre de titre 

public class Main {
	
	public static Scene scene; //
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de d�finir ce qu'il se passe quan on appuie sur la croix.
		window.setTitle("Blinky"); // pour afficher le titre
		window.setResizable(false); // permet de donner la taille qu'on veut � la fen�tre sans qu'elle soit redimensionn�e
		window.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		
		
		GamePlan gamePlan = new GamePlan();
		window.add(gamePlan);
		window.pack(); // pour pouvoir voir la fen�tre
		
		
		scene = new Scene(); //instanciation de l'objet scene 
			
			window.setContentPane(scene);
			window.setVisible(true);
}
}