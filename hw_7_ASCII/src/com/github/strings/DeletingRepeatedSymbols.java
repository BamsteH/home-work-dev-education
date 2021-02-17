package com.github.strings;

public class DeletingRepeatedSymbols {

    public static String function(String str){
        try{
            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j < str.length(); j++) {
                    if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                        str = str.substring(0,j) + str.substring(j+1);
                        j-=1;
                    }
                }
            }
            return str;
        }
        catch (Exception e){
            return null;
        }



    }


}
