package com.github.hw_6_Converter.kg;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelApp extends JPanel {

    private JButton b1, b2, b3, b4, b5, b6;
    private JTextField txt1, txt2;
    private JLabel txt_1, txt_2;

    public void setTxt1(JTextField txt1) {
        this.txt1 = txt1;
    }

    public void setTxt2(JTextField txt2) {
        this.txt2 = txt2;
    }

    public JPanelApp() {
        setLayout(null);
        JLabel txt_1 = new JLabel("KG's");
        txt_1.setBounds(30, 10, 100, 20);
        add(txt_1);
        JTextField txt1 = new JTextField(15);
        txt1.setBounds(10, 30, 110, 20);
        add(txt1);

        JLabel txt_2 = new JLabel("Текст");
        txt_2.setBounds(200, 10, 100, 20);
        add(txt_2);
        JTextField txt2 = new JTextField(15);
        txt2.setBounds(180, 30, 110, 20);
        add(txt2);

        JButton b1 = new JButton("Convert to gr");
        JButton b2 = new JButton("Convert to carat");
        JButton b3 = new JButton("Convert to eng pound");
        JButton b4 = new JButton("Convert to pound");
        JButton b5 = new JButton("Convert to stone ");
        JButton b6 = new JButton("Convert to rus pound");

        b1.setBounds(20, 80, 280, 40);
        b2.setBounds(20, 130, 280, 40);
        b3.setBounds(20, 180, 280, 40);
        b4.setBounds(20, 230, 280, 40);
        b5.setBounds(20, 280, 280, 40);
        b6.setBounds(20, 330, 280, 40);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                float seconds = Float.parseFloat(txt1.getText());
                if (seconds >= 0) {
                    txt2.setText(String.valueOf(seconds * 1000));
                    txt_2.setText("gr");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 60));
                    txt_2.setText("gr");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                try{
                    float seconds = Float.parseFloat(txt1.getText());

                    txt2.setText(String.valueOf(seconds * 5000 ));
                    txt_2.setText("carat");

                } catch (NumberFormatException e){
                    txt1.setText(String.valueOf(Float.parseFloat(txt2.getText()) * 3600));
                    txt_2.setText("carat");
                }
                }

        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                float seconds = Float.parseFloat(txt1.getText());
                if (seconds >= 0) {
                    txt2.setText(String.valueOf(seconds * 2.2));
                    txt_2.setText("eng pound ");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 24 * 3600));
                    txt_2.setText("eng pound ");
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                if(txt1.getText() != ""){

                    float seconds = Float.parseFloat(txt1.getText());
                    if (seconds >= 0) {
                        txt2.setText(String.valueOf(seconds * 0.061));
                        txt_2.setText("pound");
                    } else {
                        txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 3600 * 24 * 7));
                        txt_2.setText("pound");
                    }
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                float seconds = Float.parseFloat(txt1.getText());
                if (seconds >= 0) {
                    txt2.setText(String.valueOf(seconds * 0.1574));
                    txt_2.setText("stone ");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 3600 * 24 * 7 * 4));
                    txt_2.setText("stone");
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                float seconds = Float.parseFloat(txt1.getText());
                if (seconds >= 0) {
                    txt2.setText(String.valueOf(seconds * 2.44));
                    txt_2.setText("rus pound ");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 3600 * 24 * 7 * 4 * 12));
                    txt_2.setText("rus pound");
                }
            }
        });




    }


}
