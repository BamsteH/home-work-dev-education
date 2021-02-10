package com.github.February_10;

public class ReverseSlash {

    public static String method(String str) {

        str = str = str.replaceAll("/", "\\\\\\\\");

        return str;
    }

}
