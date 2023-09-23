package HomePage;

import Set.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    public static WebElement followingButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/button"));
    }
    public static WebElement usButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-188\"]/a"));
    }
    public static WebElement OrganButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-187\"]/a"));
    }    public static WebElement academyButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-1227\"]/a"));
    }
    public static WebElement bloggerButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-2633\"]/a"));
    }

    public static WebElement specialistsButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
    }    public static WebElement famcareButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
    }    public static WebElement bookingButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-188\"]/a"));
    }
    public static WebElement famcarelogoButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
    }
    public static WebElement massageButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div/div[1]\n"));
    }
    public static WebElement introText(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
    }
    public static WebElement secandText(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]/p"));
    }
    public static WebElement imgintro(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"heroSection\"]/div/div/div[1]/div/div[1]/img"));
    }





}
