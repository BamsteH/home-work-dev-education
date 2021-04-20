package org.bitbucket.balls;

import javax.swing.*;
import java.awt.*;

public class ApplicationFrame  extends JFrame {

    public ApplicationFrame() throws HeadlessException {
        setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(10,10,800,600);
        setVisible(Boolean.TRUE);

        JPanel ballPanel = new BallPanel();
        this.add(ballPanel);


    }
}
