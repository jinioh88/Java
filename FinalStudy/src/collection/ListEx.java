package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        if(list!=null && list.size()>0) {
            for(int n :list) {
                System.out.println(n);
            }
        }

        for(int i=0; list != null && i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
