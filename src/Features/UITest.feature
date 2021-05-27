#Author: Yogesh K.
Feature: Login feature 
	Description: Purpose of this feature is to verify Login functionality.

 @Smoke
Scenario: Login and Logout User 
	Given Chrome opened and hit URL 
	Then Close browser 
	
@E2E
Scenario Outline: Open multiple URLS 
	Given Chrome opened and hit URL "<URLs>" 
	Then Close browser 
	
	Examples: 
		| URLs |
		| https://www.google.com/ |
		| http://uitestingplayground.com/ |
		| https://www.seleniumeasy.com/test/javascript-alert-box-demo.html |

@Smoke	
Scenario: Login and Logout User 
	Given Chrome opened and hit URLs 
		| https://www.google.com/ |
		| http://uitestingplayground.com/ |
	Then Close browser 

@Sanity				
Scenario: Login and Logout User 
	Given Chrome opened and hit URL using map 
		| Name        | Pincode |
		| YK          | 123456  |
	Then Close browser

