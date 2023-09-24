package blog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import set.SetUp;

public class Blog {

    public static WebElement titleBlog(){return SetUp.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-bd4e558b59300fe3\"]/div[2]/div/div[1]/div/a"));}

    public static WebElement pahrBlog(){return SetUp.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-bd4e558b59300fe3\"]/div[2]/div/div[1]/div/p"));}

    public static WebElement faesbookButtonBlog(){return SetUp.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-bd4e558b59300fe3\"]/div[2]/div/div[1]/div/div[3]/div[1]/div/a[1]"));}
    public static WebElement twitterButtonBlog(){return SetUp.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-bd4e558b59300fe3\"]/div[2]/div/div[1]/div/div[3]/div[1]/div/a[2]"));}


    public static WebElement researchInPutBlog(){return SetUp.driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[1]/div/input"));}

    public static WebElement researchcategoriesBlog(){return SetUp.driver.findElement(By.xpath("//*[@id=\"search-all-categories\"]"));}
    public static WebElement researchButtonBlog(){return SetUp.driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[3]/div/button\n"));}
    public static WebElement researchResultBlog(){return SetUp.driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/h3"));}


}

