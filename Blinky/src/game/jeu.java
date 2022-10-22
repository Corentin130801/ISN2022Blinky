package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class jeu extends JPanel implements Runnable{
	final int originalTileSize=16;
	final int scale=3;
	final int  tileSize=originalTileSize*scale;
	final int maxScreenCol=16;
	final int maxScreenRow=12;
	final int screenWidth=tileSize*maxScreenCol;
	final int  screenHeight=tileSize*maxScreenRow;
	final int FPS=60;
	Keyinput keyH =new Keyinput();
	Thread gameThread;
	//position du joueur
	int playerX=100;
	int playerY=100;
	int playerSpeed=4;
	public jeu() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight ));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		
	}
	public void startGameThread() {
		gameThread=new Thread(this);
		gameThread.start(); 
	}
	@Override
	public void run() {
		double drawInterval= 1000000000/FPS;
		double nextDrawTime=System.nanoTime()+ drawInterval;
		while(gameThread !=null) {
			//System.out.println(keyH.upPressed);
			//update
			//long currentTime=System.nanoTime();
			//System.out.println("time"+currentTime);
			update();
			//Draw
			repaint();
			
			try {
				double remainingTime=nextDrawTime-System.nanoTime();
				remainingTime=remainingTime/1000000;
				if(remainingTime<0) {
					remainingTime=0;
				}
				Thread.sleep((long)remainingTime);
				nextDrawTime+=drawInterval;
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			//Thread.sleep((long)remainingTime);
			
		}}
		public void update() {
			if(keyH.upPressed==true) {
				playerY-=playerSpeed;
				
			}
			else if(keyH.downPressed==true) {
				playerY+=playerSpeed;
			}
			else if(keyH.rightPressed==true) {
				playerX-=playerSpeed;	
					}
			else if(keyH.leftPressed==true) {
				playerX+=playerSpeed;	
					}
			
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2=(Graphics2D)g;
			g2.setColor(Color.white);
			g2.fillRect(playerX,playerY,tileSize , tileSize);
			g2.dispose();
		}
	}

