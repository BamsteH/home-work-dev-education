package com.github.hw_5_math.Math;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("print start velocity of bullet");
        double velocityOfBullet = scan.nextDouble();
        System.out.println("print the started angle of shooting");
        double angle = scan.nextDouble();
        double g = 9.8;

        System.out.println("Answer is " + ((velocityOfBullet*velocityOfBullet/g)*(Math.sin(Math.toRadians(2*angle)))));

    }


}
