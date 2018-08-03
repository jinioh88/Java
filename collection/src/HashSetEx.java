import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("spring");
        set.add("jpa");
        set.add("http");
        set.add("db");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
