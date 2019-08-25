Feature: Contact form

  Scenario: As a user, I want to fill contact form to reach support center on website https://www.phptravels.net/

    Given As not logged user
    And on website https://www.phptravels.net/
    When I click Contact
    And Fill form with all necessary data
    And Choose proper Captcha code
    And Click "Submit"
    Then  I receive confirmation to previously filled mail address that form has been sent
    And I see confirmation on site that mail has been sent

