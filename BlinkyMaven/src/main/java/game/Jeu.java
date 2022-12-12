package game;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

//import bonus.SuperBonus;
import bonus.SuperBonus;
import decor.GestionDecor;
import object.Joueur;

import object.Parentsobject;


@SuppressWarnings("serial")
public class Jeu extends JPanel implements Runnable{
	/*ici ce trouve toutes les variables qui param�trise la fen�tre de jeu*/
	final int tailleDeBase=16; 
	final int echelle=3; 
	public final int tailleCarreaux=tailleDeBase*echelle;
	public final int colonneEcran=16;
	public final int ligneEcran=12;
	public final int largeurEcran=tailleCarreaux*colonneEcran;
	public final int hauteurEcran=tailleCarreaux*ligneEcran;
	public Boolean gameover=true;
	// Parametres de la map
	public final int maxWorldColonne = 50;
	public final int maxWorldLigne = 50;
	public final int hauteurWorld = tailleCarreaux*maxWorldLigne;
	public final int largeurWorld = tailleCarreaux*maxWorldColonne;
	int FPS=60;
	
	GestionDecor gestionD = new GestionDecor(this);
	Keyinput entrerClavier =new Keyinput();
	Sound sound=new Sound();
	public Gestionnaire gestion= new Gestionnaire(this);
	Thread gameThread;
	public VerifierCollision Verifier = new VerifierCollision(this);
	public Setter set = new Setter(this);
	
	
	
	// Parentsobject et Object
	public Joueur joueur= new Joueur(this,entrerClavier);
	public SuperBonus obj[] = new SuperBonus[10];
	public Parentsobject monstre[]= new Parentsobject[10];
	public Parentsobject Fmonstre[]= new Parentsobject[10];
	

	
	public Jeu() {
		this.setPreferredSize(new Dimension(largeurEcran,hauteurEcran ));
		this.setBackground(Color.black);//couleur du fond
		this.setDoubleBuffered(true);
		this.addKeyListener(entrerClavier); // le Jeu pourra reconna�tre le KeyInput
		this.setFocusable(true); //le Jeu pourra �tre focus pour recevoir KeyInput
		
	}

	public void setUpGame(){
		set.setObjects();
		set.setMonstre();
		playMusic(0);
	}
	public void startGameThread() {
		gameThread=new Thread(this);
		gameThread.start();
		
	}

	@Override
	public void run() {
		/* ici on fait une interval de temps notre but est d'avoir 60Fps c'est � dire soixante frame par seconde
		 * pour cela on prend un temps en nano en nanoseconde (system.nanotime) et on rajoute a �a le temps d'une frame 
		 * 
		 */
		double drawInterval= 1000000000/FPS; //conversion du temps en seconde 
		double nextDrawTime=System.nanoTime()+ drawInterval;
		
		while(gameThread !=null) {
			//System.out.println(entrerClavier.toucheZ);
			//update
			long currentTime=System.nanoTime();
			//System.out.println("time"+currentTime);
			update();
			//Draw
			repaint();
			
			try {
				double remainingTime=nextDrawTime-System.nanoTime();
				remainingTime=remainingTime/1000000;// ici il reste le temps d'une frame plus le temps d'execution 
				if(remainingTime<0) {
					remainingTime=0;
				}
				Thread.sleep((long)remainingTime);// on l'utilise ici pour finaliser les frame dans le thread, cette methode accepte que des long
				nextDrawTime+=drawInterval;
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			  
			
		}
		
		}
		public void update() {
			
			//Joueur 
			if(joueur.update()==1) {
				gameThread=null;
				//gestion.drawend(null);
				System.out.println("endgame");
				Window.destroy();
			}
			
			//Monstre
			
			for (int i =0; i<monstre.length; i++){
				if(monstre[i] != null){
					monstre[i].updateAvecCollision();
				}
			}
			//Fantome
			
			for (int i =0; i<Fmonstre.length; i++){
				if(Fmonstre[i] != null){
					Fmonstre[i].updateSansCollision();
				}
			}
		
			
			/*if(entrerClavier.toucheZ==true) {
				playerY-=playerSpeed;
				
			}
			else if(entrerClavier.toucheS==true) {
				playerY+=playerSpeed;
			}
			else if(entrerClavier.toucheD==true) {
				playerX-=playerSpeed;	
					}
			else if(entrerClavier.toucheQ==true) {
				playerX+=playerSpeed;	
					}*/			
		} 
		
		public void paintComponent(Graphics g) {  // une methode pour dessiner des choses qui appartient � JPanel, Grapihcs est une classe pour dessiner des objets
			super.paintComponent(g); //une formalite de paintComponent
			Graphics2D g2=(Graphics2D)g;
			
			// Dessin du décor
			gestionD.draw(g2);  // on dessine le decor avant le joueur pour pas que le joueur soit cache

			// Dessin des bonus

			for (int i =0; i<obj.length; i++){
				if(obj[i] != null){
					obj[i].draw(g2,this);
				}
			}
			
			//Monstre
			
			for (int i =0; i<monstre.length; i++){
				if(monstre[i] != null){
					monstre[i].draw(g2);
				}
			}
			//Fantome
			
			for (int i =0; i<Fmonstre.length; i++){
				if(Fmonstre[i] != null){
					Fmonstre[i].draw(g2);
				}
			}
			
			joueur.draw(g2);
			gestion.draw(g2);
			
			/*g2.setColor(Color.white);
			g2.fillRect(playerX,playerY,tailleCarreaux/2 , tailleCarreaux/2);*/
			g2.dispose();
		}
		public void playMusic(int i ) {
			sound.setFile(i);
			sound.play();
			sound.loop();
		}
		public void stopMusic() {
			sound.stop();
		}
		public void playSE(int i){
			sound.setFile(i);
			sound.play();
		}

		
		
	}


