package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends BaseTest {

    LoginPage loginPage;


    @BeforeMethod
    public void beforeEachTest(){
        setUp();
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void afterEachTest(){
        tearDown();
    }

    @Test
    public void testLogin(){
        driver.get("https://www.saucedemo.com/v1/index.html");
        loginPage.LoginInToPage("standard_user","secret_sauce");
    }
}
