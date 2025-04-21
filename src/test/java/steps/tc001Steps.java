package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc001Page;

public class tc001Steps {
    WebDriver driver;
    tc001Page loginPage;

    @Given("I open the web application")
    public void i_open_the_web_application() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        loginPage = new tc001Page(driver);
        driver.get("http://example.com/login");
        Assert.assertTrue(loginPage.isHomePageVisible());
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        loginPage.enterUsername("validUsername");
        loginPage.enterPassword("validPassword");
        loginPage.clickLoginButton();
    }

    @Then("the user should be authenticated successfully")
    public void the_user_should_be_authenticated_successfully() {
        Assert.assertTrue(loginPage.isUserAuthenticated());
        driver.quit();
    }
}