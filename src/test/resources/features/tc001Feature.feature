Feature: Login Verification

  Scenario: Verify login with valid credentials
    Given I open the web application
    When I enter valid credentials
    Then the user should be authenticated successfully