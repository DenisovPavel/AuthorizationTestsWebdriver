package PracticeFour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private static String login = "1111111";
    private static String password = "22222222";
    private static String passwordNull = "";
    private static String loginNull = "";

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    public static String getPasswordNull() {
        return passwordNull;
    }

    public static String getLoginNull() {
        return loginNull;
    }

    @FindBy(xpath = "//input[@id='user_email']")
    private static WebElement elementMail;

    @FindBy(xpath = "//input[@id='user_password']")
    private static WebElement elementPassword;

    @FindBy(xpath = "//input[@type='submit']")
    private static WebElement elementButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void loginInSystem(String login, String password) {
        elementMail.sendKeys(login);
        elementPassword.sendKeys(password);
        elementButton.click();
    }
}
