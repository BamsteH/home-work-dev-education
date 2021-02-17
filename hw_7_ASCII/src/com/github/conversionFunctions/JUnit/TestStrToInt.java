package com.github.conversionFunctions.JUnit;

import com.github.conversionFunctions.FromStringToFloat;
import com.github.conversionFunctions.FromStringToInt;
import org.junit.Assert;
import org.junit.Test;

public class TestStrToInt {

    @Test
    public void test_1() {
        Integer exp = 1;
        Integer act = FromStringToInt.function("1");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_2() {
        Integer exp = 0;
        Integer act = FromStringToInt.function("0");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_3() {
        Integer exp = -1;
        Integer act = FromStringToInt.function("-1");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_null() {
        Integer act = FromStringToInt.function(null);
        Assert.assertNull(act);
    }
}

