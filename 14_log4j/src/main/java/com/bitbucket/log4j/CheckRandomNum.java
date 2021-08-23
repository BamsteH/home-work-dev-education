package com.bitbucket.log4j;

import org.apache.log4j.Logger;

import java.util.Random;

public class CheckRandomNum {

    private static final Logger log = Logger.getLogger(CheckRandomNum.class);

    public void trueOrException(){
        if (new RandomNum().randomInt() > 5){
            log.info("Программа запущена успешно");
            System.out.println("Программа запущена успешно");
        } else {
            throw new NewWeirdException("Ошибка");
        }
    }
}
