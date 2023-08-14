Feature: Google Search functionality
  User Story: As a user I should be able to search using search window
  @jack
  Scenario: Testing Search Function selenium
    Given the user is in the google search page
    When the user types selenium into the search box
    Then the user should be able to get results

  Scenario: Testing Search Function maven
    Given the user is in the google search page
    When the user types maven into the search box
    Then the user should be able to get results
    Then one more step

