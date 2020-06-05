Feature: magento test with page object model

Scenario: Magento login and logout
Given User opens browser
When user enters url of magento
And clicks on my account link
Then enters email and password and clicks on login button
And clicks on logout
And close browser