import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configWritingdata {

    public static void main(String[] args) throws IOException {

        String path="Files/trump.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("01","pakistan");
        properties.put("02","india");
        properties.store(fileOutputStream,"this is my new file");


    }
}
