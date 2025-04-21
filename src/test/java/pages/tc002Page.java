package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc002Page {

    WebDriver driver;

    By logoutButton = By.id("logout");
    By loginPageIdentifier = By.id("loginPage");

    public tc002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHome() {
        // Implementar la navegación a la página principal
        // Simulación de autenticación si es necesario para las pruebas
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public boolean isLoginPageDisplayed() {
        return driver.findElement(loginPageIdentifier).isDisplayed();
    }
}