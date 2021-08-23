package com.bitbucket.simplePaint.gui;

import javax.swing.*;
import java.awt.*;

public class PaintFrame extends JFrame {

    public PaintFrame(PaintPanel paintPanel, ButtonsPanel buttonsPanel) throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        add(paintPanel);
        add(buttonsPanel);
        setBounds(100, 100, 800, 600);
        setVisible(Boolean.TRUE);
    }

}
