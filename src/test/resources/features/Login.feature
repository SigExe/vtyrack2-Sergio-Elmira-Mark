@login
Feature: As a user I want to be able to login

  Background: Open Login page
    Given user is on the login page

  @storemanager
  Scenario: Login as a store manager
    When user logs in
    Then user should see dashboard page