package tests;

import assertions.AssertActions;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.actions.CartPageActions;
import pages.actions.HomePageActions;
import pages.actions.ProductDetailPageActions;


public class AddToCardTest extends BaseTest {

    @Description("Search Product and Add To Cart Successfully")
    @Test
    public void searchAddProductTest(){

        HomePageActions.clickAndSearchProduct();
        HomePageActions.goToProductDetails();

        AssertActions.assertTrue(ProductDetailPageActions.isProductDetailPageDisplayed(), "Product is not displayed");
        AssertActions.assertTrue(ProductDetailPageActions.isSelectedProductCorrect(), "Product is not selected correctly");

        ProductDetailPageActions.selectProductQuantity();
        ProductDetailPageActions.addToCart();

        AssertActions.assertTrue(ProductDetailPageActions.isProductAddedToCart(), "Product can't added to cart");

        HomePageActions.goToCart();
        AssertActions.assertTrue(CartPageActions.isCartPageDisplayed(), "Cart is not displayed");
        AssertActions.assertTrue(CartPageActions.isQuantityCorrect(), "Quantity is not correct");
    }
}
