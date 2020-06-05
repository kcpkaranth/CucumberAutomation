$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/selenium progs/FbloginCucum/src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "about fb login",
  "description": "",
  "id": "about-fb-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Fb login test scenario",
  "description": "",
  "id": "about-fb-login;fb-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is already on login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter email id and enter password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestMethods.open_Browser()"
});
formatter.result({
  "duration": 10992815509,
  "status": "passed"
});
formatter.match({
  "location": "TestMethods.navigate_to_login()"
});
formatter.result({
  "duration": 19424495330,
  "status": "passed"
});
formatter.match({
  "location": "TestMethods.enter_credentials()"
});
formatter.result({
  "duration": 4500014586,
  "status": "passed"
});
formatter.match({
  "location": "TestMethods.login_click()"
});
formatter.result({
  "duration": 5199113553,
  "status": "passed"
});
formatter.match({
  "location": "TestMethods.close_browser()"
});
formatter.result({
  "duration": 776760065,
  "status": "passed"
});
});