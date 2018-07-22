public class arrayEx {
    public static void main(String[] args) {
        String[] names = {"oh","kim","jung"};

        String temp = names[1];
        names[0] = "Mr.OH";

        for(String tmp : names) {
            System.out.println(tmp);
        }
    }
}
