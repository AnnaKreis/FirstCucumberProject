Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens iLcarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message is displayed

  @wrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches Chrome browser
    When User opens iLcarro HomePage
    And User clicks on Login link
    And User enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verify Error message is displayed
    And User quites browser
    Examples:
      | email                 | password |
      | jayeto8872@deusa7.com | Aa12345  |
      | jayeto8872@deusa7.com | a!12345  |
      | jayeto8872@deusa7.com | Лл!12345 |