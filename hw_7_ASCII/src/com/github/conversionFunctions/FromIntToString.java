package com.github.conversionFunctions;

public class FromIntToString {
    public static String function(Integer a){
        String result = "";
        try {
            result = a.toString();
        }
        catch (Exception e){
            System.out.println("Null");
            result = "Error";
        }

        return result;

    }
}
