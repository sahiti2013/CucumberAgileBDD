package automationPractice;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions3 {


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
    public void user_enters_email_as_something(String strArg1) {
        driver.findElement(By.id("email_create")).sendKeys(strArg1);
    }

    @And("^Clicks Create An Account button$")
    public void clicks_create_an_account_button() {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)");
        driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
    }

    @Then("^user should see feedback message as \"([^\"]*)\"$")
    public void user_should_see_feedback_messege_as_something(String strArg1)  {
       // Assert.assertTrue(strArg1,driver.findElement(By.xpath("//div[1]/form/div/div[1]/ol/li")).isDisplayed());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(driver.findElement(By.xpath("//div[1]/form/div/div[1]/ol/li")).getText(),strArg1);

    }
    @When("^User clicks Create An Account buttton again$")
    public void user_clicks_create_an_account_buttton_again() {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)");
        driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

    }
    @Then("^user should see another feedback message as \"([^\"]*)\"$")
    public void user_should_see_another_feedback_messege_as_something(String strArg1)  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Please enter your email address to create an account.']")).getText(),strArg1);


    }



}

