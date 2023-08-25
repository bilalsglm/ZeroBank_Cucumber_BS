@smoke @regrassion
Feature: Login Tests

  Background:
    Given The user is on the zero bank entrance page
    When The user clicks on sign in button

  @positiveLogin
  Scenario: Positive Login Test
    And The user logins with credentials "username" and "password"
    And The user navigates back
    Then The user should be able to see own name: "username" on the home page

  @negativeLogin
  Scenario Outline: Nagative Login Test (Invalid data)
    When The user logins with credentials "<username>" and "<password>"
    Then The warning "<messege>" should be appear
    Examples:
      | username      | password      | messege                          |
      | username      | wrongpassword | Login and/or password are wrong. |
      | wrongusername | password      | Login and/or password are wrong. |
      | username      |               | Login and/or password are wrong. |
      |               | password      | Login and/or password are wrong. |
      |               |               | Login and/or password are wrong. |
      | wrongusername |               | Login and/or password are wrong. |
      |               | wrongpassword | Login and/or password are wrong. |
