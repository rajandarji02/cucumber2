package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.asn1.cms.PasswordRecipientInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginStepDef {
WebDriver driver;
    @Given("User on a login page")
    public void user_on_a_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String baseURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.get(baseURL);
        String expectedTitle = "nopCommerce demo store. Login";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"Verify Title");


        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("User enter valid username")
    public void user_enter_valid_username() {
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("rajanndarji@yahoo.com");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User enter valid password")
    public void user_enter_valid_password() {
        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("123456");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User click on log in button")
    public void user_click_on_log_in_button() {
        WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        login.click();
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @Then("User should login")
    public void user_should_login() {
        System.out.println("LOGIN SUCCESSFUL");

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("User should see welcome message")
    public void user_should_see_welcome_message() {
        System.out.println("USER ON HOME PAGE");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User enter {string} and {string}")
    public void user_enter_and(String  UserName, String Password) throws InterruptedException {
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys(UserName);

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys(Password);

        Thread.sleep(3000);

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("User click log in button")
    public void user_click_log_in_button() {
        WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginbtn.sendKeys(Keys.ENTER);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("User should see outcome")
    public void user_should_see_outcome() {
        System.out.println("ERROR MESSAGE , USER CANNOT LOGIN WITH INVALID CREDENTIALS");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


}
