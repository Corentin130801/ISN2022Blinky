package game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeuTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }








    @Test
    public void setUpGame(){
        Jeu game = new Jeu();
        game.setUpGame();

        // Test that the objects and monsters have been set up correctly
        assertNotNull(game.joueur);
        assertNotNull(game.obj);
        assertNotNull(game.monstre);
        assertNotNull(game.Fmonstre);
    }
    @Test
    public void setUpGameDeplacementX() {
        Jeu game = new Jeu();
        game.setUpGame();
        int oldX=game.joueur.worldX;
        int oldY=game.joueur.worldY;


        // Simulate moving the player to the right
        game.entrerClavier.toucheD=true;
        game.joueur.update();

        // Test that the player's position has changed
        assertNotEquals(oldX,game.joueur.worldX);
        assertEquals(oldY,game.joueur.worldY);


    }

    @Test
    public void setUpGameDeplacementY() {
        Jeu game = new Jeu();
        game.setUpGame();
        int oldX=game.joueur.worldX;
        int oldY=game.joueur.worldY;

        // Simulate moving the player to the top
        game.entrerClavier.toucheZ=true;
        game.joueur.update();

        // Test that the player's position has changed
        assertNotEquals(oldY,game.joueur.worldY);
        assertEquals(oldX,game.joueur.worldX);
    }

    @Test
    public void setUpGameDeplacementXY() {
        Jeu game = new Jeu();
        game.setUpGame();
        int oldX=game.joueur.worldX;
        int oldY=game.joueur.worldY;

        // Simulate moving the player to the right top diagonale
        game.entrerClavier.toucheZ=true;
        game.entrerClavier.toucheD=true;
        game.joueur.update();

        // Test that the player's position has changed
        assertNotEquals(oldY,game.joueur.worldY);
        assertNotEquals(oldX,game.joueur.worldX);
    }
    @Test
    public void startGameThread() {
        Jeu game = new Jeu();
        game.startGameThread();

        // Test that the game thread has been started and is not null
        assertNotNull(game.gameThread);
        assertTrue(game.gameThread.isAlive());
    }
}