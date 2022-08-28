

Feature: Demo Smoke test execution
    
    
@SmokeTestSuite1
    Scenario Outline: User login and checking out a product  
    
    Given User clicks on SignIn on Amazon Relay
    When User logs in using valid username and password
    Then login should be successfull
    And User clicks on Load Board link
    And User clicks on Search link
    And User enters WorkType filter value
    And User enters origin city "<Origin City>"
    And User enters radius
    And User clicks on refresh
    
    
    Examples:
    
    |Origin City|
    |CHICAGO, IL|
    
    
    
    
    
    
  