import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configreadingData {

    public static void main(String[] args) throws IOException {

        String path="Files/config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        String print=properties.getProperty("username");
        System.out.println(print);
    }
}
