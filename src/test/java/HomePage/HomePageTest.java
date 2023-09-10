package HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class HomePageTest {

    WebDriver driver;
    //WebElement contactButton;
    WebElement bookingButton;
    JavascriptExecutor jse;
    @BeforeClass
    public void setUp(){
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver=  WebDriverManager.chromedriver().capabilities(options).create();
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app/");

    }

    @Test(priority = 1)
    public void bookingButtonIsDisplayed()  {
         bookingButton=driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
        Assert.assertTrue(bookingButton.isDisplayed());
    }

    @Test(priority = 2)
    public void bookingButtonTextIsCorrect()  {
         bookingButton=driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
        Assert.assertEquals(bookingButton.getText(),"احجز جلستك الأولى");
    }

    @Test(priority = 3)
    public void bookingButtonIsClick() throws InterruptedException {
        bookingButton=driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
        bookingButton.click();
        sleep(2000);
    }
}