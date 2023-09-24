package homePage;

import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static set.SetUp.wait;

public class IntroTest extends HomePage  {

    ////////////////////////////following button/////////////////////////////////////
    @Feature("followingButton")
    @Test(priority = 1)
    public void followingButtonIsDisplayed() {
        Assert.assertTrue(followingButton().isDisplayed());
    }
    @Feature("followingButton")
    @Test(priority = 2)
    public void followingButtonTextIsCorrect() {
        Assert.assertEquals(followingButton().getText(), "انضم كأخصائي");
    }
    @Feature("followingButton")
    @Test(priority = 32)
    public void followingButtonIsClick() throws InterruptedException {
        followingButton().click();
        closeButton().click();
    }

    ////////////////////////////us button/////////////////////////////////////
    @Feature("usButton")
    @Test(priority = 3)
    public void usButtonIsDisplayed() {
        Assert.assertTrue(usButton().isDisplayed());
    }
    @Feature("usButton")
    @Test(priority = 4)
    public void usButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.usButton().getText(), "من نحن");
    }
    @Feature("usButton")
    @Test(priority = 5)
    public void usButtonIsClick() {
        HomePage.usButton().click();
    }

    //    ////////////////////////////Organizations Button/////////////////////////////////////
    @Feature("OrganButton")
    @Test(priority = 6)
    public void OrganButtonIsDisplayed() {
        Assert.assertTrue(HomePage.OrganButton().isDisplayed());
    }
    @Feature("OrganButton")
    @Test(priority = 7)
    public void OrganButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.OrganButton().getText(), "المنظمات");
    }
    @Feature("OrganButton")
    @Test(priority = 8)
    public void OrganButtonIsClick() {
        Allure.step("sdad");
        HomePage.OrganButton().click();
    }

    //    ////////////////////////////academy Button/////////////////////////////////////
    @Feature("academyButton")
    @Test(priority = 9)
    public void academyButtonIsDisplayed() {
        Assert.assertTrue(HomePage.academyButton().isDisplayed());
    }
    @Feature("academyButton")
    @Test(priority = 10)
    public void academyButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.academyButton().getText(), "الأكاديمية");
    }
    @Feature("academyButton")
    @Test(priority = 33)
    public void academyButtonIsClick() {
        HomePage.academyButton().click();
        set.SetUp.driver.navigate().back();

    }

    //////////////////////////blogger Button/////////////////////////////////////
    @Feature("bloggerButton")
    @Test(priority = 11)
    public void bloggerButtonIsDisplayed() {
        Assert.assertTrue(HomePage.bloggerButton().isDisplayed());
    }

    @Test(priority = 12)
    public void bloggerButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.bloggerButton().getText(), "المدونة");
    }

    @Test(priority = 13)
    public void bloggerButtonIsClick()  {
        HomePage.bloggerButton().click();
    }

    ////////////////////////////Specialists Button/////////////////////////////////////
    @Feature("specialists")
    @Test(priority = 14)
    public void specialistsButtonIsDisplayed() {
        Assert.assertTrue(HomePage.specialistsButton().isDisplayed());
    }
    @Feature("specialists")
    @Test(priority = 15)
    public void specialistsButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.specialistsButton().getText(), "الأخصائيين");
    }
    @Feature("specialists")
    @Test(priority = 16)
    public void specialistsButtonIsClick() throws InterruptedException {
        HomePage.specialistsButton().click();
    }

    ////////////////////////////famcare Button/////////////////////////////////////
    @Feature("famcare")
    @Test(priority = 17)
    public void famcareButtonIsDisplayed() {
        Assert.assertTrue(HomePage.famcareButton().isDisplayed());
    }
    @Feature("famcare")
    @Test(priority = 18)
    public void famcareButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.famcareButton().getText(), "فامكير");
    }
    @Feature("famcare")
    @Test(priority = 19)
    public void famcareButtonIsClick() throws InterruptedException {
        HomePage.famcareButton().click();

    }
    ////////////////////////////famcarelogo Button/////////////////////////////////////
    @Test(priority = 20)
    public void famcarelogoIsDisplayed() {
        Assert.assertTrue(HomePage.famcarelogoButton().isDisplayed());
    }
    @Feature("famcare")
    @Test(priority = 21)
    public void famcarelogoTextIsCorrect() {
        Assert.assertEquals(HomePage.famcarelogoButton().getText(), "فامكير");
    }
    @Feature("famcare")
    @Test(priority = 22)
    public void famcarelogoIsClick() throws InterruptedException {
        HomePage.famcarelogoButton().click();
    }
    ////////////////////////////booking Button/////////////////////////////////////
    @Feature("booking")
    @Test(priority = 23)
    public void bookingButtonIsDisplayed() {
        Assert.assertTrue(HomePage.bookingButton().isDisplayed());
    }
    @Feature("booking")
    @Test(priority = 24)
    public void bookingButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.bookingButton().getText(), "احجز جلستك الأولى");
    }
    @Feature("booking")
    @Test(priority = 34)
    public void bookingButtonIsClick() throws InterruptedException {
        HomePage.bookingButton().click();
       set.SetUp.driver.navigate().back();
    }

    //    ////////////////////////////Massage Button/////////////////////////////////////
//    @Feature("Massage")
//    @Test(priority = 25)
//    public void massageIsDisplayed() {
//        Assert.assertTrue(HomePage.massageButton().isDisplayed());
//    }
//    @Feature("Massage")
//    @Test(priority = 26)
//    public void massageIsClick() throws InterruptedException {
//        HomePage.massageButton().click();
//    }

    //    ////////////////////////////introText text/////////////////////////////////////
    @Feature("introText")
    @Test(priority = 27)
    public void introTextIsDisplayed() {
        Assert.assertTrue(HomePage.introText().isDisplayed());
    }
    @Feature("introText")
    @Test(priority = 28)
    public void introTextTextIsCorrect() {
        Assert.assertEquals(HomePage.introText().getText(), "ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
    }

    //    ////////////////////////////secand text/////////////////////////////////////
    @Feature("introText")
    @Test(priority = 30)
    public void secandTextIsDisplayed() {
        Assert.assertTrue(HomePage.secandText().isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(HomePage.secandText()));
    }
    @Feature("introText")
    @Test(priority = 30)
    public void secandTextTextIsCorrect() {
        Assert.assertEquals(HomePage.secandText().getText(), "لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");
    }

    //    ////////////////////////////Img intro/////////////////////////////////////
    @Feature("introText")
    @Test(priority = 31)
    public void imgintroIsDisplayed() {
        Assert.assertTrue(HomePage.imgintro().isDisplayed());
    }


}
