package com.github.hw_5_math.Random;

import java.util.Random;
import java.util.Scanner;

public class AllAcceptedRandomInOne {

    static final Scanner scan = new Scanner(System.in);

    private static int countOfRanNums(int n){
        return n;
    }

    public static int random(int min, int max){
        Random gen = new Random();
        int randomNum = gen.nextInt(max-min);
        randomNum += min + 1;
        return randomNum;
    }

    public static int fullRandom(){
        Random gen = new Random();
        int randomNum = gen.nextInt();
        System.out.println(randomNum);
        return randomNum;
    }

    public static void output(int min, int max, int n){
        int k = 0;
        if (max < min){
            while (k < n){
                k += 1;
                fullRandom();
            }
        }
        else{
            while (k < n){
                k+=1;
                int ran = random(min,max);
                System.out.println(ran);
            }
        }
    }


}
