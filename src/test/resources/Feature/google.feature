Feature: verify google search is working

Scenario: search in google
Given user is on google search page
When user enters the "Harry Potter"
And the user clicks on search buttton
Then user navigated to the result page

#"Harry Potter - Wikipedia" - word is present in that page