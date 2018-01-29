Feature: Free CRM create contacts

Scenario Outline: Free crm create new contact
Given user is already on login page partTHREE
When check title of the page is free crm partTHREE
Then enter "<username>" and "<password>" partTHREE
Then click on the login button partTHREE
Then check user is on home page partTHREE
Then user moves to new contact page partTHREE
Then enter new contact details "<firstname>" and "<lastname>" and "<position>" partTHREE
Then Close the browser partTHREE

Examples:

	|username | password|firstname |lastname |position|
|naveenk|test@123|Veera |Boddu |Automation Eng |
|naveenk|test@123|Sunitha |Boddu |Manager |