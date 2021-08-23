package com.bitbucket.hw_19_painterBalls;

import javax.swing.*;
import java.awt.*;

public class PainterJFrame extends JFrame {

    public PainterJFrame() throws HeadlessException {
        setLayout(null);
        setSize(800,600);
        JPanelBalls ballPan = new JPanelBalls();
        ballPan.setBounds(10, 10, 780, 580);
        add(ballPan);
        setVisible(Boolean.TRUE);
    }
}
