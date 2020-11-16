package com.vytrack.step_definitions;

import com.vytrack.pages.Calender_Event_Pages;
import com.vytrack.pages.Create_Calender_Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calender_Events_Definitions {
    Calender_Event_Pages obj =new Calender_Event_Pages();
    @When("user clicks on {string}")
    public void user_clicks_on(String string) throws InterruptedException {
    obj.hoverOverMassAction();

    }



    @Then("user should verify that view, edit and delete are displayed")
    public void user_should_verify_that_view_edit_and_delete_are_displayed() {

    }
}
