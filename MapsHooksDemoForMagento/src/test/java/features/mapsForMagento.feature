Feature: Magento test automation using datatable

Scenario: login to magento application
Given Chrome Browser is open
When user enters "https://www.magento.com"
Then Click on Myaccount link
And enter email and password click on login and logout
| email | password |
| kcpkaranth@gmail.com | welcome#123 |
| priyankavijaykumar555@gmail.com | Welcome123 |

Then click on register button
And enter firstname lastname and emailID
| firstname | lastname | emailID |
| Yashaswi | Prince | princeyash@gmail.com |
| Jatayu | Bird | ramahelper@gmail.com |
| Hanumantha | anjani putra | ramabhakta@gmail.com |

Then close the browser