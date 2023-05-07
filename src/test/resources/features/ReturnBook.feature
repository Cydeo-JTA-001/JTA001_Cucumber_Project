Feature: Student can return a book

  @wip
  Scenario: Student can return a barrowed book
    Given the user is on the login page
    When the user enters valid credentials
    And the user clicks sign in
    And the user clicks first borrow book button
    And the user clicks Borrowing Books
    And the user clicks Return Book
    Then the user see the confirmation message
