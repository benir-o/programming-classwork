package Swing_02;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    public MainFrame(){
        gridLayout();
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


        panel=new JPanel(new FlowLayout(FlowLayout.CENTER,10,5));
        panel.setBackground(Color.pink);

        //Adding five Buttons to the panel
        for (int i=1;i<=5;i++){
            JButton button=new JButton("Button"+ Integer.toString(i));
            panel.add(button);
        }
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);

        frame.add(panel,BorderLayout.NORTH);

        frame.setVisible(true);
    }
    private void gridLayout(){
        frame=new JFrame();
        frame.setTitle("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        panel =new JPanel(new GridLayout(4,5,10,10));

        for (int i=1;i<=20;i++){
            JButton button=new JButton("Button"+ Integer.toString(i));
            panel.add(button);
        }
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
