package com.github.February_10;


import org.junit.Assert;
import org.junit.Test;

public class TestToPlaceASpaceAfterAllPunctuationMarks {

    @Test
    public void test_TTPASAAPM() {
        String exp = "Hello! My, friend. I, Love? You. ";
        String act = ToPlaceASpaceAfterAllPunctuationMarks.finder("Hello!My, friend.I,Love?You. ");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_TTPASAAPM2() {
        String exp = "! ? . , : ";
        String act = ToPlaceASpaceAfterAllPunctuationMarks.finder("!?.,:");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_TTPASAAPM3() {
        String exp = "Oh, no. Hello! ";
        String act = ToPlaceASpaceAfterAllPunctuationMarks.finder("Oh,no.Hello!");
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_TTPASAAPM4() {
        String act = ToPlaceASpaceAfterAllPunctuationMarks.finder(null);
        Assert.assertEquals(null, act);
    }


}
