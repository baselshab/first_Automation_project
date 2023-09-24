package aboutUs;

import homePage.HomePage;
import io.qameta.allure.Feature;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUsTest extends AboutUs {

    @Feature("usButton")
    @Test(priority = 5)
    public void usButtonIsClick() {
        HomePage.usButton().click();
    }

    @Feature("titleAboutUs")
    @Test(priority = 1)
    public void titleAboutUsIsDisplayed() {
        //set.SetUp.wait.until(ExpectedConditions.visibilityOf(titleAboutUs()));
        Assert.assertTrue(titleAboutUs().isDisplayed());
    }
    @Feature("titleAboutUs")
    @Test(priority = 2)
    public void titleAboutUsTextIsCorrect() {
        Assert.assertEquals(titleAboutUs().getText(), "منصة فامكير");
    }


    @Feature("imgAboutUs")
    @Test(priority = 3)
    public void imgAboutUsIsDisplayed() {
        Assert.assertTrue(imgAboutUs().isDisplayed());
    }


    @Feature("paragraphAboutUs")
    @Test(priority = 4)
    public void paragraphAboutUsIsDisplayed() {
        Assert.assertTrue(paragraphAboutUs().isDisplayed());
    }
    @Feature("paragraphAboutUs")
    @Test(priority = 5)
    public void paragraphAboutUsTextIsCorrect() {
        Assert.assertEquals(paragraphAboutUs().getText(), "منصة فامكير الإلكترونية بدأت من منطلق اهتمامنا بتعزيز الصحة النفسية بالمجتمع وتقديم أفضل الاستشارات الأسرية والزوجية والدعم النفسي بتأسيس وإشراف مجلس شؤون الأسرة وتمكين مع جامعة  الأميرة نورة .");
    }


    @Feature("rateUsInAboutUs")
    @Test(priority = 6)
    public void rateUsInAboutUsIsDisplayed() {
        Assert.assertTrue(rateUsInAboutUs().isDisplayed());
    }
    @Feature("rateUsInAboutUs")
    @Test(priority = 7)
    public void rateUsInAboutUsTextIsCorrect() {
        Assert.assertEquals(rateUsInAboutUs().getText(), "قيمنا");
    }


    @Feature("VisionUsInAboutUs")
    @Test(priority = 8)
    public void VisionUsInAboutUsUsIsDisplayed() {
        Assert.assertTrue(VisionUsInAboutUs().isDisplayed());
    }
    @Feature("paragraphAboutUs")
    @Test(priority = 9)
    public void VisionUsInAboutUsTextIsCorrect() {
        Assert.assertEquals(VisionUsInAboutUs().getText(), "رؤيتنا");
    }


    @Feature("ParagraphInOurVision")
    @Test(priority = 10)
    public void ParagraphInOurVisionIsDisplayed() {
        Assert.assertTrue(ParagraphInOurVision().isDisplayed());
    }
    @Feature("ParagraphInOurVision")
    @Test(priority = 11)
    public void ParagraphInOurVisionTextIsCorrect() {
        Assert.assertEquals(ParagraphInOurVision().getText(), "أن نكون منصة رائدة عربياً في مجال تقديم الاستشارات الأسرية والزوجية والدعم النفسي.");
    }


}
