package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertion {
    // go to syntax login
    // enter wrong crdentails
    // verify the message is "invalid Credentials

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @Test
    public void verifyCredentials(){
        String expectedText ="Invalid credentials";
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        //    first assertion compare the two strings
        Assert.assertEquals(text, expectedText);
        //    assert if username text box is dispalyed
        WebElement usernameBox=driver.findElement(By.id("txtUsername"));
        boolean displayed = usernameBox.isDisplayed();
        Assert.assertTrue(displayed);
    }

    @AfterMethod
    public  void CloseBrowser(){
        driver.quit();
    }

}
