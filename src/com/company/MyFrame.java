package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

        public MyFrame() {
            super("Aplication from Kacper Gawlik");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(1000, 700);
            setLocation(500,200);
            add(new JButton("Facebook "));
            add(new JButton("Messenger "));
            add(new JButton("Snapchat "));
            setLayout(new FlowLayout());


            setVisible(true);
        }


}
