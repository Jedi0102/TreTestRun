package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class HelperFunctions {
    public String url;

    public void parseProperties(String path){
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        url=properties.getProperty("url");


    }


}
