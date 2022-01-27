Feature: To test Login Functionality

  Background: Opening Homepage
    Given User enters URL on the browsers

  Scenario: To test the login
    Given User clicked on login icon
    When enter "jyotipassion14@gmail.com"
    And click on continue button
    Then user is on the dashboard