package Swing_01;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                MainWindow main=new MainWindow();
                main.show();
            }
        });
        /*
        Ensures all our Swing code runs on the same thread,
        the event dispatch thread. This is because Swing is not
        thread safe.
         */
    }
}
