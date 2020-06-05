$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/selenium progs/PageObjectModelWithCucum/src/test/java/com/karanth/features/pomMagentoScenario.feature");
formatter.feature({
  "line": 1,
  "name": "magento test with page object model",
  "description": "",
  "id": "magento-test-with-page-object-model",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Magento login and logout",
  "description": "",
  "id": "magento-test-with-page-object-model;magento-login-and-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters url of magento",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicks on my account link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enters email and password and clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "clicks on logout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "POMMagentoSteps.user_opens_browser()"
});
formatter.result({
  "duration": 5460181934,
  "status": "passed"
});
formatter.match({
  "location": "POMMagentoSteps.user_enters_url_of_magento()"
});
formatter.result({
  "duration": 5495529975,
  "status": "passed"
});
formatter.match({
  "location": "POMMagentoSteps.clicks_on_my_account_link()"
});
formatter.result({
  "duration": 16032070202,
  "status": "passed"
});
formatter.match({
  "location": "POMMagentoSteps.enters_Credentials()"
});
formatter.result({
  "duration": 5110091723,
  "status": "passed"
});
formatter.match({
  "location": "POMMagentoSteps.clicks_on_logout()"
});
formatter.result({
  "duration": 3464549865,
  "status": "passed"
});
formatter.match({
  "location": "POMMagentoSteps.close_browser()"
});
formatter.result({
  "duration": 3773613617,
  "status": "passed"
});
});