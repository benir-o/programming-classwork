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
        panel.setBackground(Color.BLUE);
        frame.add(panel,BorderLayout.CENTER);

        Button button1 =new Button("Button");
        panel.add(button1);

        Button button2 =new Button("Button");
        panel.add(button2);

        Button button3 =new Button("Button");
        panel.add(button3);

        frame.setVisible(true);
    }
}
