package StepDef;

import common.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Google extends BaseClass {

    BaseClass baseClass=new BaseClass();
    @Given("User Navigates to Google website")
    public void userNavigatesToGoogleWebsite() {
        driver.navigate().to("https://www.google.com/");
    }

    @Then("Close the Browser")
    public void closeTheBrowser() {

    }
}
