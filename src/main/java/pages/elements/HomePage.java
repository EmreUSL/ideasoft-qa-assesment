package pages.elements;

import org.openqa.selenium.By;

public class HomePage {

    public static final By searchArea = By.className("auto-complete");
    public static final By productView = By.xpath("//div[@class='showcase-image showcase-image-vertical']//a[@title='test ürünüdür']");
    public static final By cartButton = By.xpath("//a[@title='Sepet']");


}
