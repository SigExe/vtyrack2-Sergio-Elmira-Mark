Feature: As a user I want to be able to create calendar events


  @smoke
  Scenario: Create calendar event with the default time
    Given user is on the login page
    And user logs in as a store manager
    And the user navigates to "Activities" and "Calendar Event"
   And user clicks on create calendar event button
    When user adds new calendar event information