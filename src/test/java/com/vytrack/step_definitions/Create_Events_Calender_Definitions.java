package com.vytrack.step_definitions;

import com.vytrack.pages.Create_Calender_Pages;
import io.cucumber.java.en.Given;
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



}
