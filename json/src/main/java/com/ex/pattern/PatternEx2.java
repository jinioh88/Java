package com.ex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx2 {
    public static void main(String[] args) {
        String regExp = "[<]"+"\\W?\\w*"+"[>]";
        String str = "<footer>2018-10-09</footer>";

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);

        boolean b;
        while(b = matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
