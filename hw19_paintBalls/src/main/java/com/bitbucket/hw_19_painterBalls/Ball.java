package com.bitbucket.hw_19_painterBalls;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ball extends JPanel implements Runnable {

    private int color;

    private int size;

    private int dx;

    private int dy;

    private Point point;

    private Random rnd = new Random();

    public Ball(Point point) {
        this.point = point;
        this.color = rnd.nextInt(2147000000);
        this.size = randomSize(40) ;
        this.dx = this.rnd.nextInt(10) - 5;
        this.dy = this.rnd.nextInt(10) - 5;
        setSize(this.size * 2 + 10, this.size * 2+10);
        setOpaque(Boolean.FALSE);
    }

    private void move() {
        JPanel pan = (JPanel) getParent();
        if (this.point.x <= 0 || this.point.x + this.size * 2 >= pan.getWidth()) {
            dx = -dx;
        }
        if (this.point.y <= 0 || this.point.y + 70 >= pan.getHeight()) {
            dy = -dy;
        }
        this.point.translate(dx, dy);
        setLocation(point);
    }

    private int randomSize(int size) {
       return rnd.nextInt(size) + 10;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(this.color));
        g2d.drawOval(11, 11, this.size, this.size);
    }

    @Override
    public void run() {
        try {
            while (true) {
                move();
                Thread.sleep(40);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().isInterrupted();
        }
    }
}
