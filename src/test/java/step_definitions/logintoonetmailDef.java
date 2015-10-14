package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.OnetHomePage;
import page_objects.OnetMailLoginPage;


/**
 * Created by aszymanski on 10/9/2015.
 */
public class logintoonetmailDef {

    WebDriver driver;
    OnetHomePage onetHomePage = PageFactory.initElements(driver, OnetHomePage.class);
    OnetMailLoginPage onetMailLoginPage = PageFactory.initElements(driver, OnetMailLoginPage.class);

    public logintoonetmailDef() {
        driver = Hooks.driver;
    }

    @Given("Onet page is opened")
    public void openOnetPage() {
        driver.get("http://help.websiteos.com/websiteos/example_of_a_simple_html_page.htm");

    }

    @When("^I press Poczta button")
    public void pressPocztaButton(String test) {


        onetHomePage.clickMailButton();
    }
/*
    @And("Button Poczta to login form is displayed")
    public void checkPocztaButtonVisible(){
        onetHomePage.checkMailButtonVisible();
    } */

    @Then("Page with login form is opened")
    public void checkOnetLoginPage() {

        Assert.assertEquals("Onet.pl", onetMailLoginPage.checkTitle());

    }





}
