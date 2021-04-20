package com.github.hw_3_JUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class JUnit_Cycles {
    /**
     * testing the finder of sum of the even numbers
     */
    @Test
    public void testFindTheSumOfEvenNum() {
        int exp = 49;
        int act = Cycles.findTheSumOfEvenNum();
        Assert.assertEquals(exp, act);
    }

    /**
     * tester of a prime numbers
     */
    @Test
    public void test_1_CheckingForAPrimeNumber() {
        boolean exp = true;
        boolean act = Cycles.checkingForAPrimeNumber(7);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_2_CheckingForAPrimeNumber() {
        boolean exp = false;
        boolean act = Cycles.checkingForAPrimeNumber(8);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_3_CheckingForAPrimeNumber() {
        boolean exp = true;
        boolean act = Cycles.checkingForAPrimeNumber(11);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_4_CheckingForAPrimeNumber() {
        boolean exp = true;
        boolean act = Cycles.checkingForAPrimeNumber(3);
        Assert.assertEquals(exp, act);
    }

    /**
     * Finder roots
     */
    @Test
    public void test_1_finderRoots() {
        int exp = 2;
        int act = Cycles.finderRoots(4);
        Assert.assertEquals(exp, act);
    }


    @Test
    public void test_2_finderRoots() {
        int exp = 3;
        int act = Cycles.finderRoots(8);
        Assert.assertEquals(exp, act);
    }


    @Test
    public void test_3_finderRoots() {
        int exp = 0;
        int act = Cycles.finderRoots(0);
        Assert.assertEquals(exp, act);
    }

    /**
     * Calculator of factorials
     */

    @Test
    public void test_1_FactorialCalculating() {
        int exp = 24;
        int act = Cycles.factorialCalculating(4);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_2_FactorialCalculating() {                // Zero in factorial is always 1;
        int exp = 1;
        int act = Cycles.factorialCalculating(0);
        Assert.assertEquals(exp, act);
    }
    /**
     *
     */
    @Test
    public void test_1_sumOfNums() {
        int exp = 0;
        int act = Cycles.sumOfNums(0);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_2_sumOfNums() {
        int exp = 4;
        int act = Cycles.sumOfNums(310);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_3_sumOfNums() {
        int exp = 22;
        int act = Cycles.sumOfNums(598);
        Assert.assertEquals(exp, act);
    }
    /**
     * mirror
     */

    @Test
    public void test_1_mirroredNum() {
        int exp = 895;
        int act = Cycles.mirroredNum(598);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_2_mirroredNum() {
        int exp = 5;
        int act = Cycles.mirroredNum(5);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_3_mirroredNum() {
        int exp = 0;
        int act = Cycles.mirroredNum(0);
        Assert.assertEquals(exp, act);
    }

    @Test //expected -21, but error because because I didn't initialize the
          //conditions for numbers that are less than zero
    public void test_4_mirroredNum() {
        int exp = -21;
        int act = Cycles.mirroredNum(-12);
        Assert.assertEquals(exp, act);
    }

}
