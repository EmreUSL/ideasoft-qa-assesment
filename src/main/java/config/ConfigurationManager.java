package config;

import core.driver.BrowserType;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {

    private ConfigurationManager() {}

    public static BrowserType getBrowser() {
        String browser = ConfigReader.get(ConfigKeys.BROWSER.getKey());
        return BrowserType.valueOf(browser.toUpperCase());
    }

    public static String getBaseUrl() {
        return ConfigReader.get(ConfigKeys.BASE_URL.getKey());
    }

    public static boolean isHeadless() {
        return Boolean.parseBoolean(ConfigReader.get(ConfigKeys.HEADLESS.getKey()));
    }

    public static String getName() {
        return ConfigReader.get(ConfigKeys.NAME.getKey());
    }

    public static String getPassword() {
        return ConfigReader.get(ConfigKeys.PASSWORD.getKey());
    }
}
