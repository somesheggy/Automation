Feature: Simple Scenario

  Scenario: Dvla plate number
    Given I search dvla page
    When I find a plate number
    Then Validate the car detail