package tests;
import base.BaseTest;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest{

    @Test
    public void openGoogle(){
        driver.get("https://www.google.com");
        System.out.println("Page Title is :"+driver.getTitle());
    }
}
