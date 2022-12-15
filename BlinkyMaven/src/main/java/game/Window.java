package game;

import javax.swing.JFrame;




public class Window {
	static JFrame window2 = new JFrame();

	public static void init() {
	
	
	window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation permet de definir ce qu'il se passe quand on appuie sur la croix.
	window2.setResizable(false); // permet de donner la taille qu'on veut a la fenetre sans qu'elle soit redimensionnee
	window2.setTitle("Blinky"); // pour afficher le titre
	window2.setResizable(false); // permet de donner la taille qu'on veut a la fenetre sans qu'elle soit redimensionnee
	window2.setLocationRelativeTo(null); // pas de location specifiee, windows la placera au centre

}
	public static void start(Jeu jeu) {
		window2.add(jeu);
		window2.pack();
		window2.setLocationRelativeTo(null); // pas de location sp�cifi�e, windows la placera au centre
		window2.setVisible(true);
		jeu.setUpGame();
		jeu.startGameThread(); 
	}
	public static void destroy() {
		window2.dispose();
	}}
