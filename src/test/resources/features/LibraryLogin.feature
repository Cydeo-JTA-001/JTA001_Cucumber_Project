@wip
Feature: The user can login

#  we have 2 types of users
#  student
#  librarian

  Background: go to URL
    Given the user is on the login page


  Scenario: Student can login with valid credentials
#    Given the user is on the login page    // this step is executed under background now
    When the user enters valid credentials
    And the user clicks sign in
    Then the student lands on home page


  Scenario: Librarian can login with valid credentials
#    Given the user is on the login page   // this step is executed under background now
    When the librarian enters valid credentials
    And the user clicks sign in
    Then the librarian lands on home page



#  Scenario: librarian can login with valid credentials