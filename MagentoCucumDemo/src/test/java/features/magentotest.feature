Feature: Magento test automation

Scenario Outline: login to magento
Given Chrome Browser is open
When user enters "https://www.magento.com"
Then Click on Myaccount link
And enter "<mail>" and "<pwd>"
Then click on login button
But wait for four seconds
And click on logout

Examples:
	| mail | pwd |
	| kcpkaranth@gmail.com | welcome#2 |
	| priyankavijaykumar555@gmail.com | Welcome2 |
	|nithya.27.v@gmail.com | Welcome@1 |


#Scenario: register to magento
#When user is in login page
#Then click on register button
#And enter all required details
#Then close the browser
