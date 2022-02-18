Feature: ERP Login Module
  
  @TestCase1
  Scenario: Verify admin user can able to login with valid credentials
    Given Open Browser and Launch the Application
    When  Enter valid credentials and click on Login
    Then  ERP Home page should display
   
