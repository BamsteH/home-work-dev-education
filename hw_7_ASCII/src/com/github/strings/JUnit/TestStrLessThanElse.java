package com.github.strings.JUnit;

import com.github.strings.StrLessThanElse;
import org.junit.Assert;
import org.junit.Test;

public class TestStrLessThanElse {
    @Test
    public void test_1(){
        String exp = "Куда";
        String act = StrLessThanElse.splitter("Куда катится ,лучший мирской,народ?");
        Assert.assertEquals(exp,act);
    }
    @Test
    public void test_2(){
        String exp = "Куда";
        String act = StrLessThanElse.splitter("Куда,,,, катится,лучший,мирской,народ?");
        Assert.assertEquals(exp,act);
    }

    @Test
    public void test_3(){
        String exp = "Куда";
        String act = StrLessThanElse.splitter("Куда            катится     ,лучший мирской                     ,   народ?");
        Assert.assertEquals(exp,act);
    }
    @Test
    public void test_null(){
        String act = StrLessThanElse.splitter(null);
        Assert.assertNull(act);
    }



}
