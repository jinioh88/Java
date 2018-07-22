package repeatation;

public class ex1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for(int n : arr) {
            sum+=n;
        }
        System.out.println(sum);
    }
}
