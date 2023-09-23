package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Set.SetUp.driver;

public class OfficialAgenciesTest {

    WebElement introText;
    WebElement gdpText;
    WebElement gdprImg;
    WebElement monshaatText;
    WebElement monshaatImg;
    WebElement resourcesImg;
    WebElement resourcesText;
    WebElement ministryText;
    WebElement ministryImg;

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
    @Test(priority = 6)
    public void monshaatTextIsDisplayed()  {
        monshaatText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[2]/div/div[2]"));
        Assert.assertTrue(monshaatText.isDisplayed());
    }

    @Test(priority = 7)
    public void monshaatTextTextIsCorrect()  {
        monshaatText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[2]/div/div[2]"));
        Assert.assertEquals(monshaatText.getText(),"شركة مجتمعية");

    }
    @Test(priority = 8)
    public void monshaatImgIsDisplayed()  {
        monshaatImg=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[2]/div/div[1]/img"));
        Assert.assertTrue(monshaatImg.isDisplayed());
    }

    ////////////////////////////resources/////////////////////////////////////
    @Test(priority = 9)
    public void resourcesTextIsDisplayed()  {
        resourcesText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[3]/div/div[2]/h3"));
        Assert.assertTrue(resourcesText.isDisplayed());
    }

    @Test(priority = 10)
    public void resourcesTextTextIsCorrect()  {
        resourcesText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[3]/div/div[2]/h3"));
        Assert.assertEquals(resourcesText.getText(),"مركز ارشاد اسري");

    }
    @Test(priority = 11)
    public void resourcesImgIsDisplayed()  {
        resourcesImg=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[3]/div/div[1]/img"));
        Assert.assertTrue(resourcesImg.isDisplayed());
    }

    ////////////////////////////Ministry/////////////////////////////////////
    @Test(priority = 12)
    public void ministryTextIsDisplayed()  {
        ministryText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[2]"));
        Assert.assertTrue(ministryText.isDisplayed());
    }

    @Test(priority = 13)
    public void ministryTextTextIsCorrect()  {
        ministryText=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[2]"));
        Assert.assertEquals(ministryText.getText(),"مركز طب اتصالي");

    }
    @Test(priority = 14)
    public void ministryImgIsDisplayed()  {
        ministryImg=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[1]/img"));
        Assert.assertTrue(ministryImg.isDisplayed());
    }
}
