package ch01;

import java.math.BigInteger;

public class prac01 {
    public static void main(String[] args) {
        String names = String.join(", ","OH","KIM","PARK","YOO");

        System.out.println(names);

        BigInteger n = BigInteger.valueOf(9827349823798L);
        System.out.println(n);

        BigInteger k = new BigInteger("9309839820982");
        System.out.println(k);

        StringBuilder builder = new StringBuilder();
        boolean isEmpty = false;
        int i = 0;
        while(!isEmpty) {
            i++;
            if(i>10)
                isEmpty = true;
            builder.append("다음 문자 추가"+i);
        }
        String result = builder.toString();
        System.out.println(result);

        String greeting = "Hello, World!";
        String location = greeting.substring(7,12);
        System.out.println(location);

        String names2 = "OH, KIM, PARK";
        String[] result2 = names2.split(", ");
        System.out.println(result2);
    }
}
