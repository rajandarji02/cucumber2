Feature: Login
  Background:
    Given User on a login page

    @Reg
    Scenario: Positive Log in functionality
      When User enter valid username
      And User enter valid password
      And User click on log in button
      Then User should login
      And User should see welcome message

    @Smoke
    Scenario Outline: Negative login scenario
      As a user i should not login with invalid username or password
      When User enter "<UserName>" and "<Password>"
      And User click log in button
      Then User should see outcome

      Examples:
      |UserName               |Password|
      |rajanndarji@yahoo.com  |@12.:/  |
      |raj@darji.com          |123456  |
