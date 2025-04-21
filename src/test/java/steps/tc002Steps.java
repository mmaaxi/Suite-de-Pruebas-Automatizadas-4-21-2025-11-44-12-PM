package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc002Page;

public class tc002Steps {

    WebDriver driver;
    tc002Page logoutPage;

    @Given("el usuario está autenticado en la aplicación")
    public void usuarioAutenticado() {
        // Lógica para asegurar que el usuario está autenticado
        // Esto podría incluir, por ejemplo, navegar y autenticar el inicio de sesión
        driver = Hooks.getDriver();
        logoutPage = new tc002Page(driver);
        logoutPage.navigateToHome();
    }

    @When("el usuario hace logout desde la aplicación")
    public void realizarLogout() {
        logoutPage.clickLogoutButton();
    }

    @Then("el usuario es redirigido a la página de login")
    public void verificarRedireccionLogin() {
        Assert.assertTrue("El usuario no fue redirigido a la página de login", 
            logoutPage.isLoginPageDisplayed());
    }
}