package aboutUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import set.SetUp;

public class AboutUs {
    public static WebElement titleAboutUs(){
        return (WebElement) RelativeLocator.with(By.xpath("/html/body/div[1]/section[1]/div/div/div[1]/div/div[2]")).toRightOf(imgAboutUs());

    }
    public static WebElement imgAboutUs(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[2]/div"));
    }
    public static WebElement paragraphAboutUs(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[1]/div/div[3]"));
    }
    public static WebElement rateUsInAboutUs(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div/div[1]"));
    }
    public static WebElement VisionUsInAboutUs(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[1]/div/div[1]"));
    }
    public static WebElement ParagraphInOurVision(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[1]/div/div[3]"));
    }

}
