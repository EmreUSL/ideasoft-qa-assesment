package tests;

import assertions.AssertActions;
import assertions.VerifyActions;
import config.ConfigurationManager;
import core.driver.DriverManager;
import core.listener.TestListener;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public abstract class BaseTest {

    @BeforeMethod
    void setUp() {
        DriverManager.initDriver();
        DriverManager.getDriver().get(ConfigurationManager.getBaseUrl());
    }

    @AfterMethod
    void tearDown() {
        VerifyActions.assertAll();
        DriverManager.quitDriver();
    }
}
