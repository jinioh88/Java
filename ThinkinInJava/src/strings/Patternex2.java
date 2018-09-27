package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternex2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Recipe.");
        Matcher matcher = pattern.matcher(("Java Recipe has many Recipes!!"));

        while(matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }
    }
}
