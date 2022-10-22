package game;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Scene extends JPanel{
	
	
	// Ici il faudra mettre le fond d'ecran 
	
	private int x; //abscisse de l image de fond 
	private int dx; // variable qui permet de deplacer le fond d ecran 
	
	
	
	//*** GETTERS ***
	public int getDx() {return dx;} //Permet d avoir le dx dans une autre class
	
	//*** SETTERS ***
	public void setDx(int dx) {this.dx = dx;} //Permet de modifier le dx dans une autre class


	//*** CONSTRUCTEUR ***
	public Scene() {
		
		super ();
		
		this.x=0;
		this.dx=0; // initialise a 0
		
		this.setFocusable(true); //???? 
		this.requestFocusInWindow();//recuperer le focus
		this.addKeyListener(new Clavier());//liaison entre la classe scene et clavier
		
		Thread chronoEcran = new Thread (new Chrono());
		//programme independant qui va repeindre l ecran en fonction des donnees dans chrono
		//ici c est 3ms
		chronoEcran.start(); //demarrer le chrono
	}
	
	
	

	

	//*** METHODE ***
	public void deplacementEcran(){this.x= this.x - this.dx;}
}


