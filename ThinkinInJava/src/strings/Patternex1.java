package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternex1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".*many.*");
        Matcher matcher = pattern.matcher(("Java Recipe has many reidkdk!!"));
        boolean result = matcher.matches();
    }
}
