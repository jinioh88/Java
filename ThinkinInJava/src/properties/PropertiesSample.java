package properties;

import java.io.File;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample = new PropertiesSample();
        sample.storeAndLoad();
    }

    public void storeAndLoad() {
        Properties prop = new Properties();
        try{
            prop.setProperty("Key1", "Key1-Value");
            String filaName="C:\\godofjava\\test.properties";
            FileWriter writer = new FileWriter(new File(filaName));
            prop.store(writer,"Sample");
            writer.close();


        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
