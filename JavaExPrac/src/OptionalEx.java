import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {

        Optional<String> exist = Optional.of("123");
        Optional<String> empty = Optional.empty();
        String value = null;
        Optional<String> optional = Optional.ofNullable(value);

//        String val1 = optional.get();
        String val1 = optional.orElse("");
        String val2 = optional.orElseGet(()->{return new SimpleDateFormat("yyyMMddHHmmSS").format(new Date());
        });

        System.out.println(val1);
        System.out.println(val2);

        if(!optional.isPresent()) {
            System.out.println("값이 없다!");
        }
    }
}
