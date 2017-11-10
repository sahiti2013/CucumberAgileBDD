

/*
package automationPractice;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions1 {
    WebDriver driver;
    String url = "http://automationpractice.com/index.php?";
    String expUrl = "http://automationpractice.com/index.php";


    @Before
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void closeBrowser() {
        driver.close();
    }

    @Given("^User on home Page$")
    public boolean user_on_home_page()  {
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equalsIgnoreCase(expUrl)) {
            return true;
        }
        else
            return false;
    }


    @When("^user Clicks SignIn button$")
    public void user_clicks_signin_button()  {
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
    }
    @And("^User enters email as \"([^\"]*)\"$")
    public void user_enters_email_as_something(String email)  {
        driver.findElement(By.id("email_create")).sendKeys(email);
    }
    @And("^Clicks Create An Account button$")
    public void clicks_create_an_account_button(){
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)");
        driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
    }
    @Then("^user should be on Registration Page$")
    public void user_should_be_on_registration_page()  {
        driver.findElement(By.xpath("//*[text()='Your personal information']")).isDisplayed();

    }







}



*/
