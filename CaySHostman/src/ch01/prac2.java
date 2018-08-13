package ch01;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prac2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        int first = numbers.get(0);
        numbers.add(11);
        int secon = numbers.get(1);

        if(numbers.get(0)==numbers.get(1))
            System.out.println("같늬??");

        if(numbers.get(0).equals(numbers.get(1)))
            System.out.println("같다.");

        List<Integer> arr = Arrays.asList(1,2,3);
        for(int n : arr)
            System.out.println(n);

    }
}
