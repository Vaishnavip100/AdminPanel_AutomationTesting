package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.time.Duration;
import utils.ConfigReader;

public class BaseTest {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    ConfigReader config;

    @BeforeMethod
    public void setUp() {
        config=new ConfigReader();

        driver.set(new ChromeDriver());
        WebDriver drv=getDriver();

        drv.manage().window().maximize();
        drv.get(config.getBaseUrl());
    }

    @AfterMethod
    public void tearDown() {
        if (getDriver()!=null) {
            getDriver().quit();
            driver.remove();
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}