Feature: Free CRM Login features

#Gherkin keyword 
#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM

# Then user enters naveenk and Test@123
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser

# Data Driven framework with Examples keyword and out-with out example keyword.
# and Data drivern framework with Table
Examples:
	| username | password |
	| naveenk  | test@123 |
	|  tom     | test456  | 	
		
	 		