package com.github.hw_3_JUnitTest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OneDimansionalArrays app = new OneDimansionalArrays(new Scanner(System.in));
        System.out.println(app.countOfOddInArray());
        OneDimansionalArrays rest = new OneDimansionalArrays(new Scanner(System.in));
        System.out.println(Arrays.toString(rest.reverseOfArray()));
        OneDimansionalArrays rekt = new OneDimansionalArrays(new Scanner(System.in));
        System.out.println(Arrays.toString(rekt.changerOfArray()));
    }

}
