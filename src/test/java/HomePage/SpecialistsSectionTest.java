package HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SpecialistsSectionTest {
    WebDriver driver;
    WebElement introText;
    WebElement img;
    WebElement bookButton;
    JavascriptExecutor jse;
    @BeforeTest
    public void setUp() throws InterruptedException {
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver=  WebDriverManager.chromedriver().capabilities(options).create();
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app/");
        jse.executeScript("window.scrollBy(0, 1100);");

        sleep(5000);
    }

    ////////////////////////////introText text/////////////////////////////////////
    @Test(priority = 1)
    public void introTextIsDisplayed()  {
        introText=driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]"));
        Assert.assertTrue(introText.isDisplayed());
    }

    @Test(priority = 2)
    public void introTextTextIsCorrect()  {
        introText=driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]"));
        Assert.assertEquals(introText.getText(),"نخبة من الأخصائيين والمرشدين");

    }

    ////////////////////////////card/////////////////////////////////////
    @Test(priority = 3)
    public void imgIsDisplayed()  {
        img=driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-e7f4fc7a2f8cc4109\"]/div[6]/div/div[1]"));
        Assert.assertTrue(img.isDisplayed());
    }
    @Test(priority = 4)
    public void imgIsClick()  {
        img=driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-e7f4fc7a2f8cc4109\"]/div[6]/div/div[1]/a/img"));
        img.click();

    }

    @Test(priority = 5)
    public void bookIsDisplayed()  {
        bookButton=driver.findElement(By.xpath("//*[@id=\"bookNow\"]"));
        Assert.assertTrue(bookButton.isDisplayed());
    }

    @Test(priority = 6)
    public void bookTextIsCorrect()  {
        bookButton=driver.findElement(By.xpath("//*[@id=\"bookNow\"]"));
        Assert.assertEquals(bookButton.getText(),"شركة مجتمعية");

    }
    @Test(priority = 7)
    public void bookIsClcik()  {
        bookButton=driver.findElement(By.xpath("//*[@id=\"bookNow\"]"));
        Assert.assertTrue(bookButton.isDisplayed());
    }


}
