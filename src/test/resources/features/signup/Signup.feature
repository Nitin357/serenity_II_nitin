Feature: Signup page Functionalities


  Scenario: Test Complete Account Singup form
    Given User is On Account Signup page
    When fill all details
    And clicks the Captcha checkbox
    And Click Submit button
    Then Form Submit Success Notification Displayed

  Scenario: Test Mandatory field error message
    Given User is On Account Signup page
    When  Click Submit button
    Then Mandatory field error Message Displayed

  Scenario: Test Invalid Client Code
    Given User is On Account Signup page
    When  Enter Invalid Client code
    And Click Submit button
    Then Invalid Client Message Display
