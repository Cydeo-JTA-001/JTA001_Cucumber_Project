Feature: Student can borrow a book

  @wip
  Scenario: Student can borrow the first available book
    Given the user is on the login page
    When the user enters valid credentials
    And the user clicks sign in button
    And the user clicks first borrow book button
    Then the user see the confirmation message