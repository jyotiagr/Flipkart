Feature: To test Login Functionality

  Background: Opening Homepage
    Given User enters URL on the browsers


#
  #Scenario: to test the sign up
    #Given User redirects to the sign up page if user is not registered on the website
    #When select "Gender"
    #And Enter "first name"
    #And Enter "last name"
    #And Enter "Mobile no."
    #And Enter "Create Password"
    #And Enter checkbox
    #And Enter checkbox
    #And click on Send OTP button
    #Then User is on the dashboard
#
  Scenario: To test the login
    Given User clicked on login icon
    When enter "jyotipassion14@gmail.com"
    And click on continue button
    Then user is on the dashboard
#
  #Scenario: To test the saved icon
    #Given User is on Dashboard
    #When User clicked on saved icon
    #Then user can be able to see the saved item
#
  #Scenario: To test the cart icon
    #Given User is on Dashboard
    #When User clicked on cart icon
    #Then Cart must open and user will be able to see the product he/she wish to buy
#
  #Scenario: To test the Beauty section
    #Given User is on Dashboard
    #When User clicked on Beauty
    #And user clicked on body spray
    #And user clicked on dropdown product type
    #And user selects on the body spray
    #And user clicked on the price
    #And user selects the price in between 500rs-999rs
    #And user clicked on the dropdown sort by
    #And user selects New Arrival
    #And click on the burgundy body spray 150 ml
    #And click on the Add to bag button
    #And click on the view bag and checkout button
    #Then the item found in the bag
