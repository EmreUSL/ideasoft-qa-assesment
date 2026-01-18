package tests;

import assertions.AssertActions;
import org.testng.annotations.Test;
import pages.actions.HomePageActions;
import pages.actions.LoginPageActions;
import pages.elements.HomePage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void validLoginTest() {
        HomePageActions.clickSignInButton();
        LoginPageActions.setEmail();
        LoginPageActions.setPassword();
        LoginPageActions.login();

        AssertActions.assertTrue(LoginPageActions.isLoggedIn(), "Cannot login");

    }

    @Test(priority = 2)
    public void invalidLoginTest() {
        HomePageActions.clickSignInButton();
        LoginPageActions.setEmail();
        LoginPageActions.setWrongPassword();
        LoginPageActions.login();

        AssertActions.assertTrue(LoginPageActions.isFailedLogin(),"Case failed");
    }
}
