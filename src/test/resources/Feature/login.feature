Feature: Login Action

Scenario Outline: Test the login flow
Given the user is on the login page
When user enters "<username>" and "<password>"
And the user clicks on login button
Then user navigates to dashboardpage


Examples: 
|username | password|
| 567 | bc123 |
| jaya| aa123 |


Scenario: Succesful logout
When user logout from appplication
Then message  displayed as succesfully logout
