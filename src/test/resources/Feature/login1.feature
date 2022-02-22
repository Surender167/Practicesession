#Testing login feature
#raw()- used to get value from data table
#isLists()-used to get value from data table
Feature: Login Action

Scenario: Succesful login with valid credentials
Given the user is on homepage
When user navigate to login page
And user enters credentials
|username| password |
|viji|abc123|
|chandana|1234bcd|
Then message displayed login successfully

