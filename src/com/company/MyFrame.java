package com.company;

import javax.swing.*;

import static com.sun.glass.ui.Cursor.setVisible;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

        public MyFrame() {
            super("Aplication from Kacper Gawlik");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(500, 500);
            setLocation(500,350);
            setVisible(true);
        }


}
