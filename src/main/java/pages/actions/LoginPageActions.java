package pages.actions;

import config.ConfigurationManager;
import pages.elements.HomePage;
import pages.elements.LoginPage;
import utils.UIActions;

public class LoginPageActions {

    public static void setEmail() {
        UIActions.click(LoginPage.emailArea);
        UIActions.type(LoginPage.emailArea, ConfigurationManager.getEmail());
    }

    public static void setPassword() {
        UIActions.click(LoginPage.passwordArea);
        UIActions.type(LoginPage.passwordArea, ConfigurationManager.getPassword(true));
    }

    public static void setWrongPassword() {
        UIActions.click(LoginPage.passwordArea);
        UIActions.type(LoginPage.passwordArea, ConfigurationManager.getPassword(false));
    }

    public static void login() {
        UIActions.click(LoginPage.loginButton);
    }

    public static boolean isLoggedIn() {
        return UIActions.isDisplayed(HomePage.homePage);
    }
}
