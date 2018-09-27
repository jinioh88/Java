import javax.annotation.processing.FilerException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryResource {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("test.txt");
            BufferedInputStream bf = new BufferedInputStream(new FileInputStream("text.txt"))) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
