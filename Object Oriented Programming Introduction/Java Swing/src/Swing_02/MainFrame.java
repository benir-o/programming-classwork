package Swing_02;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private JFrame frame;
    public MainFrame(){
        initializeFrame();
    }
    private void initializeFrame(){
        frame=new JFrame();
        frame.setLayout(new BorderLayout(10,5));
        frame.setTitle("Java Swing JPanel Demo");
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel= new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        frame.add(panel,BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
