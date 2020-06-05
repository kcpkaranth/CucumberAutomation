Feature: Magento test automation using datatable

Scenario: login to magento application
Given Chrome Browser is open
When user enters "https://www.magento.com"
Then Click on Myaccount link
And enter email and password
| kcpkaranth@gmail.com | welcome#123 |


Then click on login button
But wait for four seconds
And click on logout
Then click on register button
And enter firstname lastname and emailID
| Yashaswi | Prince | princeyash@gmail.com |

Then close the browser