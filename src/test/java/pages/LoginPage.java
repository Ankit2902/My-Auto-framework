package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {
    WebDriver driver;

    //Locator
    By Username = By.id("user-name");
    By Password = By.id("password");
    By LoginButton = By.id("login-button");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Action
    public void enterUserName(String username){
        driver.findElement(Username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(Password).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(LoginButton).click();
    }

    public void LoginInToPage(String Username,String Password){
        enterUserName(Username);
        enterPassword(Password);
        clickLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventor_container")));






    }

}
