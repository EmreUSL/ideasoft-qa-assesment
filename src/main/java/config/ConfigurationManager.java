package config;

import core.driver.BrowserType;

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

    public static String getUserName() {
        return ConfigReader.get(ConfigKeys.USERNAME.getKey());
    }

    public static String getPassword(boolean getPassword) {
        if (getPassword) {
            return ConfigReader.get(ConfigKeys.PASSWORD.getKey());
        } else {
            return ConfigReader.get(ConfigKeys.WRONGPASSWORD.getKey());
        }
    }

    public static String getName() {  return ConfigReader.get(ConfigKeys.NAME.getKey());}

    public static String getSurname() {return ConfigReader.get(ConfigKeys.SURNAME.getKey());}

    public static String getEmail() {return ConfigReader.get(ConfigKeys.EMAIL.getKey());}

    public static String getPhoneNumber() {return ConfigReader.get(ConfigKeys.PHONENUMBER.getKey());}
}
