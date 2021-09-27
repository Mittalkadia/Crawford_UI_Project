package CrawfordFacebook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Utils;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Crawford_Facebook_Url extends Utils {

    @Before
    public void open_Browser() {
        //setting up chrome driver from WebDriver manager
        WebDriverManager.chromedriver().setup();
        //create object for chrome driver
        driver = new ChromeDriver();
        //maximize the browser window
        driver.manage().window().maximize();
        //Apply implicitlyWait to driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open URL
        driver.get("https://www.facebook.com/crawfordandco");
    }

    @After
    public void close_Browser() {
        //close browser
        driver.quit();
    }

}
