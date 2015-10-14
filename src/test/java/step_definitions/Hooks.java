package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;


public class Hooks
{
    public static WebDriver driver;
    @Before
/**
 * Delete all cookies at the start of each scenario to avoid
 * shared state between tests
    */
    public void openBrowser() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        System.out.println("Called openBrowser");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();


    }
    @After

    public void tearDown() {

        driver.quit();
    }
}