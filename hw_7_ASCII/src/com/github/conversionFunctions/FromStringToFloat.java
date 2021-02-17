package com.github.conversionFunctions;

public class FromStringToFloat {

    private static Float result;

    public static Float function(String str){
        try{
            result = Float.parseFloat(str);
        }
        catch(Exception e){
            System.out.println("Null");
        }



        return result;
    }

}
