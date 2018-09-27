package strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplaceingStringTokenizer {
    public static void main(String[] args) {
        String input = "But I'm not dead yet! I feel happy!";
        StringTokenizer stoke = new StringTokenizer(input);
        while(stoke.hasMoreElements( ))
            System.out.println(stoke.nextToken()+" ");
        System.out.println();
        System.out.println(Arrays.toString(input.split(" ")));
        Scanner sc = new Scanner(input);
        while(sc.hasNext()) {
            System.out.println(sc.next()+" ");
        }
    }
}
