Feature: Simple Scenario

  @web
  Scenario: Dvla plate number
    Given I search dvla page for registration "LX10OLK"
    When I find a plate number
    Then Validate the car detail