import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};

        char[] res = new char[abc.length+num.length];
        System.arraycopy(abc,0,res,0,abc.length);
        System.arraycopy(num,0,res,abc.length,num.length);

        System.out.println(res);
        System.out.println(Arrays.toString(res));
    }
}
