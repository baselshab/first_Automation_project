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

public class OfficialAgenciesTest {
    WebDriver driver;
    WebElement introText;
    WebElement gdpText;
    WebElement gdprImg;
    WebElement monshaatText;
    WebElement monshaatImg;
    WebElement resourcesImg;
    WebElement resourcesText;
    WebElement ministryText;
    WebElement ministryImg;

    JavascriptExecutor jse;
    @BeforeTest
    public void setUp() throws InterruptedException {
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver=  WebDriverManager.chromedriver().capabilities(options).create();
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app/");
        jse.executeScript("window.scrollBy(0, 700);");
        jse.executeScript("window.scrollBy(0, -200);");
        sleep(5000);
    }

    ////////////////////////////introText text/////////////////////////////////////
    @Test(priority = 1)
    public void introTextIsDisplayed()  {
        introText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[1]"));
        Assert.assertTrue(introText.isDisplayed());
    }

    @Test(priority = 2)
    public void introTextTextIsCorrect()  {
        introText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[1]"));
        Assert.assertEquals(introText.getText(),"تطبيق معتمد من الجهات الرسمية");

    }

    ////////////////////////////Gdpr/////////////////////////////////////
    @Test(priority = 3)
    public void gdprTextIsDisplayed()  {
        gdpText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[1]/div/div[2]"));
        Assert.assertTrue(gdpText.isDisplayed());
    }

    @Test(priority = 4)
    public void gdpTextTextIsCorrect()  {
        gdpText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[1]/div/div[2]"));
        Assert.assertEquals(gdpText.getText(),"لوائح حماية البيانات");

    }
    @Test(priority = 5)
    public void gdprImgIsDisplayed()  {
        gdprImg=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[1]/div/div[1]/img"));
        Assert.assertTrue(gdprImg.isDisplayed());
    }


    ////////////////////////////Monshaat/////////////////////////////////////
    @Test(priority = 3)
    public void monshaatTextIsDisplayed()  {
        monshaatText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[2]/div/div[2]"));
        Assert.assertTrue(monshaatText.isDisplayed());
    }

    @Test(priority = 4)
    public void monshaatTextTextIsCorrect()  {
        monshaatText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[2]/div/div[2]"));
        Assert.assertEquals(monshaatText.getText(),"شركة مجتمعية");

    }
    @Test(priority = 5)
    public void monshaatImgIsDisplayed()  {
        monshaatImg=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[2]/div/div[1]/img"));
        Assert.assertTrue(monshaatImg.isDisplayed());
    }

    ////////////////////////////resources/////////////////////////////////////
    @Test(priority = 3)
    public void resourcesTextIsDisplayed()  {
        resourcesText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[3]/div/div[2]/h3"));
        Assert.assertTrue(resourcesText.isDisplayed());
    }

    @Test(priority = 4)
    public void resourcesTextTextIsCorrect()  {
        resourcesText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[3]/div/div[2]/h3"));
        Assert.assertEquals(resourcesText.getText(),"مركز ارشاد اسري");

    }
    @Test(priority = 5)
    public void resourcesImgIsDisplayed()  {
        resourcesImg=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[3]/div/div[1]/img"));
        Assert.assertTrue(resourcesImg.isDisplayed());
    }

    ////////////////////////////Ministry/////////////////////////////////////
    @Test(priority = 3)
    public void ministryTextIsDisplayed()  {
        ministryText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[2]"));
        Assert.assertTrue(ministryText.isDisplayed());
    }

    @Test(priority = 4)
    public void ministryTextTextIsCorrect()  {
        ministryText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[2]"));
        Assert.assertEquals(ministryText.getText(),"مركز طب اتصالي");

    }
    @Test(priority = 5)
    public void ministryImgIsDisplayed()  {
        ministryImg=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[1]/img"));
        Assert.assertTrue(ministryImg.isDisplayed());
    }
}
