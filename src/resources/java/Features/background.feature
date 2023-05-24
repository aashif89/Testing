Feature: Login functionality

Background:

Given User is on login page

Scenario: Successful login
When user enter valid credentials and should click login button
Then redirected to homepage
And Validate welcome message

Scenario: Invalid login
When user should enter invalid credentials and click login button
Then Used should see error message