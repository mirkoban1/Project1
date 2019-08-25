Feature: mouse change
  Scenario: mouse pointer changes
    Given user not loged in, present on website
    When user moves mouse pointer on a functionality or link
    Then the mouse pointer changes color
