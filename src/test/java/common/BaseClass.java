package common;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BaseClass {
    public static WebDriver driver;
    @Before
   public void initializeBrowser()
   {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();


   //       EventFiringWebDriver getDriver=new EventFiringWebDriver(driver);
//       eventListener eL=new eventListener();
//       getDriver.register(eL);
    }


    @After
    public void tearUp()
    {
        driver.quit();
    }
}
