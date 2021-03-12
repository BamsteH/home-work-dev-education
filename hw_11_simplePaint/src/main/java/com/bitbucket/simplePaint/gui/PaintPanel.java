package com.bitbucket.simplePaint.gui;

import com.bitbucket.simplePaint.config.CustomLine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

public class PaintPanel extends JPanel implements MouseMotionListener, MouseListener {

    public PaintPanel() {
        setBounds(3, 1, 600, 450);
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(Boolean.TRUE);
    }

    public int width = 1;

    public void setWidth(int width) {
        this.width = width;
    }

    public int color = Color.BLACK.getRGB();

    public void setColor(int color) {
        this.color = color;
    }

    private int x, y;

    private List<CustomLine> lines = new ArrayList<>();

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        for (CustomLine line : this.lines) {
            g2d.setStroke(new BasicStroke(line.getWidth()));
            g2d.setColor(new Color(line.getColor()));
            g2d.drawLine(line.getOldX(), line.getOldY(), line.getX(), line.getY());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
        this.lines.add(new CustomLine(this.x, this.y, this.x, this.y, this.color,this.width));
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int newX = e.getX();
        int newY = e.getY();
        this.lines.add(new CustomLine(this.x, this.y, newX, newY, this.color,this.width));
        this.x = newX;
        this.y = newY;
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public void clear() {
        this.lines = new ArrayList<>();
        repaint();
    }
}
