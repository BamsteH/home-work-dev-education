package com.github.hw_6_Converter.length;

import com.github.hw_6_Converter.length.JPanelApp;

public class JFrameApp extends javax.swing.JFrame {
    public JFrameApp() {
        setBounds(600, 200, 350, 450);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JPanelApp());
        setVisible(true);
    }
}