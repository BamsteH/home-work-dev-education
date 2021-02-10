package com.github.February_10;

import java.io.IOException;

public class ToPlaceASpaceAfterAllPunctuationMarks {

    public static String finder(String str){
        if (str == null){
            throw new NullPointerException("Something wrong!");
        }

        str = str.replaceAll(", ", ",");
        str = str.replaceAll(",", ","+" ");
        str = str.replaceAll("\\."+" ", ".");
        str = str.replaceAll("\\.", "."+" ");
        str = str.replaceAll("\\!"+" ", "!");
        str = str.replaceAll("\\!", "!"+" ");
        str = str.replaceAll("\\?"+" ", "?");
        str = str.replaceAll("\\?", "?"+" ");
        str = str.replaceAll("\\:"+" ", ":");
        str = str.replaceAll("\\:", ":"+" ");
        return str;
    }


}
