package com.github.February_10;

import org.junit.Assert;
import org.junit.Test;

public class TestPathValidator {

    @Test
    public void pathValidaor_test(){
        Boolean exp = true;
        Boolean act = PathValidator.validatorPath("C:/dope/can");
        Assert.assertEquals(exp , act);
    }


    @Test
    public void pathValidaor_test1(){
        Boolean exp = false;
        Boolean act = PathValidator.validatorPath("C>/hello/lol");
        Assert.assertEquals(exp , act);
    }


    @Test
    public void pathValidaor_test2(){
        Boolean exp = false;
        Boolean act = PathValidator.validatorPath("c:/hi>/");
        Assert.assertEquals(exp , act);
    }


}
