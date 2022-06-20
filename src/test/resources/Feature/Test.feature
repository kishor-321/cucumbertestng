@Regression
Feature: Testing the transfer scenarious

  @smoke
  Scenario: I am from scenariou A
    Given User is on the CRM website
    When User clicks on Login button in the pre login page
    Then Login page is displayed
    And Enter the email and password and click on submit
    Then Dashboard page is displayed
    
  @smoke
  Scenario: I am from scenariou B
    Given User is on the CRM website
    When User clicks on Login button in the pre login page
    Then Login page is displayed
    And Enter the email and password and click on submit
    Then Dashboard page is displayed
    
  Scenario: I am from scenariou C
    Given User is on the CRM website
    When User clicks on Login button in the pre login page
    Then Login page is displayed
    And Enter the email and password and click on submit
    Then Dashboard page is displayed        