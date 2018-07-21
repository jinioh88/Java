package array;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = {1,2,3,4,5};
        char[] arr3 = {'a','b','c'};

        for(int i=0;i<arr1.length;i++) {
            arr1[i] = i;
        }

        for(int n : arr2) {
            System.out.println(n);
        }

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
