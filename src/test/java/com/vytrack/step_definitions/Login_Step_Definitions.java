package com.vytrack.step_definitions;

import com.vytrack.pages.Login;
import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Step_Definitions {
    Login login= new Login();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("http://qa2.vytrack.com");
    }




    @When("user logs in")
    public void user_logs_in() throws InterruptedException {
        login.login();
        BrowserUtils.wait(4);
    }
    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
        String expected = "Dashboard";
        String actual = login.getPageSubTitleText().trim();

        Assert.assertEquals("Title is not correct!", expected, actual);
        System.out.println("I see the Dashboard page!");
        Driver.closeDriver();
    }

}
