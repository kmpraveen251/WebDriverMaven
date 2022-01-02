package co.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){
        /*if(driver==null){
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("headless");
            driver = new ChromeDriver(chromeOptions);
            driver.get("http://www.gmail.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }*/
    }
    @AfterSuite
    public void tearDown(){
        //driver.quit();
    }
}
