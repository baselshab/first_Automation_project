package homePage;

import set.SetUp;
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
        return SetUp.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
    }
    public static WebElement famcarelogoButton(){
        return SetUp.driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
    }
    public static WebElement massageButton(){
        return SetUp.driver.findElement(By.xpath("/html/body/div[13]/div"));
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

//////////////////////////////////////////////////////////Form ///////////////////////
public static WebElement closeButton(){
    return  SetUp.driver.findElement(By.xpath(" //*[@id=\"joinUsModal\"]/div/div/button"));
}
public static WebElement getNameField(){
    return  SetUp.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[2]/input"));
}


    public static WebElement getMobileField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[3]/input"));
    }

    public static WebElement getAcademicDegreeField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[4]/input"));
    }

    public static WebElement getSpecialityField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[5]/input"));
    }

    public static WebElement getYearsOfExperienceField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[6]/input"));
    }
    public static WebElement getSocialAccountField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[7]/input"));
    }

    public static WebElement getSendFormButtontField(){
        return  SetUp.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/input"));
    }
    public static WebElement getSuccessLabel(){
        return  SetUp.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[8]"));
    }
/////////////////////////////////Specialists   Section//////////////////////////////
public static WebElement introSpecialistsSection(){
    return  SetUp.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]"));
}

    public static WebElement imgSpecialistsSection(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-51e8bc696852156b\"]/div[6]/div/div[1]"));
    }

    public static WebElement bookSpecialistsSection(){
        return  SetUp.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-51e8bc696852156b\"]/div[6]/div/div[1]/a/img"));
    }

}
