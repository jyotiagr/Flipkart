Feature: To place the order using payment gateway Functionality

  Background: User enters URL on the browsers
    Given User clicked on login icon
    When enter "Jyotipassion14@gmail.com"
    And enter "Mughalsarai"
    And click on login button
    And enter "8218092472" in mobile number
    And enter "Mughalsarai" in password
    And click on continue button
    Then verify my Account is displaying
    When user clicks on Home & Furniture
    And user clicks on Bedsheets
    And user clicks on one bedsheet
    And user clicks on Add to cart button
    Then item must be added into the cart
    
    Scenario: To place the order using payment gateway Functionality
    When user go to cart
    And click on Place order button
    And click on the checkbox
    And click on Deliver here button
    And click on Continue button
    And select the checkbox cash on delivery
    And enter the characters
    And click on confirm order
    Then order has been placed