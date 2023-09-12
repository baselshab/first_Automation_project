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

public class IntroTest {

    WebDriver driver;
    //WebElement contactButton;
    WebElement bookingButton;
    WebElement followingButton;
    WebElement usButton;
    WebElement OrganButton;
    WebElement specialistsButton;
    WebElement famcareButton;
    WebElement massageButton;
    WebElement famcarelogoButton;
    WebElement introText;
    WebElement secandText;
    WebElement imgintro;
    JavascriptExecutor jse;
    @BeforeTest
    public void setUp(){
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver=  WebDriverManager.chromedriver().capabilities(options).create();
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app/");

    }

////////////////////////////following button/////////////////////////////////////
    @Test(priority = 1)
    public void followingButtonIsDisplayed()  {
        followingButton=driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/button"));
        Assert.assertTrue(followingButton.isDisplayed());
    }

    @Test(priority = 2)
    public void followingButtonTextIsCorrect()  {
        followingButton=driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/button"));
        Assert.assertEquals(followingButton.getText(),"انضم كأخصائي");
    }

    @Test(priority = 3)
    public void followingButtonIsClick() throws InterruptedException {
        followingButton=driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/button"));
        followingButton.click();
        sleep(2000);
    }

    ////////////////////////////us button/////////////////////////////////////
    @Test(priority = 1)
    public void usButtonIsDisplayed()  {
        usButton=driver.findElement(By.xpath("//*[@id=\"menu-item-188\"]/a"));
        Assert.assertTrue(usButton.isDisplayed());
    }

    @Test(priority = 2)
    public void usButtonTextIsCorrect()  {
        usButton=driver.findElement(By.xpath("//*[@id=\"menu-item-188\"]/a"));
        Assert.assertEquals(usButton.getText(),"من نحن");
    }

    @Test(priority = 3)
    public void usButtonIsClick() throws InterruptedException {
        usButton=driver.findElement(By.xpath("//*[@id=\"menu-item-188\"]/a"));
        usButton.click();
        sleep(2000);
    }

    ////////////////////////////Organizations Button/////////////////////////////////////
    @Test(priority = 1)
    public void OrganButtonIsDisplayed()  {
        OrganButton=driver.findElement(By.xpath("//*[@id=\"menu-item-187\"]/a"));
        Assert.assertTrue(OrganButton.isDisplayed());
    }

    @Test(priority = 2)
    public void OrganButtonTextIsCorrect()  {
        OrganButton=driver.findElement(By.xpath("//*[@id=\"menu-item-187\"]/a"));
        Assert.assertEquals(OrganButton.getText(),"المنظمات");
    }

    @Test(priority = 3)
    public void OrganButtonIsClick() throws InterruptedException {
        OrganButton=driver.findElement(By.xpath("//*[@id=\"menu-item-187\"]/a"));
        OrganButton.click();
        sleep(2000);
    }

    ////////////////////////////academy Button/////////////////////////////////////
    @Test(priority = 1)
    public void academyButtonIsDisplayed()  {
        bookingButton=driver.findElement(By.xpath("//*[@id=\"menu-item-1227\"]/a"));
        Assert.assertTrue(bookingButton.isDisplayed());
    }

    @Test(priority = 2)
    public void academyButtonTextIsCorrect()  {
        bookingButton=driver.findElement(By.xpath("//*[@id=\"menu-item-1227\"]/a"));
        Assert.assertEquals(bookingButton.getText(),"الأكاديمية");
    }

    @Test(priority = 3)
    public void academyButtonIsClick() throws InterruptedException {
        bookingButton=driver.findElement(By.xpath("//*[@id=\"menu-item-1227\"]/a"));
        bookingButton.click();
        sleep(2000);
    }
    ////////////////////////////blogger Button/////////////////////////////////////
    @Test(priority = 1)
    public void bloggerButtonIsDisplayed()  {
        bookingButton=driver.findElement(By.xpath("//*[@id=\"menu-item-2633\"]/a"));
        Assert.assertTrue(bookingButton.isDisplayed());
    }

