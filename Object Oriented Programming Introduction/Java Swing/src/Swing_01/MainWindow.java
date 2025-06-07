package Swing_01;

import javax.swing.*;

public class MainWindow {
    /*JFrame is the top level container in Java Swing*/
    public JFrame window;
    public MainWindow(){
        window=new JFrame();
        window.setTitle("Hello World!");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800,500);
        window.setLocationRelativeTo(null);
    }
    public void show(){
        window.setVisible(true);
    }
}
