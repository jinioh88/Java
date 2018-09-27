import com.sun.javafx.binding.Logging;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());

        System.out.println(Logging.class.getClassLoader().getParent());

        System.out.println(Ex01.class.getClassLoader().getParent().getParent());

    }
}
