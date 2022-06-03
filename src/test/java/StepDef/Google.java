package StepDef;

import common.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Google extends BaseClass {

    BaseClass baseclass = new BaseClass();

    @Given("User Navigates to Google website")
    public void userNavigatesToGoogleWebsite() {
        baseclass.initializeBrowser();
        driver.navigate().to("https://www.google.com/");
    }

    @Then("Close the Browser")
    public void closeTheBrowser() {

    }
}
