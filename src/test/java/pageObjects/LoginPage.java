package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver; //Declaration of reference variable Name (Obj of webdriver)

    public LoginPage(WebDriver driver) {
       this.driver = driver;
        PageFactory.initElements(driver,this); //this = LoginPage.class
    }

    @FindBy(id = "Email")
    @CacheLookup
    WebElement email;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement password;

    @FindBy(xpath= "//button [@type='submit']")
    @CacheLookup
    WebElement login;

    @FindBy(linkText= "Logout")
    @CacheLookup
    WebElement logout;

//    @FindBy(xpath= "// a [text()='Logout']")
//    @CacheLookup
//    WebElement logout2;

    //Action methods

    public void setEmail(String userEmail) {
        email.clear();
        email.sendKeys(userEmail);
    }

    public void setPassword(String userPassword) {
        password.clear();
        password.sendKeys(userPassword);
    }

    public void clickLogin() {
        login.click();
    }

    public void clickLogout() {
        logout.click();
    }
}