Feature: Facebook Login

  Scenario: Login verification
    Given User is on the login page
    When User enters an invalid username as "a@a.com"
    And User enters an invalid password as "123123123"
    And User clicks on the login button
    Then User sees an error message as "The password you’ve entered is incorrect"
