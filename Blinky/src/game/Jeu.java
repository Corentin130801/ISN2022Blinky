package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import decor.GestionDecor;
import object.Joueur;

import object.Joueur;
@SuppressWarnings("serial")
public class Jeu extends JPanel implements Runnable{
	/*ici ce trouve toutes les variables qui paramétrise la fenêtre de jeu*/
	final int tailleDeBase=16; 
	final int echelle=3; 
	public final int tailleCarreaux=tailleDeBase*echelle;
	public final int colonneEcran=16;
	public final int ligneEcran=12;
	public final int largeurEcran=tailleCarreaux*colonneEcran;
	public final int hauteurEcran=tailleCarreaux*ligneEcran;
	int FPS=60;
	
	GestionDecor gestionD = new GestionDecor(this);
	Keyinput entrerClavier =new Keyinput();
	Thread gameThread;
	Joueur joueur= new Joueur(this,entrerClavier);

	
	public Jeu() {
		this.setPreferredSize(new Dimension(largeurEcran,hauteurEcran ));
		this.setBackground(Color.black);//couleur du fond
		this.setDoubleBuffered(true);
		this.addKeyListener(entrerClavier); // le Jeu pourra reconnaître le KeyInput
		this.setFocusable(true); //le Jeu pourra être focus pour recevoir KeyInput
		
	}
	public void startGameThread() {
		gameThread=new Thread(this);
		gameThread.start();
		
	}
	@Override
	public void run() {
		/* ici on fait une interval de temps notre but est d'avoir 60Fps c'est à dire soixante frame par seconde
		 * pour cela on prend un temps en nano en nanoseconde (system.nanotime) et on rajoute a ça le temps d'une frame 
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
			  
			
		}}
		public void update() {
			
			joueur.update();
		
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
		
		public void paintComponent(Graphics g) {  // une methode pour dessiner des choses qui appartient à JPanel, Grapihcs est une classe pour dessiner des objets
			super.paintComponent(g); //une formalite de paintComponent
			Graphics2D g2=(Graphics2D)g;
			
			gestionD.draw(g2);  // on dessine le decor avant le joueur pour pas que le joueur soit cache
			
			joueur.draw(g2);
			
			/*g2.setColor(Color.white);
			g2.fillRect(playerX,playerY,tailleCarreaux/2 , tailleCarreaux/2);*/
			g2.dispose();
		}
	}

