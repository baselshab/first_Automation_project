package organizations;

import homePage.HomePage;
import io.qameta.allure.Feature;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrganizationsTest extends Organizations {

    @Feature("Organizations Button")
    @Test(priority = 1)
    public void organizationsButtonIsClick() {
        HomePage.OrganButton().click();
    }

    @Feature("titleOrganizations")
    @Test(priority = 2)
    public void titleOrganizationsIsDisplayed() {
        //set.SetUp.wait.until(ExpectedConditions.visibilityOf(titleAboutUs()));
        Assert.assertTrue(titleOrganizations().isDisplayed());
    }
    @Feature("titleOrganizations")
    @Test(priority = 3)
    public void titleOrganizationsTextIsCorrect() {
        Assert.assertEquals(titleOrganizations().getText(), "عطاء وإنتاجية الموظف تبدأ من الصحة النفسية");
    }


    @Feature("imgOrganizations")
    @Test(priority =4)
    public void imgOrganizationsIsDisplayed() {
        Assert.assertTrue(imgOrganizations().isDisplayed());
    }


    @Feature("impactOrganizationsTitel")
    @Test(priority = 5)
    public void impactOrganizationsTitelIsDisplayed() {
        Assert.assertTrue(impactOrganizationsTitel().isDisplayed());
    }
    @Feature("impactOrganizationsTitel")
    @Test(priority = 6)
    public void impactOrganizationsTitelTextIsCorrect() {
        Assert.assertEquals(impactOrganizationsTitel().getText(), "أثر الصحة النفسية على أداء الموظفين");
    }


    @Feature("RequestServiceButton")
    @Test(priority = 7)
    public void requestServiceButtonIsDisplayed() {
        Assert.assertTrue(requestServiceButton().isDisplayed());
    }
    @Feature("RequestServiceButton")
    @Test(priority = 8)
    public void requestServiceButtonTextIsCorrect() {
        Assert.assertEquals(requestServiceButton().getText(), "اطلب الخدمة");
    }
    @Feature("RequestServiceButton")
    @Test(priority = 9)
    public void requestServiceButtonIsClick() {
        JavascriptExecutor jse;

        jse = (JavascriptExecutor) set.SetUp.driver;
        jse.executeScript("window.scrollBy(0,1000);");
        requestServiceButton().click();

    }
    @Test(priority = 10)
    public void requestServiceForm() {

        set.SetUp.wait.until(ExpectedConditions.elementToBeClickable(getNameField()));
        getNameField().sendKeys("Basel");
        getMobileField().sendKeys("0595402346654");
        getEmailField().sendKeys("baselsadfsaf@gmail.com");
        getOrganizationsNameField().sendKeys("gsg");
        getNumberOfEmployeesField().sendKeys("4");
        getSendFormButtontField().click();
        set.SetUp.wait.until(ExpectedConditions.visibilityOf(getSuccessLabel()));
        Assert.assertEquals(getSuccessLabel().getText(), "شكراً لك. لقد تم الإرسال بنجاح.");
    }
}
