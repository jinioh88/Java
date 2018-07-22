package operator;

public class ex1 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ' ;

        int i = c1+1;
        c2++;
        //c2 = c2+1;  // 애러남
        c2 = (char)(c2+1);
    }
}
