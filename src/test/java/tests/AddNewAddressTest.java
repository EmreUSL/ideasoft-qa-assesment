package tests;

import assertions.AssertActions;
import config.ConfigurationManager;
import org.testng.annotations.Test;
import pages.actions.AccountPageActions;
import pages.actions.HomePageActions;
import pages.actions.LoginPageActions;

public class AddNewAddressTest extends BaseTest {

    @Test
    public void addNewAddressTest() {

        HomePageActions.clickSignInButton();
        LoginPageActions.setEmail();
        LoginPageActions.setPassword();
        LoginPageActions.login();

        AssertActions.assertTrue(LoginPageActions.isLoggedIn(), "Cannot Log in");

        HomePageActions.goToAccount();
        AccountPageActions.openNewAdressPage();
        AccountPageActions.enterAddressDetails();
        AccountPageActions.saveAddress();

        AssertActions.assertTrue(AccountPageActions.isAddressCreated(),"Cannot create new address");
    }
}
