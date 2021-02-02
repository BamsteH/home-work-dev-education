package com.github.hw_3_JUnitTest;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimansionalArrays {

    /**
     * @return = return minimal value from Array
     */
    public static int minimalElementOfArray(int a1, int a2, int a3) {
        int[] Array;
        Array = new int[3];
        Array[0] = a1;
        Array[1] = a2;
        Array[2] = a3;
        int k = Array[0];
        for (int lop = 0; lop < 3; lop++) {
            if (k > Array[lop]) {
                k = Array[lop];
            }
        }
        System.out.println(k);
        return k;
    }


    /**
     * @return = return minimal value from Array
     */
    public static int maximumElementOfArray(int a1, int a2, int a3) {
        int[] Array;
        Array = new int[3];
        Array[0] = a1;
        Array[1] = a2;
        Array[2] = a3;
        int k = Array[0];
        for (int lop = 0; lop < 3; lop++) {
            if (k < Array[lop]) {
                k = Array[lop];
            }
        }
        System.out.println(k);
        return k;
    }

    /**
     * @param
     */
    public static int indexOfMinimal(int a1, int a2, int a3) {
        int[] Array;
        Array = new int[3];
        Array[0] = a1;
        Array[1] = a2;
        Array[2] = a3;
        int k = Array[0];
        int b = 0;
        for (int lop = 0; lop < 3; lop++) {
            if (k > Array[lop]) {
                k = Array[lop];
                b = lop;
            }
        }
        System.out.println(b);
        return b;
    }

    /**
     *
     */

    public static int indexOfMax(int a1, int a2, int a3) {
        int[] Array;
        Array = new int[3];
        Array[0] = a1;
        Array[1] = a2;
        Array[2] = a3;
        int k = Array[0];
        int b = 0;
        for (int lop = 0; lop < 3; lop++) {
            if (k < Array[lop]) {
                k = Array[lop];
                b = lop;
            }
        }
        System.out.println(b);
        return b;
    }

    /***
     *
     */
    private final Scanner scanner;

    public OneDimansionalArrays(Scanner scanner) {
        this.scanner = scanner;
    }

    public int countOfOddInArray() {
        System.out.println("Длина массива будет: ");
        int i = scanner.nextInt();
        int[] Array;
        Array = new int[i];
        for (int lop = 0; lop < i; lop++) {
            Array [lop] = scanner.nextInt();
        }
        int b = 0;
        for (int lop = 1; lop < i; lop= lop+2) {
            b = b + Array[lop];
        }
        System.out.println(b);
        return b;
    }

    /**
     *
     *
     */
    public int[] reverseOfArray() {
        System.out.println("Длина массива будет: ");
        int i = scanner.nextInt();
        int[] Array;
        Array = new int[i];
        for (int lop = 0; lop < i; lop++) {
            Array[lop] = scanner.nextInt();
        }
        int[] NewArray = new int[Array.length];
        for (int lop = 0; lop < Array.length; lop++) {
            NewArray[lop] = Array[Array.length - 1 - lop];
        }
        for (int lop = 0; lop < Array.length; lop++) {
            System.out.println(NewArray[lop]);
        }
        return NewArray;
    }


    /**
     *
     *
     */

    public int[] changerOfArray(){
        System.out.println("Длина массива будет: ");
        int i = scanner.nextInt();
        int[] Array;
        Array = new int[i];
        int k = 0;
        for (int p = 0; p < i; p++) {
            Array[p] = scanner.nextInt();
        }
        int[] newArray = new int[Array.length];
        for (int lop = 0; lop < Array.length; lop++) {
            if (lop < Array.length / 2) {
                newArray[lop] = Array[Array.length / 2 + lop];
            } else {
                newArray[lop] = Array[k];
                k += 1;
            }
        }
        for (int pp = 0; pp < Array.length; pp++) {
            System.out.println(newArray[pp]);
        }
        return newArray;
    }


    /** public static int countOfOddInArray(int a1, int a2, int a3) {
         int[] Array;
         Array = new int[3];
         Array[0] = a1;
         Array[1] = a2;
         Array[2] = a3;
     int b = 0;
     for (int lop = 1; lop < 3; lop= lop+2) {
     b = b + Array[lop];
     }
     System.out.println(b);
     return b;
     }
*/

}
