package HomePage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Set.SetUp.wait;

public class IntroTest {
    //WebElement contactButton;


    ////////////////////////////following button/////////////////////////////////////
    @Test(priority = 1)
    public void followingButtonIsDisplayed() {
        Assert.assertTrue(HomePage.followingButton().isDisplayed());
    }

    @Test(priority = 2)
    public void followingButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.followingButton().getText(), "انضم كأخصائي");
    }

    @Test(priority = 3)
    public void followingButtonIsClick() throws InterruptedException {
        HomePage.followingButton().click();

    }

    ////////////////////////////us button/////////////////////////////////////
    @Test(priority = 1)
    public void usButtonIsDisplayed() {
        Assert.assertTrue(HomePage.usButton().isDisplayed());
    }

    @Test(priority = 2)
    public void usButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.usButton().getText(), "من نحن");
    }

    @Test(priority = 3)
    public void usButtonIsClick() {
        HomePage.usButton().click();
    }

    //    ////////////////////////////Organizations Button/////////////////////////////////////
    @Test(priority = 1)
    public void OrganButtonIsDisplayed() {
        Assert.assertTrue(HomePage.OrganButton().isDisplayed());
    }

    @Test(priority = 2)
    public void OrganButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.OrganButton().getText(), "المنظمات");
    }

    @Test(priority = 3)
    public void OrganButtonIsClick() {
        HomePage.OrganButton().click();
    }

    //    ////////////////////////////academy Button/////////////////////////////////////
    @Test(priority = 1)
    public void academyButtonIsDisplayed() {
        Assert.assertTrue(HomePage.academyButton().isDisplayed());
    }

    @Test(priority = 2)
    public void academyButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.academyButton().getText(), "الأكاديمية");
    }

    @Test(priority = 3)
    public void academyButtonIsClick() {
        HomePage.academyButton().click();
    }

    ////////////////////////////blogger Button/////////////////////////////////////
    @Test(priority = 1)
    public void bloggerButtonIsDisplayed() {
        Assert.assertTrue(HomePage.bloggerButton().isDisplayed());
    }

    @Test(priority = 2)
    public void bloggerButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.bloggerButton().getText(), "المدونة");
    }

    @Test(priority = 3)
    public void bloggerButtonIsClick() throws InterruptedException {
        HomePage.bloggerButton().click();

    }

    ////////////////////////////Specialists Button/////////////////////////////////////
    @Test(priority = 1)
    public void specialistsButtonIsDisplayed() {
        Assert.assertTrue(HomePage.specialistsButton().isDisplayed());
    }

    @Test(priority = 2)
    public void specialistsButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.specialistsButton().getText(), "الأخصائيين");
    }

    @Test(priority = 3)
    public void specialistsButtonIsClick() throws InterruptedException {
        HomePage.specialistsButton().click();
    }

    ////////////////////////////famcare Button/////////////////////////////////////
    @Test(priority = 4)
    public void famcareButtonIsDisplayed() {
        Assert.assertTrue(HomePage.famcareButton().isDisplayed());
    }

    @Test(priority = 5)
    public void famcareButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.famcareButton().getText(), "فامكير");
    }

    @Test(priority = 6)
    public void famcareButtonIsClick() throws InterruptedException {
        HomePage.famcareButton().click();

    }

    ////////////////////////////famcarelogo Button/////////////////////////////////////
    @Test(priority = 7)
    public void famcarelogoIsDisplayed() {
        Assert.assertTrue(HomePage.famcarelogoButton().isDisplayed());
    }

    @Test(priority = 8)
    public void famcarelogoTextIsCorrect() {
        Assert.assertEquals(HomePage.famcarelogoButton().getText(), "فامكير");
    }

    @Test(priority = 9)
    public void famcarelogoIsClick() throws InterruptedException {
        HomePage.famcarelogoButton().click();
    }

    ////////////////////////////booking Button/////////////////////////////////////
    @Test(priority = 10)
    public void bookingButtonIsDisplayed() {
        Assert.assertTrue(HomePage.bookingButton().isDisplayed());
    }

    @Test(priority = 11)
    public void bookingButtonTextIsCorrect() {
        Assert.assertEquals(HomePage.bookingButton().getText(), "احجز جلستك الأولى");
    }

    @Test(priority = 12)
    public void bookingButtonIsClick() throws InterruptedException {
        HomePage.bookingButton().click();
    }

    //    ////////////////////////////Massage Button/////////////////////////////////////
    @Test(priority = 13)
    public void massageIsDisplayed() {
        Assert.assertTrue(HomePage.massageButton().isDisplayed());
    }

    @Test(priority = 14)
    public void massageIsClick() throws InterruptedException {
        HomePage.massageButton().click();
    }

    //    ////////////////////////////introText text/////////////////////////////////////
    @Test(priority = 15)
    public void introTextIsDisplayed() {
        Assert.assertTrue(HomePage.introText().isDisplayed());
    }

    @Test(priority = 16)
    public void introTextTextIsCorrect() {
        Assert.assertEquals(HomePage.introText().getText(), "ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
    }

    //    ////////////////////////////secand text/////////////////////////////////////
    @Test(priority = 17)
    public void secandTextIsDisplayed() {
        Assert.assertTrue(HomePage.secandText().isDisplayed());
        wait.until(ExpectedConditions.visibilityOf(HomePage.secandText()));
    }

    @Test(priority = 18)
    public void secandTextTextIsCorrect() {
        Assert.assertEquals(HomePage.secandText().getText(), "لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");
    }

    //    ////////////////////////////Img intro/////////////////////////////////////
    @Test(priority = 19)
    public void imgintroIsDisplayed() {
        Assert.assertTrue(HomePage.imgintro().isDisplayed());
    }


}
