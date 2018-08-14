import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class InputTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        List<User> users = new ArrayList<>();
        try {
            ois = new ObjectInputStream(new FileInputStream("user.dat"));
            users = (List)ois.readObject();
            for (User user:users) {
                System.out.println("------------");
                System.out.println(user.getName());
                System.out.println(user.getId());
                System.out.println(user.getAge());
                System.out.println(user.getPw());
                System.out.println("------------");
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
