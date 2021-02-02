package com.github.hw_3_JUnitTest;

public class Cycles {
    /**
     *
     * @return - Find the sum of even numbers and their number in the range from 1 to 99
     */
    public static int findTheSumOfEvenNum() {
        int x = 1;
        int z = 0;
        while (x < 100) {
            if (x % 2 == 0) {
                z = z + 1;
            }
            x = x + 1;
        }
        System.out.println("All " + z);
        return z;
    }

    /**
     * @param x - inputed Num for checking to a prime num / or not prime
     */

    public static boolean checkingForAPrimeNumber(int x) {
        int z = 2;
        if (x < 2) {
            System.out.println("Chislo ne prostoe");
            return false;
        } else while (x != z) {
            if (x % z == 0) {
                System.out.println("Ne prostoe chislo");
                return false;
            }
            z += 1;
        }
        return true;
    }

    /**
     *
     * @param x - The number from which we will derive the root
     * @return - return rounded root
     */
    public static int finderRoots(int x) {
        int z = 0;
        int p = 0;
        do {
            z += 1;
            p = z * z;
        } while (x > p);
        if ((z * z) - x < x - (z - 1) * (z - 1)) {
            System.out.println(z);
            return z;
        } else {
            System.out.println(z - 1);
            return z - 1;
        }
    }

    /**
     *
     * @param x - input num.
     * @return - We return the calculated inputED factorial
     */
    public static int factorialCalculating(int x) {
        int R = 1;
        if (x <= 1) {
            System.out.println("1");
            return 1;
        }
        for (int i = 1; i <= x; i++) {
            R = R * i;
        }
        System.out.println(R);
        return R;
    }

    /**
     * @param x - is a num to calculate
     * @return s - is a calculated sum
     */
    public static int sumOfNums(int x) {
        int z = 0;
        int b = x;
        while (b > 9) {
            z += 1;
            b = b / 10;
        }
        int s = 0;
        while (z != -1) {
            s = (int) (s + (x / (Math.pow(10, z)) % 10));
            z = z - 1;
        }
        System.out.println(s);
        return s;
    }

    /**
     * @param x - This is the number that we will mirror
     * @return - we return mirrored num
     */
    public static int mirroredNum(int x) {
        int z = 0;
        int b = x;
        while (b > 9) {
            z += 1;
            b = b / 10;
        }
        int s = 0;
        int rez = 0;
        int inc = 0;
        while (z != -1) {
            s = (int) (x / Math.pow(10, z) % 10);
            rez = (int) (rez + (s * Math.pow(10, inc)));
            z = z - 1;
            inc = inc + 1;
        }
        System.out.println(rez);
        return rez;
    }
}
