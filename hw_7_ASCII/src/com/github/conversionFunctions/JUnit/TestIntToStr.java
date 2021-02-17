package com.github.conversionFunctions.JUnit;

import com.github.conversionFunctions.FromIntToString;
import org.junit.Assert;
import org.junit.Test;

public class TestIntToStr {


    @Test
    public void test_1(){

        String exp = "1";

        String act = FromIntToString.function(1);

        Assert.assertEquals(exp, act);

    }

    @Test
    public void test_2(){

        String exp = "0";

        String act = FromIntToString.function(0);

        Assert.assertEquals(exp, act);

    }
    @Test
    public void test_4(){

        String exp = "21000";

        String act = FromIntToString.function(21000);

        Assert.assertEquals(exp, act);

    }
    @Test
    public void test_3(){

        String exp = "Error";

        String act = FromIntToString.function(null);

        Assert.assertEquals(exp, act);

    }


}
