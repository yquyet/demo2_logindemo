package tests;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OpenAccountTest extends PageProvider {

    @When("^I input username as (.*) and password as (.*)$")
    public void openAccount(String username, String password) throws InterruptedException {
        getOpenAccountPage().clickSignInUsername(username,password);
        Thread.sleep(3000);

    }

    @And("^I click submit$")
    public void i_click_submit() throws Throwable {
        Thread.sleep(3000);
        getOpenAccountPage().clickButtonSubmit();
        Thread.sleep(3000);
    }


}
