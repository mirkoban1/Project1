Feature: Currency.change

  Scenario:   As not logged user I want to change currency on website https://www.phptravels.net/
    Given As a not logged user
    And on a website https://www.phptravels.net/
    When Click on currency button
    And I see currency list
    Then I can change currency by clicking on it




