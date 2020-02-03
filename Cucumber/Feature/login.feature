Feature: Facebook Login Module

Background: 
Given user initializes the browser
When user launches the application

Scenario Outline: Login Functionality
When user enters the "<UserName>" and "<Password>"
When user clicks on the login button

Examples:
|UserName|Password|
|harini@gmail.com|1234356|
|jhh@gmail.com|sadfgh|
 

Scenario: Registration Functionality
When user enters the firstname and surname
When user enters mobile number or email address
When user enters the new password
When user enters the birthday date
When user enters the gender details
Then user clicks the signup button


@Third
Scenario: Wrong Password
When user enters the email address
When user enters the wrong password
When user clicks enter button
Then error message is thrown by the browser
