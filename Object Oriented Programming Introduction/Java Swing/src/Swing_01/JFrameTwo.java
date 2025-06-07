package Swing_01;

import javax.swing.*;

public class JFrameTwo {
    /*
    Creating frames by composition
     */
    private JFrame frameTwo;
    public JFrameTwo(){
        initializeFrame();
    }
    private void initializeFrame(){
        frameTwo=new JFrame();
        this.frameTwo.setTitle("FrameTwo");
        this.frameTwo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frameTwo.setSize(500,400);
        this.frameTwo.setLocationRelativeTo(null);
        this.frameTwo.setResizable(false);
        this.frameTwo.setVisible(true);
    }
}
