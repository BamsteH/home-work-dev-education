package com.github.February_10;

import org.junit.Assert;
import org.junit.Test;

public class TestReverseSlash {

    @Test
    public void ReverseSlash_test1(){
        String exp = "hello\\\\";
        String act = ReverseSlash.method("hello/");
        Assert.assertEquals( exp , act );
    }

    @Test
    public void ReverseSlash_test2(){
        String exp = "C:\\\\dump\\\\";
        String act = ReverseSlash.method("C:/dump/");
        Assert.assertEquals( exp , act );
    }

}
