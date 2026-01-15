package tests;

import org.testng.annotations.Test;
import pages.actions.HomePageActions;

public class AddToCardTest extends BaseTest {

    @Test
    public void searchAddProductTest(){

        HomePageActions.clickAndSearchProduct();
    }
}
