package Swing_02;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private JFrame frame;
    public MainFrame(){
        initialize();
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
    private void initialize(){
        frame= new JFrame();
        frame.setTitle("BorderPane Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        BorderLayout borderLayout=new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(10);
        frame.setLayout(borderLayout);
        frame.setLocationRelativeTo(null);
        frame.add(new JButton("NORTH"),BorderLayout.NORTH);
        frame.add(new JButton("WEST"),BorderLayout.WEST);
        frame.add(new JButton("EAST"),BorderLayout.EAST);
        frame.add(new JButton("SOUTH"),BorderLayout.SOUTH);
        frame.add(new JButton("CENTER"),BorderLayout.CENTER);



        frame.setVisible(true);
    }
}
