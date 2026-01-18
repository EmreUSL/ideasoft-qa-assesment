package pages.actions;

import pages.elements.CartPage;
import utils.UIActions;

public class CartPageActions {

    public static boolean isCartPageDisplayed() {
        return UIActions.isDisplayed(CartPage.cartPage);
    }

    public static boolean isQuantityCorrect() {
        return UIActions.getElementAttribute(CartPage.productQuantity, "value").equals("5");
    }
}
