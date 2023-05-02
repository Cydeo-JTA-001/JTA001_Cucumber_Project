Feature: Google Search Functionality

  user will do some search
  and test the title

  Scenario: User Go to Google and Search Wooden Spoon

    Given user is on Google Page
    When user types Wooden Spoon on SearchBox
    And the User hits enter
    Then user see the results



