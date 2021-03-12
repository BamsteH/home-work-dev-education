package com.bitbucket.simplePaint.gui;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private Integer[] widthList = {1,2,3,4,5,6,7,8,9,10,12,14,16,18,20,22,24,28,32,40,48,64};

    public ButtonsPanel(PaintPanel paintPanel) {
        setBounds(640, 3, 100, 200);
        setLayout(null);
        Button buttonColor = new Button("Color Choose");
        Button buttonWidth = new Button("Width Choose");
        Button buttonClrScr = new Button("Clear Screen");
        Button buttonSave = new Button("Save to");

        buttonColor.setBounds(10, 5, 80, 30);
        buttonWidth.setBounds(10, 40, 80, 30);
        buttonClrScr.setBounds(10, 75, 80, 30);
        buttonSave.setBounds(10, 110, 80, 30);

        buttonClrScr.addActionListener(e -> {
            paintPanel.clear();
        });

        buttonColor.addActionListener(e -> {
            paintPanel.setColor(JColorChooser.showDialog(new JFrame(), "Color", Color.BLACK).getRGB());
        });

        buttonWidth.addActionListener(e -> {
            paintPanel.setWidth((int) JOptionPane.showInputDialog(new JFrame(),"Width:",
                    "Choose width",JOptionPane.INFORMATION_MESSAGE, new ImageIcon(),widthList,1));
        });

        add(buttonColor);
        add(buttonWidth);
        add(buttonClrScr);
        add(buttonSave);
    }

}