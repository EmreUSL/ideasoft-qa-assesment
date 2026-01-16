package pages.elements;

import org.openqa.selenium.By;

public class ProductDetailPage {

    public static final By productPage = By.id("product-primary-image");
    public static final By productTitle = By.className("product-title");
    public static final By productQuantity = By.id("qty-input");
    public static final By addToCartButton = By.className("add-to-cart-button");
    public static final By successMessage = By.className("shopping-information-cart-inside");

}
