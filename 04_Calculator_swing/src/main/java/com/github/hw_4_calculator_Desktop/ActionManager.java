package com.github.hw_4_calculator_Desktop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionManager {


    private JTextField numFirst;

    private JTextField numOperation;

    private JTextField numSecond;

    private JTextField numResult;

    public void setNumFirst(JTextField numFirst) {
        this.numFirst = numFirst;
    }

    public void setNumOperation(JTextField numOperation) {
        this.numOperation = numOperation;
    }

    public void setNumSecond(JTextField numSecond) {
        this.numSecond = numSecond;
    }

    public void setNumResult(JTextField numResult) {
        this.numResult = numResult;
    }

    private final  ButtonAction buttonAction = new ButtonAction();

    public ButtonAction getButtonAction() {
        return buttonAction;
    }

    private class ButtonAction implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int ourNumSecond = Integer.parseInt(numSecond.getText());
            int ourNumFirst = Integer.parseInt(numFirst.getText());
            String op = numOperation.getText();
            double result = Calc.calc(ourNumFirst, ourNumSecond,op);
            numResult.setText(String.valueOf(result));
        }


    }



}
