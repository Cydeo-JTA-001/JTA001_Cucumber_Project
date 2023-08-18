Feature: Search Book

  Scenario: Searching a book
    Given the user is on the login page
    When the user enters valid credentials
    And the user clicks sign in button
    When the user searches Hello Python book
    Then the user should see the result
  @wip
  Scenario: Searching a book dynamically
    Given the user is on the login page
    When the user enters valid credentials
    And the user clicks sign in button
    When the user searches "Hello Python" book
    Then the user should see the result