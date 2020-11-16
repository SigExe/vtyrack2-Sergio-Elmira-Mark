package com.vytrack.step_definitions;

import com.vytrack.pages.Calender_Event_Pages;
import com.vytrack.pages.Create_Calender_Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Create_Events_Calender_Definitions {
    Create_Calender_Pages calender = new Create_Calender_Pages();



    @Given("user clicks on create calendar event button")
    public void user_clicks_on_create_calendar_event_button() {
        calender.clickOnCreateCalendarEvent();


    }
    @When("user adds new calendar event information")
    public void user_adds_new_calendar_event_information(Map<String, String> data) {

        String title = data.get("Title");
        String description = data.get("Description");

        calender.enterDescription(description);
        calender.enterTitle(title);

    }
    @When("user  expand “Save And Close” menu")
    public void user_expand_save_and_close_menu() {
calender.Expand_manu();
    }

    @Then("user should verify that “Save And Close”, “Save And New” and “Save” options are available")
    public void user_should_verify_that_save_and_close_save_and_new_and_save_options_are_available() {
        calender.verify_Save_And_Close_and_Save_New_andSave();


    }


}
