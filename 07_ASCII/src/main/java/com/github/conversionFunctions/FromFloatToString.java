package com.github.conversionFunctions;

public class FromFloatToString {


    public static String function(Float a) {
        String result = "";
        try {
            result = a.toString();
        } catch (Exception e) {
            System.out.println("Null");
        }
        return result;
    }
}


