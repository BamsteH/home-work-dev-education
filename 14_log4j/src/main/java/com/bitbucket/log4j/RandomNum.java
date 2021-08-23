package com.bitbucket.log4j;

import java.util.Random;

public class RandomNum {
    private int i;
    
    public int randomInt(){
     return new Random().nextInt(11);
    }
}
