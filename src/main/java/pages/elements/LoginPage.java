package pages.elements;

import org.openqa.selenium.By;

public class LoginPage {

    public static final By emailArea = By.id("user-login-email");
    public static final By passwordArea = By.id("user-login-pass");
    public static final By loginButton = By.xpath("//button[@type='submit']");
    public static final By cantLoginMessage = By.xpath("//span[text()='Email ve ya şifre yanlış. Lütfen tekrar deneyiniz.']");

}