    @Test(priority = 2)
    public void bloggerButtonTextIsCorrect()  {
        bookingButton=driver.findElement(By.xpath("//*[@id=\"menu-item-2633\"]/a"));
        Assert.assertEquals(bookingButton.getText(),"المدونة");
    }

    @Test(priority = 3)
    public void bloggerButtonIsClick() throws InterruptedException {
        bookingButton=driver.findElement(By.xpath("//*[@id=\"menu-item-2633\"]/a"));
        bookingButton.click();
        sleep(2000);
    }

    ////////////////////////////Specialists Button/////////////////////////////////////
    @Test(priority = 1)
    public void specialistsButtonIsDisplayed()  {
        specialistsButton=driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
        Assert.assertTrue(specialistsButton.isDisplayed());
    }

    @Test(priority = 2)
    public void specialistsButtonTextIsCorrect()  {
        specialistsButton=driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
        Assert.assertEquals(specialistsButton.getText(),"الأخصائيين");
    }

    @Test(priority = 3)
    public void specialistsButtonIsClick() throws InterruptedException {
        specialistsButton=driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
        specialistsButton.click();
        sleep(2000);
    }

    ////////////////////////////famcare Button/////////////////////////////////////
    @Test(priority = 1)
    public void famcareButtonIsDisplayed()  {
        famcareButton=driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
        Assert.assertTrue(famcareButton.isDisplayed());
    }

    @Test(priority = 2)
    public void famcareButtonTextIsCorrect()  {
        famcareButton=driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
        Assert.assertEquals(famcareButton.getText(),"فامكير");
    }

    @Test(priority = 3)
    public void famcareButtonIsClick() throws InterruptedException {
        famcareButton=driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
        famcareButton.click();
        sleep(2000);
    }

    ////////////////////////////famcarelogo Button/////////////////////////////////////
    @Test(priority = 1)
    public void famcarelogoIsDisplayed()  {
        famcarelogoButton=driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
        Assert.assertTrue(famcarelogoButton.isDisplayed());
    }

    @Test(priority = 2)
    public void famcarelogoTextIsCorrect()  {
        famcarelogoButton=driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
        Assert.assertEquals(famcarelogoButton.getText(),"فامكير");
    }

    @Test(priority = 3)
    public void famcarelogoIsClick() throws InterruptedException {
        famcarelogoButton=driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
        famcarelogoButton.click();
        sleep(2000);
    }
    ////////////////////////////booking Button/////////////////////////////////////
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
    ////////////////////////////Massage Button/////////////////////////////////////
    @Test(priority = 1)
    public void massageIsDisplayed()  {
        massageButton=driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div/div[1]\n"));
        Assert.assertTrue(massageButton.isDisplayed());
    }

    @Test(priority = 3)
    public void massageIsClick() throws InterruptedException {
        massageButton=driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div/div[1]\n"));
        massageButton.click();
        sleep(2000);
    }

    ////////////////////////////introText text/////////////////////////////////////
    @Test(priority = 1)
    public void introTextIsDisplayed()  {
        introText=driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertTrue(introText.isDisplayed());
    }

    @Test(priority = 2)
    public void introTextTextIsCorrect()  {
        introText=driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertEquals(introText.getText(),"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
    }

    ////////////////////////////secand text/////////////////////////////////////
    @Test(priority = 1)
    public void secandTextIsDisplayed()  {
        secandText=driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]/p"));
        Assert.assertTrue(secandText.isDisplayed());
    }

    @Test(priority = 2)
    public void secandTextTextIsCorrect()  {
        secandText=driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]/p"));
        Assert.assertEquals(secandText.getText(),"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");
    }
    ////////////////////////////Img intro/////////////////////////////////////
    @Test(priority = 1)
    public void imgintroIsDisplayed()  {
        imgintro=driver.findElement(By.xpath("//*[@id=\"heroSection\"]/div/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(imgintro.isDisplayed());
    }



}
