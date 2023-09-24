package set;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public  class  SetUp {

    public static WebDriver driver;
  public static   Wait<WebDriver> wait;
    JavascriptExecutor jse;

    @Test
    public void setUp(){
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver=  WebDriverManager.chromedriver().capabilities(options).create();
   //      driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
      //  jse = (JavascriptExecutor) driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.get("https://famcare.app/");



    }



}
