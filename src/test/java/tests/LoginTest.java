package tests;

import assertions.AssertActions;
import config.ConfigurationManager;
import core.listener.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.UIActions;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test
    public void loginTest()
    {
        UIActions.type(LoginPage.userName, ConfigurationManager.getUserName());
        UIActions.type(LoginPage.password, ConfigurationManager.getPassword());
        UIActions.click(LoginPage.loginButton);

        AssertActions.assertTrue(UIActions.isDisplayed(LoginPage.homePage), "Home page is not displayed");
    }
}
