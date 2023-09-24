package blog;

import homePage.HomePage;
import io.qameta.allure.Feature;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import set.SetUp;

public class BlogTest extends Blog {

    @Feature("Organizations Button")
    @Test(priority = 1)
    public void organizationsButtonIsClick() {
        HomePage.bloggerButton().click();
    }

    @Feature("titleBlog")
    @Test(priority = 2)
    public void titleBlogIsDisplayed() {
        //set.SetUp.wait.until(ExpectedConditions.visibilityOf(titleAboutUs()));
        Assert.assertTrue(titleBlog().isDisplayed());
    }
    @Feature("titleBlog")
    @Test(priority = 3)
    public void titleBlogTextIsCorrect() {
        Assert.assertEquals(titleBlog().getText(), "استكشف مخاطر الاحتراق الوظيفي");
    }


    @Feature("pahrBlog")
    @Test(priority = 4)
    public void pahrBlogIsDisplayed() {
        Assert.assertTrue(pahrBlog().isDisplayed());
    }
    @Feature("pahrBlog")
    @Test(priority = 5)
    public void pahrBlogTextIsCorrect() {
        Assert.assertEquals(pahrBlog().getText(), "  ماهو الاحتراق الوظيفي ؟ هو ضعف الطاقة الفكرية والجسدية، وبالتالي النفسية تكاد تكون معدومة الراحة والرضا الوظيفي. كيف يأتي الاحتراق؟ يأتي من عدة نوافذ منها مرئية ومنها غير مرئية للموظف. النوافذ المرئية: – عدم توازن البيئة العملية وانعدام الامان والعدل. -عمل الموظف من أجل");
    }


    @Feature("faesbookButtonBlog")
    @Test(priority = 6)
    public void faesbookButtonBlogIsDisplayed() {
        Assert.assertTrue(faesbookButtonBlog().isDisplayed());
    }
    @Feature("faesbookButtonBlog")
    @Test(priority = 7)
    public void faesbookButtonBlogIsClick() {
        faesbookButtonBlog().click();
        SetUp.driver.navigate().back();
    }
    @Feature("twitterButtonBlog")
    @Test(priority = 8)
    public void twitterButtonBlogIsDisplayed() {
        Assert.assertTrue(twitterButtonBlog().isDisplayed());
    }
    @Feature("twitterButtonBlog")
    @Test(priority = 9)
    public void twitterButtonBlogIsClick() {
        twitterButtonBlog().click();
        SetUp.driver.navigate().back();

    }



    @Test(priority = 10)
    public void researchBlog() {
        JavascriptExecutor jse;

        jse = (JavascriptExecutor) set.SetUp.driver;
        jse.executeScript("window.scrollBy(0,500);");
        set.SetUp.wait.until(ExpectedConditions.elementToBeClickable(researchInPutBlog()));
        researchInPutBlog().sendKeys("Basel");
        researchButtonBlog().click();
        set.SetUp.wait.until(ExpectedConditions.visibilityOf(researchResultBlog()));
    }
}
