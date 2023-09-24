package homePage;

import set.SetUp;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialistsSectionTest extends HomePage {

    JavascriptExecutor jse;



    ////////////////////////////introText text/////////////////////////////////////
    @Test(priority = 1)
    public void introTextIsDisplayed()  {
        jse = (JavascriptExecutor) set.SetUp.driver;
        jse.executeScript("window.scrollBy(0, 1150);");
        Assert.assertTrue(introSpecialistsSection().isDisplayed());


    }
    @Test(priority = 2)
    public void introTextTextIsCorrect()  {
        Assert.assertEquals(introSpecialistsSection().getText(),"نخبة من الأخصائيين والمرشدين");
    }

    ////////////////////////////card/////////////////////////////////////
    @Test(priority = 3)
    public void imgIsDisplayed()  {
        Assert.assertTrue(imgSpecialistsSection().isDisplayed());
    }
    @Test(priority = 4)
    public void imgIsClick()  {
        imgSpecialistsSection().click();
        SetUp.driver.navigate().back();
    }
    @Test(priority = 5)
    public void bookIsDisplayed()  {
        Assert.assertTrue(bookSpecialistsSection().isDisplayed());
    }
    @Test(priority = 6)
    public void bookTextIsCorrect()  {
        Assert.assertEquals(bookSpecialistsSection().getText(),"حجز موعد");
    }
    @Test(priority = 7)
    public void bookIsClcik()  {
        bookSpecialistsSection().click();
        SetUp.driver.navigate().back();
    }


}
