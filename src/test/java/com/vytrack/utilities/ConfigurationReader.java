package com.vytrack.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;

    static {
        try {
            //location of properties file
            String path = System.getProperty("user.dir")+"/configuration.properties";
            //get that file as a stream
            FileInputStream input = new FileInputStream(path);
            //create object of Properties class
            configFile = new Properties();
            //load properties file into Properties object
            configFile.load(input);
            //close the input s
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties file!");
        }

    }

    /**
     * This method returns property value from configuration.properties file
     * @param keyName property name
     * @return property value
     */
    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }

}

//private static Properties properties;
//static {
//    // try with resource --> try/catch block can take a parameter , AutoCloseable
//    try(FileInputStream fileInputStream= new FileInputStream("config.properties") ) {
//        //file Reader as byte code
//        //fileInputStream here is our configFile as Byte code
//        properties = new Properties();
//        //properties class can read byte code so we need the file as byte code
//        properties.load(fileInputStream);
//    } catch (Exception e) {
//        System.out.println("The config file did not load");
//        e.printStackTrace();
//    }
//}
//public static String getProperty(String key){
//    return properties.getProperty(key);
//}