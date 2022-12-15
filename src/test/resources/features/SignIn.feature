Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @Test1 #passed
  Scenario: Verify user can sign in into Retail Application

    And User enter email 'King123@gmail.com' and password 'Virginia@32'
    And User click on login button
    Then User should be logged in into Account

  @Test2 #passed
  Scenario: verify user can create an account in retail website
    And User click  on Create New Account button
    And User fill the Sign up information with bellow data
      | name  | email                    | password  |  | confirmpassword |
      | amiro | jimiking@gmail.com | Afg@12345 |  | Afg@12345       |
    And User click on sign up button
    Then The User should be logged in into Account
