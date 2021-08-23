package com.github.strings.JUnit;

import com.github.strings.DollarInsteadOfSymbols;
import org.junit.Assert;
import org.junit.Test;


public class TestDollarInsteadOfSymbols {
    @Test
    public void test_1() {
        String[] exp = {"Джин", "Д$", "К$"};
        String[] str = {"Джин", "Джинс", "Класс"};
        String[] act = DollarInsteadOfSymbols.function(str, 5);
        for (int i = 0; i < str.length; i++) {
            assert act != null;
            Assert.assertEquals(exp[i], act[i]);
        }
    }
    @Test
    public void test_null_1() {
        String[] act = DollarInsteadOfSymbols.function(null,1);
        Assert.assertNull(act);
    }

    @Test
    public void test_null_2() {
        String[] str = {""};
        String[] act = DollarInsteadOfSymbols.function(str,null);
        Assert.assertNull(act);
    }
    @Test
    public void test_null_3() {
        String[] act = DollarInsteadOfSymbols.function(null,null);
        Assert.assertNull(act);
    }



}
