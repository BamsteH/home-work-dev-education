package com.github.February_10;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PathValidator {

    public static Boolean validatorPath(String path) {

        String regexp = "\\"+"?"+":"+"<"+">"+"/"+"*";
        String regexpFst = "\\"+"?"+"<"+">"+"/"+"*";
        String[] splitLast = path.split("/");

        Pattern pattern = Pattern.compile(regexp);
        Pattern patternFst = Pattern.compile(regexpFst);
        boolean result = true;
        for (int i = 0; i < splitLast.length; i++) {
            if (i == 0) {
                Matcher matcherFst = patternFst.matcher(splitLast[i]);
                boolean r = matcherFst.find();
                if (!r) {
                    result = false;
                }
            } else {
                Matcher matcher = pattern.matcher(splitLast[i]);
                if (!matcher.find()) {
                    result = false;
                }
            }
        }


        return result;
    }
}
