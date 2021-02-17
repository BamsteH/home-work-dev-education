package com.github.conversionFunctions;

public class FromStringToInt {


    private static Integer result;

    public static Integer function(String str){
        try{
            result = Integer.parseInt(str);
        }
        catch(Exception e){
            System.out.println("Null");
        }



        return result;
    }
}
