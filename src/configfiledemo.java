import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configfiledemo {

    public static void main(String[] args) throws IOException {

        String path="Files/good.properties";
        //above this is the path of the property file inside the intellij
        Properties properties=new Properties();
        //above this is the program to read/write the data from property file
        properties.put("1","pakistan");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream,"please create new file");

    }
}
