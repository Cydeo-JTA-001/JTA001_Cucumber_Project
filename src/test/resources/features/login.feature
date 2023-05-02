Feature: Library login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin
# this is how we comment in feature file


@wip
  Scenario: Login as librarian
    Given user is on the login page of the library application
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard



@wip
  Scenario: Login as student
    Given user is on the login page of the library application
    When user enters student username
    And user enters student password
    Then user should see the dashboard


  Scenario: Login as admin
    Given user is on the login page of the library application
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard