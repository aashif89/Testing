Feature: Check login functionality for all users

Scenario Outline: Adactin login
	Given User in adactin login page
	When User enter "<UserName>" and "<Password>" 
	And click on login button
	Then to display success message
Examples:
|UserName|Password|
|mdaaj2706|shahzu2706|
|ammuammu|123456|


