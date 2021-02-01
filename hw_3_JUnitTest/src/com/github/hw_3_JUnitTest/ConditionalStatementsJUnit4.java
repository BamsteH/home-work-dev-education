package com.github.hw_3_JUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalStatementsJUnit4 {
    /**
     * Первое задание
     */
    @Test
    public void HW_1_1_1_1() {
        int exp = 12;
        int act = ConditionalStatements.HW_1_1_1(4, 3);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void HW_1_1_1_2() {
        int exp = 6;
        int act = ConditionalStatements.HW_1_1_1(3, 3);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void HW_1_1_1_3() {
        int exp = 0;
        int act = ConditionalStatements.HW_1_1_1(0, 3);
        Assert.assertEquals(exp, act);
    }

    /**
     * Второе задание
     */
    @Test
    public void HW_1_1_2_1() {
        int exp = 1;
        int act = ConditionalStatements.HW_1_1_2(1, 1);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void HW_1_1_2_2() {
        int exp = 2;
        int act = ConditionalStatements.HW_1_1_2(-1, 1);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void HW_1_1_2_3() {
        int exp = 3;
        int act = ConditionalStatements.HW_1_1_2(-1, -1);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void HW_1_1_2_4() {
        int exp = 4;
        int act = ConditionalStatements.HW_1_1_2(1, -1);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void HW_1_1_2_5() {
        int exp = 0;
        int act = ConditionalStatements.HW_1_1_2(0, 0);
        Assert.assertEquals(exp, act);
    }

    /**
     * Третее задание
     */
    @Test
    public void HW_1_1_3_1() {
        int exp = 3;
        int act = ConditionalStatements.HW_1_1_3(0, 0, 3);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void HW_1_1_3_2() {
        int exp = 4;
        int act = ConditionalStatements.HW_1_1_3(0, 1, 3);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void HW_1_1_3_3() {
        int exp = 5;
        int act = ConditionalStatements.HW_1_1_3(2, 0, 3);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void HW_1_1_3_4() {
        int exp = 0;
        int act = ConditionalStatements.HW_1_1_3(0, 0, 0);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void HW_1_1_3_5() {
        int exp = 5;
        int act = ConditionalStatements.HW_1_1_3(1, 1, 3);
        Assert.assertEquals(exp, act);
    }

    /**
     * Четвёртое задание
     */
    @Test
    public void HW_1_1_4_1() {
        int exp = 6;
        int act = ConditionalStatements.HW_1_1_4(1, 2, 3);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void HW_1_1_4_2() {
        int exp = 0;
        int act = ConditionalStatements.HW_1_1_4(0, 0, 0);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void HW_1_1_4_3() {
        int exp = 4;
        int act = ConditionalStatements.HW_1_1_4(-1, 2, 3);
        Assert.assertEquals(exp, act);
    }
    @Test
    public void HW_1_1_4_4() {
        int exp = 24;
        int act = ConditionalStatements.HW_1_1_4(-2, -4, 3);
        Assert.assertEquals(exp, act);
    }
    /**
     *  Пятое задание
     */
    @Test
    public void HW_1_1_5_1() {
        String exp = "F";
        String act = ConditionalStatements.HW_1_1_5(1);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void HW_1_1_5_2() {
        String exp = "E";
        String act = ConditionalStatements.HW_1_1_5(20);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void HW_1_1_5_3() {
        String exp = "C";
        String act = ConditionalStatements.HW_1_1_5(70);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void HW_1_1_5_4() {
        String exp = "Введена неверная оценка";
        String act = ConditionalStatements.HW_1_1_5(120);
        Assert.assertEquals(exp, act);
    }
}

