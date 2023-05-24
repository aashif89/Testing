Feature: Login and logout validation



@login @smoke @regression
Scenario: Login should be performed on Adactin page
 		Given Go to the URL
 		When type the username and password to perform login
 		Then Check for homepage
 		
@logout @smoke @regression
Scenario: Logout should be performed on Adactin page

		Given Verify Homepage
		When Click on Logout button
		Then Check for loginpage screen