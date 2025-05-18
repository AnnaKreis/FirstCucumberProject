Feature: AddCar

  @validAddCar
  Scenario: User adds a new car
    Given User launches Chrome browser
    When User opens iLcarro HomePage
    And User clicks on LetCarWork link
    And User selects location
    And User fills car details
    And User submits the form
    Then User verifies success message is displayed