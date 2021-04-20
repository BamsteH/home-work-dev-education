package com.github.hw_3_JUnitTest;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class JUnitTestOneDimansionalArrays {
    @Test
    public void test_1_minimalElementOfArray() {
        int exp = 1;
        int act = OneDimansionalArrays.minimalElementOfArray(1, 2, 3);
        Assert.assertEquals(exp, act);
    }

    /**
     *
     */
    @Test
    public void test_1_maximumElementOfArray() {
        int exp = 3;
        int act = OneDimansionalArrays.maximumElementOfArray(1, 2, 3);
        Assert.assertEquals(exp, act);
    }

    /**
     *
     */

    @Test
    public void test_1_indexOfMinimal() {
        int exp = 0;
        int act = OneDimansionalArrays.indexOfMinimal(1, 2, 3);
        Assert.assertEquals(exp, act);
    }

    /**
     *
     */

    @Test
    public void test_1_indexOfMax() {
        int exp = 0;
        int act = OneDimansionalArrays.indexOfMinimal(1, 2, 3);
        Assert.assertEquals(exp, act);
    }

    /**
     * На это у меня ушло 3 часа поиска информации, но я FINALLY сделал это!
     */
    @Test
    public void test_1_countOfOddInArray() {
        ByteArrayInputStream in = new ByteArrayInputStream("3\n14\n1\n2".getBytes());
        OneDimansionalArrays app = new OneDimansionalArrays(new Scanner(in));
        int exp = 1;
        Assert.assertEquals(exp, app.countOfOddInArray());
    }

    /**
     * не работает, не знаю почему. Возможно из-за "пулл строк" или что-то такое
     */

    @Test
    public void test_1_reverseOfArray() {
        ByteArrayInputStream in = new ByteArrayInputStream("3\n14\n1\n2".getBytes());
        OneDimansionalArrays rest = new OneDimansionalArrays(new Scanner(in));
        int[] exp;
        exp = new int[3];
        exp[0] = 2;
        exp[1] = 1;
        exp[2] = 14;
        Assert.assertEquals(exp, rest.reverseOfArray());
    }
    /**
     *
     */
    @Test
    public void test_1_changerOfArray() {
        ByteArrayInputStream in = new ByteArrayInputStream("3\n14\n1\n2".getBytes());
        OneDimansionalArrays rekt = new OneDimansionalArrays(new Scanner(in));
        int exp = 2;
        Assert.assertEquals(exp, rekt.changerOfArray());
    }


}