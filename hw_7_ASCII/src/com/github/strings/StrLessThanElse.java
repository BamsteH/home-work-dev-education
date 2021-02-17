package com.github.strings;

public class StrLessThanElse {


        //Here we create space after commas
    public static String commasSpace(String str) {
        try {
            str = str.replaceAll(" ,",",");
            str = str.replaceAll(", ", ",");
            str = str.replaceAll(",", ","+" ");
            str = str.replaceAll(",", "");
        }
        catch (Exception e){
            System.out.println("null");
        }
       return str;
    }

    //here we delete all commas and hold all spaces
    public static String splitter(String str){
        try {
            str = commasSpace(str);
            String[] str_words = str.split(" ");
            int j = 100000000;
            int index = 0;
            for (int i = 0; i < str_words.length; i++) {
                if (str_words[i].equals("")){
                    break;
                }
                else{
                    if (j > str_words[i].length()){
                        j = str_words[i].length();
                        index = i;
                    }

                }

            }
            return str_words[index];
        }
        catch (Exception e){
            System.out.println("null");
            return null;
        }

    }

}
