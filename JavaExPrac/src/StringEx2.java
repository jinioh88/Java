import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEx2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(,*):(.*)");
        Matcher matcher = pattern.matcher("Java Recipe : many Recipes!!");

        if(matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }
}
