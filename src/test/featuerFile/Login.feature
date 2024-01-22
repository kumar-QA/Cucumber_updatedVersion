
Feature: verifying complete loginFunctionality
 
 Scenario: verify loginfunction with valid credentials
    Given openBrowser and Enter Url 
    When user entered valid username 
    And User Enter valid Passsword
    When user clicked on loginBtn
    Then It should naviagte to Dashboard page
 
  Scenario: verify loginfunction with invalid credentials
  Given openbrowser and enterUrl
  When user entered invalid username
  And User Enterd invalid password
  When user clicked on log button
  Then it should throw error as "username and password is invalid"
 
    
      Scenario: verify loginfunction with valid username and invalid password
   Given openbrowser and enterUrl
  When user entered valid username
  And User Enterd invalid password
  When user clicked on log button
  Then it should throw error as "password  is invalid"
 
    
      Scenario: verify loginfunction with invalid username and valid password
    Given openbrowser and enterUrl
  When user entered invalid username
  And User Enterd valid password
  When user clicked on log button
  Then it should throw error as "username  is invalid"
    
      Scenario: verify loginfunction with Empty credentials
    Given openbrowser and enterUrl
  When user keep empty fields for user and password
  When user clicked on log button
  Then it should throw error as "Username and password is required"
 
