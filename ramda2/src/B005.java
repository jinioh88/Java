public class B005 {
    public static void main(String[] args) {
        Integer[] ages = {20,25,10,22,13,18,17,43,31};

        for(int i=0;i<ages.length;i++) {
            if(ages[i]<20)
                System.out.format("Age %d!!! Cant't enter\n", ages[i]);
        }
    }
}
