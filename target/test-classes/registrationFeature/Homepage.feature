Feature: To test Login Functionality

  Background: Opening Homepage
    Given User enters URL on the browsers

  Scenario: To test the login
    Given User clicked on login icon
    When enter "Mughalsarai"
    And click on login button
    And enter "8218092472" in mobile number
    And click on continue button
    And enter "Mughalsarai" in password
    And click on login button
    Then verify my Account is displaying
    
    
    
     
     
     
     