package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class OnetHomePage {
    final WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "Show") private WebElement mailButton;

    public OnetHomePage (WebDriver driver) { this.driver = driver; }

    public void clickMailButton() {


        mailButton.click();
    }

    public void checkMailButtonVisible() throws Exception{

        Thread.sleep(5000);
        //mailButton.isDisplayed();

    }

}
