@smoke
Feature: Search Book
  @wip
  Scenario: Verify searched book is in the list
    Given the Student is on the login page
    When the student enters credentials
    And the student clicks sign in
    When the student enters book name "rtbw" into search box
    Then the student should see the book "rtbw" in the list

  Scenario: Verify searched book is in the list
    Given the Student is on the login page
    When the student enters credentials
    And the student clicks sign in
    When the student enters book name "Little Lamp" into search box
    Then the student should see the book "Little Lamp" in the list