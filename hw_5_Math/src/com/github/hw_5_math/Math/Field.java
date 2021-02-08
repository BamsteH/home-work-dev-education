package com.github.hw_5_math.Math;

import java.util.Scanner;

public class Field {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("x = ");
        double x = scan.nextDouble();
        System.out.println("y = ");
        double y = scan.nextDouble();
        boolean b;

        if ( x >= -2){
            if (x < 0){
                if (y <= (-x)){
                    if (y >= -1.5 * x - 1){
                        b = false;
                    }
                    else {
                        b = true;
                    }
                }
                else {
                    b = true;
                }
            }
            else if (x == 0){
               if ( y > 0){
                   b = true;
                }
               else if (y < -1){
                   b = true;
               }
                else {
                    b = false;
                }
            }
            else if (x <= 2){
                if (y <= x){
                    if (y >= x/2 - 1){
                        b = false;
                    }
                    else {
                        b = true;
                    }
                }
                else {
                    b = true;
                }
            }
            else {
                b = true;
            }

        }
        else {
            b = true;
        }
        System.out.println(b);
    }
}
