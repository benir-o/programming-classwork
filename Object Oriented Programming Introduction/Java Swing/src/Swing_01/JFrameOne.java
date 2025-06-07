package Swing_01;

import javax.swing.*;

public class JFrameOne extends JFrame {
    public JFrameOne(){
        initializeFrame();
    }
    public void initializeFrame(){
        setTitle("JFrameOne");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);//This centers the JFrame on the screen.
        setResizable(false);//This prevents us from resetting the window size once the frame is visible
        setVisible(true);
    }
    /*
    This method of creating frames is inefficient because it exposes
    all other methods of JFrame to the outside world.
     */
}
