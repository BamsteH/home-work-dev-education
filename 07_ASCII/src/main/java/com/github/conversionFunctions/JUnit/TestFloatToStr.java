package com.github.conversionFunctions.JUnit;

import com.github.conversionFunctions.FromFloatToString;
import com.github.conversionFunctions.FromIntToString;
import org.junit.Assert;
import org.junit.Test;

public class TestFloatToStr {
    @Test
    public void test_1(){

        String exp = "0.5555";

        String act = FromFloatToString.function(0.5555F);

        Assert.assertEquals(exp, act);

    }
    @Test
    public void test_2(){

        String exp = "331.23322";

        String act = FromFloatToString.function(331.233214421312F);

        Assert.assertEquals(exp, act);

    }
    @Test
    public void test_3(){

        String exp = "0.0";

        String act = FromFloatToString.function(0.000000000000F);

        Assert.assertEquals(exp, act);

    }
    @Test
    public void test_null(){

        String exp = "";

        String act = FromFloatToString.function(null);

        Assert.assertEquals(exp, act);

    }

}
