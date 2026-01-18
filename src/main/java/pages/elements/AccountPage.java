package pages.elements;

import org.openqa.selenium.By;

public class AccountPage {

    public static final By addressBook = By.xpath("//a[@title='Adres Defteri']");
    public static final By addNewAddress = By.xpath("//a[@data-selector='add-address-button']");
    public static final By addressTitle = By.id("address_name");
    public static final By addressName = By.id("firstname");
    public static final By addressSurname = By.id("surname");
    public static final By countryDropdown = By.id("country") ;
    public static final By selectCountry = By.xpath("//option[@value='1']");
    public static final By cityDropdown = By.id("location");
    public static final By selectCity = By.xpath("//select[@id='location']//option");
    public static final By stateDropdown = By.id("town");
    public static final By selectState = By.xpath("//select[@id='town']//option");
    public static final By addressPhone = By.id("cell");
    public static final By tcNumber = By.id("tc_id");
    public static final By addressArea = By.name("address");
    public static final By saveButton = By.xpath("//button[@data-type='add']");
    public static final By getAddressTitleText = By.className("address-list-box-header");

}
