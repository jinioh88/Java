import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class OutputTest {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        List<User> users = new ArrayList<>();

        try {
            oos = new ObjectOutputStream(new FileOutputStream("user.dat"));

            User user1 = new User("오세진","OH","1234",31);
            User user2 = new User("김사나","sana","1234",22);
            User user3 = new User("홍길동","HONG","1234",50);
            users.add(user1);
            users.add(user2);
            users.add(user3);

            oos.writeObject(users);

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
            }
        }
    }
}
