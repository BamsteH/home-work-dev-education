package com.github.hw_4_calculator_Desktop;

public class Calc {

    public static double calc(int a,int b, String c) {

        double result = 0;
        switch (c){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a / b;
                break;

        }
        return  result;

    }

}
