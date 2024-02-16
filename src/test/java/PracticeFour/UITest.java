package PracticeFour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static PracticeFour.LoginPage.*;

public class UITest extends AbstractClass {

    @Test
    @DisplayName("Проверка на отсутствие пароля при авторизации.")
    void testGBWithoutPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginInSystem(getLogin(), getPasswordNull());
        Assertions.assertFalse(driver.findElements(By.xpath("//input[@id='user_password']"))
                .isEmpty());
    }

    @Test
    @DisplayName("Проверка на отсутствие логина(почты) при авторизации.")
    void testGBNotEmailLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginInSystem(getLoginNull(), getPassword());
        Assertions.assertFalse(driver.findElements(By.xpath("//input[@id='user_email']"))
                .isEmpty());
    }
}