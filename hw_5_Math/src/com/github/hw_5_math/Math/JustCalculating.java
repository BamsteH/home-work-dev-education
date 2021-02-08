package com.github.hw_5_math.Math;


import java.util.Scanner;

public class JustCalculating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("x");
        int x = scan.nextInt();

        double cos = Math.cos(Math.toRadians(x));
        double sin = Math.sin(Math.toRadians(x));
        double e = Math.exp(1);

        double second = Math.abs(cos/Math.pow(e,sin));
        double sqrt = Math.sqrt( (Math.pow(e,x+1)) + 2 * (Math.pow(e,x)) * cos );
        double parenthesis = (x - (Math.pow(e, x+1)) * sin );
        double first = (6 * Math.log(sqrt)) / (Math.log(parenthesis));
        double answer = second+first;


        System.out.println("answer" + answer);
    }

}
