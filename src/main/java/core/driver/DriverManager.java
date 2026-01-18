package core.driver;

import config.ConfigurationManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {

     private static final ThreadLocal<WebDriver> driver =  new ThreadLocal<>();

     private DriverManager() {}

     private static void initDriver(BrowserType browserType) {
         if (driver.get() == null) {
             switch (browserType) {
                 case CHROME:
                     WebDriverManager.chromedriver().setup();
                     Map<String, Object> prefs = new HashMap<>();
                     prefs.put("profile.password_manage_leak_detection", false);
                     prefs.put("profile.credentials_enable_service", false);
                     prefs.put("safebrowsing-disable-download-protection", null);
                     ChromeOptions options = new ChromeOptions();
                     options.addArguments("guest");
                     options.setExperimentalOption("prefs", prefs);
                     driver.set(new ChromeDriver(options));
                     break;
                 case FIREFOX:
                     WebDriverManager.firefoxdriver().setup();
                     driver.set(new FirefoxDriver());
                     break;
                 case EDGE:
                     WebDriverManager.edgedriver().setup();
                     driver.set(new EdgeDriver());
                     break;
                 default:
                     throw new RuntimeException("Unknown browser type: " + browserType);
             }
         }
         driver.get().manage().window().maximize();
         getDriver();
     }

     public static void initDriver() {
        BrowserType browser = ConfigurationManager.getBrowser();
        initDriver(browser);
     }

     public static WebDriver getDriver() {
         if (driver.get() == null) {
             throw  new RuntimeException("Driver is not initialized");
         }
         return driver.get();
     }

     public static void quitDriver() {
         if (driver.get() != null) {
             driver.get().quit();
             driver.remove();
         }
     }
}
