package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import object.Joueur;
@SuppressWarnings("serial")
public class Jeu extends JPanel implements Runnable{
	/*ici ce trouve toutes les variables qui paramétrise la fenêtre de jeu*/
	final int tailleDeBase=16; 
	final int echelle=3; 
	public final int tailleCarreaux=tailleDeBase*echelle;
	final int colonneEcran=16;
	final int ligneEcran=12;
	final int largeurEcran=tailleCarreaux*colonneEcran;
	final int hauteurEcran=tailleCarreaux*ligneEcran;
	final int FPS=60;
	Keyinput entrerClavier =new Keyinput();
	Thread gameThread;
	Joueur joueeur= new Joueur(this,entrerClavier);
	//position du joueur
	int playerX=100;
	int playerY=100;
	int playerSpeed=4;
	public Jeu() {
		this.setPreferredSize(new Dimension(largeurEcran,hauteurEcran ));
		this.setBackground(Color.black);//couleur du fond
		this.setDoubleBuffered(true);
		this.addKeyListener(entrerClavier);
		this.setFocusable(true);
		
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
			//long currentTime=System.nanoTime();
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
				Thread.sleep((long)remainingTime);// on l'utilise ici pour finaliser les frame dans le thread
				nextDrawTime+=drawInterval;
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			//Thread.sleep((long)remainingTime);
			
		}}
		public void update() {
			
			joueeur.update();
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
					}
			
		}*/ 
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2=(Graphics2D)g;
			joueeur.draw(g2);
			/*g2.setColor(Color.white);
			g2.fillRect(playerX,playerY,tailleCarreaux/2 , tailleCarreaux/2);*/
			g2.dispose();
		}
	}

