@Regression
Feature:registration feature for AutomationPractice site
  As an User
  I want to see RegistrationPage

##happy path scenario
#   @EnterValidEmail
#   Scenario: verify that can navigate to RegistrationPage
#   Given User on home Page
#   When user Clicks SignIn button
#   And User enters email as "testemail123@gmail.com"
#   And Clicks Create An Account button
#   Then user should be on Registration Page

#Unhappy path scenario
   @EnterInvalidEmail
  Scenario:Verify Email validation Feedback message
    Given User on home Page
    When user Clicks SignIn button
    And User enters email as "test.com"
    And Clicks Create An Account button
    Then user should see feedback message as "Invalid email address."
    When User clicks Create An Account buttton again


     Then user should see another feedback message as "Please enter your email address to create an account."



