import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashtable {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("spring","12");
        map.put("summer","123");
        map.put("fall","1234");
        map.put("windter","12345");

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("id/pw 입력");
            System.out.print("ID : ");
            String id = sc.nextLine();
            System.out.print("PW : ");
            String password = sc.nextLine();
            System.out.println();

            if(map.containsKey(id)) {
                if(map.get(id).equals(password)) {
                    System.out.println("login success@");
                    break;
                } else {
                    System.out.println("don't match password");
                }
            } else {
                System.out.println("id is not exist");
            }
        }
    }
}
