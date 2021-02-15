package com.github.hw_6_Converter.time;

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
        JLabel txt_1 = new JLabel("Секунды");
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

        JButton b1 = new JButton("Convert to minutes");
        JButton b2 = new JButton("Convert to hours");
        JButton b3 = new JButton("Convert to days");
        JButton b4 = new JButton("Convert to weeks");
        JButton b5 = new JButton("Convert to month");
        JButton b6 = new JButton("Convert to years");

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
                    txt2.setText(String.valueOf(seconds / 60));
                    txt_2.setText("Минут");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 60));
                    txt_2.setText("Минут");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                float seconds = Float.parseFloat(txt1.getText());
                if (seconds >= 0) {
                    txt2.setText(String.valueOf(seconds / 3600));
                    txt_2.setText("Часов");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 3600));
                    txt_2.setText("Часов");
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                float seconds = Float.parseFloat(txt1.getText());
                if (seconds >= 0) {
                    txt2.setText(String.valueOf(seconds / (3600 * 24)));
                    txt_2.setText("Дней ");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 24 * 3600));
                    txt_2.setText("Дней ");
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                float seconds = Float.parseFloat(txt1.getText());
                if (seconds >= 0) {
                    txt2.setText(String.valueOf(seconds / (3600 * 24 * 7)));
                    txt_2.setText("Недель");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 3600 * 24 * 7));
                    txt_2.setText("Недель");
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                float seconds = Float.parseFloat(txt1.getText());
                if (seconds >= 0) {
                    txt2.setText(String.valueOf(seconds / (3600 * 24 * 7 * 4)));
                    txt_2.setText("Месяцев ");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 3600 * 24 * 7 * 4));
                    txt_2.setText("Месяцев");
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                float seconds = Float.parseFloat(txt1.getText());
                if (seconds >= 0) {
                    txt2.setText(String.valueOf(seconds / (3600 * 24 * 7 * 4 * 12)));
                    txt_2.setText("Лет ");
                } else {
                    txt1.setText(String.valueOf(Float.parseFloat(txt1.getText()) * 3600 * 24 * 7 * 4 * 12));
                    txt_2.setText("Лет");
                }
            }
        });




    }


}
