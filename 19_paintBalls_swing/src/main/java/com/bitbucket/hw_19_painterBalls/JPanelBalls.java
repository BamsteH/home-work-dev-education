package com.bitbucket.hw_19_painterBalls;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JPanelBalls extends JPanel {
    public JPanelBalls() {
        setLayout(null);
        setBounds(1,1,600,400);
        setBorder(BorderFactory.createBevelBorder(1, Color.DARK_GRAY,Color.DARK_GRAY));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Ball ball = new Ball(e.getPoint());
                add(ball);
                Thread thread = new Thread(ball);
                thread.start();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        setVisible(Boolean.TRUE);
    }
}
