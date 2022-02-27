Feature: To test the item added to the cart Functionality

  Background: User enters URL on the browsers
    Given User clicked on login icon
    When enter "Jyotipassion14@gmail.com"
    And enter "Mughalsarai"
    And click on login button
    And enter "8218092472" in mobile number
    And enter "Mughalsarai" in password
    And click on continue button
    Then verify my Account is displaying

  Scenario: To add the item
    When user clicks on Home & Furniture
    And user clicks on Bedsheets
    And user clicks on one bedsheet
    And user clicks on Add to cart button
    Then item must be added into the cart
    
