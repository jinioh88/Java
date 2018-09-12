public class B006 {
    public static void main(String[] args) {
        Integer[] ages = {20,25,10,22,13,18,17,43,31};

        for(int age : ages) {
            if(age<20)
                System.out.format("Age %d!!! Cant't enter\n", age);
        }
    }
}
