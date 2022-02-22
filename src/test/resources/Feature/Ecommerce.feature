Feature: searching on flipkart

Background: Login scenario
Given user is on home page
When user enters username and password
And user clicks on login
Then user should see the home page


Scenario: search a book on flipkart
Given the user is on search bar
And user login by entering username and password
When the user enters the bookname
Then the user sees the details of the book

Scenario: To purchase a book on flipkart
Given the user has the book in the cart
And user login by entering username and password
When the user clicks on buy now
Then user should see the payment page


