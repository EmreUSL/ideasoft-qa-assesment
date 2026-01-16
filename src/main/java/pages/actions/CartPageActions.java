package pages.actions;

import org.openqa.selenium.By;
import pages.elements.CartPage;
import pages.elements.HomePage;
import pages.elements.ProductDetailPage;
import utils.UIActions;

public class CartPageActions {

    public static boolean isCartPageDisplayed() {
        return UIActions.isDisplayed(CartPage.cartPage);
    }

    public static boolean isQuantityCorrect() {
        return UIActions.getElementAttribute(CartPage.productQuantity, "value").equals("5");
    }
}
