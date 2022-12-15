package game;

import javax.swing.*;
import java.awt.*;

public class FirstWindow extends JFrame {

    public FirstWindow(){
        setSize(200,200);
        JLayeredPane pane = getLayeredPane();

        // Création de boutons

        JButton btn1 = new JButton();
        btn1.setBackground(Color.yellow);
        btn1.setBounds(30,30,50,50);

        JButton btn2 = new JButton();
        btn2.setBackground(Color.green);
        btn2.setBounds(50,50,60,60);

        JButton btn3 = new JButton();
        btn3.setBackground(Color.red);
        btn3.setBounds(70,70,60,60);

        pane.add(btn3, new Integer(1));
        pane.add(btn2, new Integer(2));
        pane.add(btn1, new Integer(3));

    }










}
