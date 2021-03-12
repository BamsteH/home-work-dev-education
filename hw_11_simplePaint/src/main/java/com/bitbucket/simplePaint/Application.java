package com.bitbucket.simplePaint;

import com.bitbucket.simplePaint.gui.ButtonsPanel;
import com.bitbucket.simplePaint.gui.PaintFrame;
import com.bitbucket.simplePaint.gui.PaintPanel;

import java.awt.*;

public class Application {
    public static void main(String[] args) {
        PaintPanel paintPanel = new PaintPanel();
        new PaintFrame(paintPanel,new ButtonsPanel(paintPanel)).getContentPane().setBackground(Color.orange);
    }
}
