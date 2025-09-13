package com.advanced.collectionsFramework;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class SaveProperties {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("app.version", "1.2.0");
        props.setProperty("app.maintainer", "Harsha");
        props.setProperty("app.org", "Bosch");
        props.store(new FileWriter("./app.properties"),
                "Application Settings");
    }
}
