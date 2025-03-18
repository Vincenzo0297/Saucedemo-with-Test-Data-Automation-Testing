Feature: Saucedemo_TC2

  @saucedemo_TC2
  Scenario Outline: saucedemo_TC2
    Given User is at the saucedemo page
    And User enter username '<UserName>'
    And User enter password '<Password>'
    And User click on the login button
    And User select their option '<Options>'
    And User click on the cart button
    And User click on the cart icon to proceed
    And User click on checkout button
    Then User enter information details:
      | TC-2-FirstName    |
      | TC-2-LastName     |
      | TC-2-ZipCode      |
    And User click on the continue button
    And User click on the finish button
    And User click on the back home button
    And User click on the menu icon
    And User click on the logout button

    Examples:
      | UserName      | Password      | Options        |
      | TC-2-UserName | TC-2-Password |  TC-2-Options  |