package tests;

import assertions.AssertActions;
import org.testng.annotations.Test;
import pages.actions.AccountPageActions;
import pages.actions.HomePageActions;
import pages.actions.LoginPageActions;

public class AddNewAddressTest extends BaseTest {

    @Test(priority = 4)
    public void addNewAddressTest() {

        HomePageActions.clickSignInButton();
        LoginPageActions.setEmail();
        LoginPageActions.setPassword();
        LoginPageActions.login();

        AssertActions.assertTrue(LoginPageActions.isLoggedIn(), "Cannot Log in");

        HomePageActions.goToAccount();
        AccountPageActions.openNewAddressPage();
        AccountPageActions.enterAddressDetails();
        AccountPageActions.saveAddress();

        AssertActions.assertTrue(AccountPageActions.isAddressCreated(),"Cannot create new address");
    }
}
