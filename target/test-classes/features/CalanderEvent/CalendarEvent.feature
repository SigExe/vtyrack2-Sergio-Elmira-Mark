Feature: As a user I want to be able to create calendar events


  @smoke
  Scenario: Create calendar event with the default time
    Given user is on the login page
    And user logs in
    And the user navigates to "Activities" and "Calendar Event"
    And user clicks on create calendar event button
    When user adds new calendar event information
      | Title       | Hello group14               |
      | Description | This is for testing purpose |

  @testcase1
  Scenario: Verify view,edit and delete options are displayed
    Given user is on the login page
    And user logs in
    And the user navigates to "Activities" and "Calendar Event"
    When user clicks on "actions"
    Then user should verify that view, edit and delete are displayed

  @testcase3
  Scenario: Verify that “Save And Close”, “Save And New” and “Save” options are available
    Given user is on the login page
    And user logs in
    And the user navigates to "Activities" and "Calendar Event"
    And user clicks on create calendar event button
    When user  expand “Save And Close” menu
    Then user should verify that “Save And Close”, “Save And New” and “Save” options are available



