package seleneiumMethodPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) throws IOException {

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("src/test/java/config.properties");
        p.load(fis);
        String name = p.getProperty("username");
       String val =  p.getProperty("roll","10");
        System.out.println(name);
        p.setProperty("address","barh");
        FileOutputStream fos = new FileOutputStream("src/test/java/config.properties");
        p.store(fos,"storing address");
    }
}
