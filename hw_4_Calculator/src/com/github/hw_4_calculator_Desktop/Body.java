package com.github.hw_4_calculator_Desktop;

import javax.swing.*;

public class Body extends JFrame {

    private JTextField numFirst;

    private JTextField numOperation;

    private JTextField numSecond;

    private JTextField numResult;

    public Body(ActionManager actionManager) {
        JPanel content = new JPanel();
        content.setLayout(null);

        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 430);
        frame.setLayout(null);
        frame.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("Calculate");
        button.setBounds(100, 200, 200, 75);
        frame.add(button);

        JLabel lblFirstNum = new JLabel("Первое число");
        lblFirstNum.setBounds(30, 20, 95, 40);
        frame.add(lblFirstNum);

        this.numFirst = new JTextField(20);
        numFirst.setBounds(130, 20, 160, 40);
        frame.add(numFirst);
        numFirst.setVisible(true);

        JLabel lblSecondNum = new JLabel("Второе число");
        lblSecondNum.setBounds(30, 140, 95, 40);
        frame.add(lblSecondNum);

        this.numSecond = new JTextField(20);
        numSecond.setBounds(130, 140, 160, 40);
        frame.add(numSecond);
        numSecond.setVisible(true);

        JLabel lblOperationNum = new JLabel("Операция");
        lblOperationNum.setBounds(30, 80, 95, 40);
        frame.add(lblOperationNum);

        this.numOperation = new JTextField(20);
        numOperation.setBounds(130, 80, 160, 40);
        frame.add(numOperation);
        numOperation.setVisible(true);

        JLabel lblResultNum = new JLabel("Result");
        lblResultNum.setBounds(30, 290, 95, 40);
        frame.add(lblResultNum);

        this.numResult = new JTextField(20);
        numResult.setBounds(130, 290, 160, 40);
        frame.add(numResult);
        numResult.setVisible(true);

        actionManager.setNumSecond(this.numSecond);
        actionManager.setNumFirst(this.numFirst);
        actionManager.setNumOperation(this.numOperation);
        actionManager.setNumResult(this.numResult);
        button.addActionListener(actionManager.getButtonAction());



    }

}
