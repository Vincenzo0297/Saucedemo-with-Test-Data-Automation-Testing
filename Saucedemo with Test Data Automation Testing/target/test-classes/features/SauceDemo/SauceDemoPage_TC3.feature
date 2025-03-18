Feature: Saucedemo_TC3

  @saucedemo_TC3
  Scenario Outline: saucedemo_TC3
    Given User is at the saucedemo page
    And User enter username '<UserName>'
    And User enter password '<Password>'
    And User click on the login button
    And User select their option '<Options>'
    And User click on the cart button
    And User click on the cart icon to proceed
    And User click on checkout button
    Then User enter information details:
      | TC-3-FirstName    |
      | TC-3-LastName     |
      | TC-3-ZipCode      |
    And User click on the continue button
    And User click on the finish button
    And User click on the back home button
    And User click on the menu icon
    And User click on the logout button

    Examples:
      | UserName      | Password      | Options        |
      | TC-3-UserName | TC-3-Password |  TC-3-Options  |