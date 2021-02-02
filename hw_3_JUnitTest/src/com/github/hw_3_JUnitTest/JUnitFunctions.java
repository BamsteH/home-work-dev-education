package com.github.hw_3_JUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class JUnitFunctions {

    /***
     * HW141. Дни недели с номера дня недели
     */
    @Test
    public void test_1_HW141() {
        String exp = "Saturday";
        String act = Functions.HW141(1);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_2_HW141() {
        String exp = "error";
        String act = Functions.HW141(8);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void test_3_HW141() {
        String exp = "Monday";
        String act = Functions.HW141(2);
        Assert.assertEquals(exp, act);
    }

    /**
     *
     */

    @Test
    public void test_1_strFromNum() {
        String exp = "один";
        String act = Functions.strFromNum(1);
        Assert.assertEquals(exp, act);
    }


    @Test
    public void test_3_strFromNum() {
        String exp = "сто пятьдесят пять";
        String act = Functions.strFromNum(155);
        Assert.assertEquals(exp, act);
    }


    @Test
    public void test_2_strFromNum() {
        String exp = "ноль";
        String act = Functions.strFromNum(0);
        Assert.assertEquals(exp, act);
    }

    /**
     *
     *
     */


    @Test
    public void test_1_fromStrToNum() {
        int exp = 1;
        int act = Functions.fromStrToNum("один");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_2_fromStrToNum() {
        int exp = 101;
        int act = Functions.fromStrToNum("сто один");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_3_fromStrToNum() {
        int exp = 0;
        int act = Functions.fromStrToNum("ноль");
        Assert.assertEquals(exp, act);
    }

    /**
     *Тут будем округлять
     */

    @Test
    public void test_1_coordinates() {
        int exp = 2;
        int act = Functions.coordinates(0,0,2,1);
        Assert.assertEquals(exp, act);
    }


    /**
     *
     */
    @Test
    public void test_1_bigFromStrToNum() {
        long exp = 0;
        long act = Functions.bigFromStrToNum("ноль");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_2_bigFromStrToNum() {
        long exp = 300;
        long act = Functions.bigFromStrToNum("триста");
        Assert.assertEquals(exp, act);
    }
}
