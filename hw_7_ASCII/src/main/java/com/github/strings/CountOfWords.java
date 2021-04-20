package com.github.strings;

public class CountOfWords {


    private static Integer i = 0;

    public static int function(String str) {
        i = 0;
        try {
            str = str.replaceAll("!", "");
            str = str.replaceAll("\\?", "");
            str = str.replaceAll(",", "");
            str = str.replaceAll("\\.", "");
            str = str.replaceAll(":", "");
            String[] strArr = str.split(" ");
            for (int j = 0; j < strArr.length; j++) {
                i++;
                if (strArr[j].equals("")) {
                    i--;
                }
            }

        } catch (Exception e) {
            System.out.println("");
        }
        return i;
    }
}
