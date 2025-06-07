package Swing_01;

import javax.swing.*;

public class JFrameDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                JFrameOne frameOne=new JFrameOne();
                JFrameTwo frameTwo=new JFrameTwo();

            }
        });
    }
}
