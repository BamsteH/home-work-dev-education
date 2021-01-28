package com.github.hw_1_randomizer;

import java.util.Scanner;
import java.util.Random;

public class DE_random {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome in Random_Java. Please, enter the maximum of the generated numbers from 1 to 100");
        int MX = in.nextInt();
        System.out.println("Please enter minimum of the generated numbers");
        int min = in.nextInt();
        System.out.println("Please, enter the maximum of the generated numbers");
        int max = in.nextInt();
        int j = 0;
        String A = ("generate");
        System.out.println("generate");
        String B = ("help");
        System.out.println("help");
        String C = ("exit");
        System.out.println("exit");
        String K = in.nextLine();
        K = in.nextLine();
        int all[];
        max += 1;
        all = new int[MX];
        int warning = max - min;
        while (!K.equals(C)) {
            if (K.equals(A)) {
                if (j < warning) {
                    if (j < MX) {
                        int RN = gen.nextInt(max - min);
                        RN += min;
                        int pr = 0;
                        while (pr == 0) {
                            for (int i = 0; i <= j; i++) {
                                if (RN == all[i]) {
                                    RN = gen.nextInt(max - min);
                                    RN += min;
                                    pr = 0;
                                    break;
                                } else {
                                    pr = 1;
                                }
                            }
                        }
                        all[j] = RN;
                        j += 1;
                        System.out.println(RN);
                    }
                } else {
                    System.out.println("Вы превысили лимит");
                }
            } else if (K.equals(B)) {
                System.out.println("generate - выводит на экран случайное число по заданному интервалу. Максимальное количество чисел не превышает заданное.\n exit - выход из программы. \n Если вы видите ошибку @unknow error, то, скорее всего, Вы ввели команду неправильно. Вводите, пожалуйста всё с нижним регистром. ");
            } else {
                System.out.println("Unknown command. Try again or enter <<help>>");
            }
            K = in.nextLine();
        }
        System.out.println("Пока-пока!");
    }
}