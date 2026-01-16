package pages.actions;

import pages.elements.HomePage;
import pages.elements.ProductDetailPage;
import utils.UIActions;

public class ProductDetailPageActions {

    public static boolean isProductDetailPageDisplayed() {
        return UIActions.isDisplayed(ProductDetailPage.productPage);
    }

    public static boolean isSelectedProductCorrect() {
        return UIActions.getText(ProductDetailPage.productTitle).equals("test ürünüdür");
    }

    public static void selectProductQuantity() {
        UIActions.click(ProductDetailPage.productQuantity);
        UIActions.type(ProductDetailPage.productQuantity, "5");
    }

    public static void addToCart() {
        UIActions.click(ProductDetailPage.addToCartButton);
    }

    public static boolean isProductAddedToCart() {
        return UIActions.isDisplayed(ProductDetailPage.successMessage);
    }
}
