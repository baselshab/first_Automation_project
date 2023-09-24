package homePage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinSpecialistForm extends HomePage  {

    ////////////////////////////following button/////////////////////////////////////

    @Test(priority = 1)
    public void followingButtonIsDisplayed() {
        Assert.assertTrue(followingButton().isDisplayed());
    }

    @Test(priority = 2)
    public void followingButtonTextIsCorrect() {
        Assert.assertEquals(followingButton().getText(), "انضم كأخصائي");
    }

    @Test(priority = 3)
    public void followingButtonIsClick()  {
        HomePage.followingButton().click();
    }

    @Test(priority = 4)
    public void followingBsutton() {
        set.SetUp.wait.until(ExpectedConditions.elementToBeClickable(getNameField()));
       getNameField().sendKeys("Basel");
       getMobileField().sendKeys("0595402346654");
        getAcademicDegreeField().sendKeys("Bachelor's");
     getSpecialityField().sendKeys("Testing");
       getYearsOfExperienceField().sendKeys("1");
        getSocialAccountField().sendKeys("Fassbook");
        getSendFormButtontField().click();
       set.SetUp.wait.until(ExpectedConditions.visibilityOf(getSuccessLabel()));
        Assert.assertEquals(getSuccessLabel().getText(), "شكراً لك. لقد تم الإرسال بنجاح.");
    }


}
