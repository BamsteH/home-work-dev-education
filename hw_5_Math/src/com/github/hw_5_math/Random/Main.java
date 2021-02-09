package com.github.hw_5_math.Random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AllAcceptedRandomInOne.output(10,1,1);

        AllAcceptedRandomInOne.output(10,1,10);

        AllAcceptedRandomInOne.output(0,10,10);

        AllAcceptedRandomInOne.output(20,50,10);

        AllAcceptedRandomInOne.output(-10, 10, 10);

        AllAcceptedRandomInOne.output(-10,35,AllAcceptedRandomInOne.random(3,15));
    }
}
