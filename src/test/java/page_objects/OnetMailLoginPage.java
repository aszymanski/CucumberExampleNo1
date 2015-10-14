package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OnetMailLoginPage {
    final WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "loginButton") private WebElement submitButton;
    @FindBy(how = How.ID, using = "f_login") private WebElement loginInput;
    @FindBy(how = How.ID, using = "f_password") private WebElement passwordInput;
    @FindBy(how = How.ID , using = "k_portal") private WebElement title;

    public OnetMailLoginPage (WebDriver driver) { this.driver = driver; }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void enterLogin(String text) {
        loginInput.sendKeys(text);
    }

    public void enterPassword(String text) {
        passwordInput.sendKeys(text);
    }

    public String checkTitle() {

        return title.getText();

    }
}
