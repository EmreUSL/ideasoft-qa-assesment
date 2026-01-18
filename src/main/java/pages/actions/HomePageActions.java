package pages.actions;

import pages.elements.HomePage;
import utils.UIActions;

public class HomePageActions {

    public static void clickAndSearchProduct() {
        UIActions.click(HomePage.searchArea);
        UIActions.type(HomePage.searchArea, "ürün");
        UIActions.clickEnterKeyboard(HomePage.searchArea);

    }

    public static void goToProductDetails() {
        UIActions.scrollToElement(HomePage.productView);
        UIActions.click(HomePage.productView);
    }

    public static void goToCart() {
        UIActions.click(HomePage.cartButton);
    }

    public static void clickSignInButton() {
        UIActions.click(HomePage.signInButton);
    }

    public static void goToAccount() {
        UIActions.click(HomePage.homePage);
    }

}
