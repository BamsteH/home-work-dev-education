package com.github.strings;

public class DollarInsteadOfSymbols {

    public static String[] function(String[] str, Integer j){
        try{for (int i = 0; i < str.length; i++) {
            if (j==str[i].length()){
                str[i] = str[i].substring(0,str[i].length()-4)+"$";
            }
        }
            return str;}
        catch (Exception e){
            System.out.println("ss");
            return null;
        }
    }

}
