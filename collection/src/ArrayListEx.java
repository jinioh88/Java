import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("java");
        list.add("spring");
        list.add("jpa");
        list.add(2,"HTTP");

        int size = list.size();
        System.out.println("size : "+size);

        String skill = list.get(2);
        System.out.println("2 ; " +skill);

        for(String str : list) {
            System.out.println(list);
        }

        list.remove(2);
        list.remove(2);
        list.remove("HTTP");

        for(String str : list) {
            System.out.println(list);
        }

        System.out.println();

        List<String> list2 = Arrays.asList("오세진","남택용","원영남");
        for(String name:list2)
            System.out.println(name);
    }
}
