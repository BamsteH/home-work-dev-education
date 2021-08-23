package com.bitbucket.log4j;

import org.apache.log4j.Logger;

public class NewWeirdException extends RuntimeException{

    public NewWeirdException(String errorMasage){
        super(errorMasage);
        Logger.getLogger(NewWeirdException.class).info(errorMasage);
    }
}
