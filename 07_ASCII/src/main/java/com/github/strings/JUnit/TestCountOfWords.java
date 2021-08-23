package com.github.strings.JUnit;

import com.github.strings.CountOfWords;
import org.junit.Assert;
import org.junit.Test;

public class TestCountOfWords {
    @Test
    public void test_1() {
        int exp = 6;
        int act = CountOfWords.function("Dd d d !! f   f, d,:?    ?");
        Assert.assertEquals(exp,act);
    }
    @Test
    public void test_2() {
        int exp = 0;
        int act = CountOfWords.function("!!!                            !:...                ");
        Assert.assertEquals(exp,act);
    }
    @Test
    public void test_null() {
        int exp = 6;
        int act = CountOfWords.function("Dd d d !! f   f, d,:?    ?");
    }
}



