package com.advanced.collectionsFramework;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class LoadProperties {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(new FileReader("./application.properties"));
        String dbUrl = props.getProperty("db.url");
        System.out.println("DB URL: " + dbUrl);
        String serverPort = props.getProperty("server.port");
        System.out.println("Server Port Number: " + serverPort);
    }
}
