Feature: Verify access to Google Sheet

  Scenario: Open Google Sheet with a valid URL
    Given I navigate to the Google Sheet URL
    Then the Google Sheet should load correctly without errors