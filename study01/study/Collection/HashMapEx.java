package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId","1234");
        map.put("abcd","1111");
        map.put("asdf","1234");

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("id pw 입력");
            System.out.println("id : ");
            String id = s.nextLine().trim();

            System.out.println("password : ");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("id 없음.");
                continue;
            } else {
                if(!(map.get(id)).equals(password)) {
                    System.out.println("비밀번호 불일치!");
                } else {
                    System.out.println("login Success!");
                    break;
                }
            }
        }
    }
}
