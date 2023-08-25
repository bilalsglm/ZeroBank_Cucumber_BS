@regression @smoke
Feature: Account Summary Checks

  Background:
    Given The user is on the zero bank entrance page
    When The user clicks on sign in button
    And The user logins with credentials "username" and "password"
    And The user navigates back

  @accountSummray
  Scenario:Account Test-1
    When The user navigates to "Online Banking" tab manu
    When The user navigates to "Account Summary" section
    When The user should be able to see page title:"Zero - Account Summary"


  Scenario:Account Test-2
    When The user navigates to "Online Banking" tab manu
    When The user navigates to "Account Summary" section
    Then The user should be able to see following types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

    And The user should be able to see following credit account columns
      | Account     |
      | Credit Card |
      | Balance     |