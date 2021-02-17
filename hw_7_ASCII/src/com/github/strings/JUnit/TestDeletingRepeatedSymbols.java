package com.github.strings.JUnit;

import com.github.strings.DeletingRepeatedSymbols;
import org.junit.Assert;
import org.junit.Test;

public class TestDeletingRepeatedSymbols {

    @Test
    public void test_1(){
        String exp = "аивпор";
        String act = DeletingRepeatedSymbols.function("ааааивапорп");
        Assert.assertEquals(exp, act);
    }
    @Test
    public void test_null(){
        String act = DeletingRepeatedSymbols.function(null);
        Assert.assertNull(act);
    }
}
