package io.tatum.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Env {

    public static String getTatumApiKey() throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "config.properties";
        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));
        String appVersion = appProps.getProperty("tatum.api.key");
        return appVersion;
    }

    public static String getTatumApiUrl() throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "config.properties";
        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));
        String appVersion = appProps.getProperty("tatum.api.url");
        return appVersion;
    }
}
