package com.github.conversionFunctions.JUnit;

import com.github.conversionFunctions.FromStringToFloat;
import org.junit.Assert;
import org.junit.Test;

public class TestStrToFloat {
    @Test
    public void test_1(){
        Float exp = 1.0F;
        Float act = FromStringToFloat.function("1");
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test_2(){
        Float exp = 0.0F;
        Float act = FromStringToFloat.function("0");
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test_3(){
        Float exp = 10000.0F;
        Float act = FromStringToFloat.function("10000");
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test_null(){
        Float act = FromStringToFloat.function(null);
        Assert.assertNull(act);
    }



}
