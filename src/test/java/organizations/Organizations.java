package organizations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import set.SetUp;

public class Organizations {
    public static WebElement titleOrganizations(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[1]/div/div[2]/h2"));

    }
    public static WebElement imgOrganizations(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[2]/div/div[2]"));
    }
    public static WebElement impactOrganizationsTitel(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[1]"));
    }
    public static WebElement requestServiceButton(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[2]/button"));
    }

    //////////////////////////////////////////////////////////Form ///////////////////////
    public static WebElement closeButton(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"formModal\"]/div/div/button"));
    }
    public static WebElement getNameField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f167-o1\"]/form/div[2]/input"));
    }


    public static WebElement getMobileField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f167-o1\"]/form/div[3]/input"));
    }

    public static WebElement getEmailField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f167-o1\"]/form/div[4]/input"));
    }

    public static WebElement getOrganizationsNameField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f167-o1\"]/form/div[5]/input"));
    }

    public static WebElement getNumberOfEmployeesField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f167-o1\"]/form/div[6]/input"));
    }

    public static WebElement getSendFormButtontField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f167-o1\"]/form/input[2]"));
    }
    public static WebElement getSuccessLabel(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"wpcf7-f167-o1\"]/form/div[7]"));
    }

}
