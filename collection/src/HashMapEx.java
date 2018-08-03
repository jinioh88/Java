import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,Integer> map  = new HashMap<>();

        map.put("오세진",31);
        map.put("김사나",21);
        map.put("둘리",2000000);

        System.out.println(map.get("오세진"));
        System.out.println();

        Set<String> ks = map.keySet();
        Iterator<String> keyIter = ks.iterator();
        while(keyIter.hasNext()) {
            String key = keyIter.next();
            Integer value = map.get(key);
            System.out.println(value);
        }

        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entries.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<String,Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key);
        }
    }
}
