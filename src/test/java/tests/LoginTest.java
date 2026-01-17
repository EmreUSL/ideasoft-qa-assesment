package tests;

import assertions.AssertActions;
import org.testng.annotations.Test;
import pages.actions.HomePageActions;
import pages.actions.LoginPageActions;
import pages.elements.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        HomePageActions.clickSignInButton();
        LoginPageActions.setEmail();
        LoginPageActions.setPassword();
        LoginPageActions.login();

        AssertActions.assertTrue(LoginPageActions.isLoggedIn(), "Cannot login");

    }

    @Test
    public void invalidLoginTest() {
        LoginPageActions.setEmail();
        LoginPageActions.setWrongPassword();
        LoginPageActions.login();

        AssertActions.assertFalse(LoginPageActions.isLoggedIn(), "Case failed");
    }
}
