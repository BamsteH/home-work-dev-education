package com.github.hw_5_math.Math;

import java.util.Scanner;

public class TwoCars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Velocity of 1 car");
        double velocityFirst = scan.nextDouble();
        System.out.println("Velocity of 2 car");
        double velocitySecond = scan.nextDouble();
        System.out.println("The inital distance between them");
        int s = scan.nextInt();
        System.out.println("How much long they are in a road");
        int t = scan.nextInt();


        System.out.println("Distance between 2 cars are " + ((velocityFirst * t) + (s) + (velocitySecond *t)) + "kms");

    }

}
