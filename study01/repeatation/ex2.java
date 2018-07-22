package repeatation;

public class ex2 {
    public static void main(String[] args) {
        L1 : for(int i=1;i<10;i++) {
            for(int j=1;j<10;j++) {
                if(j==3)
                    break L1;
                if(j==6)
                    break;
            }
        }
    }
}
