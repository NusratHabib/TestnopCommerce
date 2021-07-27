package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;


public class Steps {

    public WebDriver driver;
    public LoginPage lp;

    @Given("User Launch Chrome browser") //This line is connecting .feature(steps) and stepDefinition files
    public void user_launch_chrome_browser() { //This method will execute the .feature(steps), using Selenium and Java
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nusra\\Desktop\\BDD\\TestnopCommerce\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
    }

    @When("User opens URL {string}") //Parameter being passed from .feature(steps) to stepDefinition
    public void user_opens_url(String url) throws InterruptedException { //url is the parameter will be passed from .feature(steps)
    driver.get(url);
    driver.manage().window().maximize();
    Thread.sleep(2000);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) { //Passing two parameters
      lp.setEmail(email);
      lp.setPassword(password);
    }

    @When("Click on Login")
    public void click_on_login() throws InterruptedException {
        Thread.sleep(2000);
        lp.clickLogin();
    }

    @Then("Page title should be {string}") //Reusable method
    public void page_title_should_be(String title) throws InterruptedException { //Using this method 2 times
        Thread.sleep(2000);
        driver.getTitle();
    }

    @When("User click on Log out link")
    public void user_click_on_log_out_link() throws InterruptedException {
        Thread.sleep(2000);
        lp.clickLogout();
    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }
}