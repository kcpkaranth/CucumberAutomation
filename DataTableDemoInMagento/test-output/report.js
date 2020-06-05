$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/selenium progs/DataTableDemoInMagento/src/test/java/features/dataTableMagento.feature");
formatter.feature({
  "line": 1,
  "name": "Magento test automation using datatable",
  "description": "",
  "id": "magento-test-automation-using-datatable",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login to magento application",
  "description": "",
  "id": "magento-test-automation-using-datatable;login-to-magento-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Chrome Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"https://www.magento.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on Myaccount link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter email and password",
  "rows": [
    {
      "cells": [
        "kcpkaranth@gmail.com",
        "welcome#123"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "wait for four seconds",
  "keyword": "But "
});
formatter.step({
  "line": 12,
  "name": "click on logout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on register button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "enter firstname lastname and emailID",
  "rows": [
    {
      "cells": [
        "Yashaswi",
        "Prince",
        "princeyash@gmail.com"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableMagentoSteps.chrome_Browser_is_open()"
});
formatter.result({
  "duration": 11600852411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.magento.com",
      "offset": 13
    }
  ],
  "location": "DataTableMagentoSteps.user_enters_url(String)"
});
formatter.result({
  "duration": 6489594430,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMagentoSteps.click_on_Myaccount_link()"
});
formatter.result({
  "duration": 2795751990,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMagentoSteps.enter_email_and_password(DataTable)"
});
formatter.result({
  "duration": 3498849407,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMagentoSteps.click_on_login_button()"
});
formatter.result({
  "duration": 4780308121,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMagentoSteps.wait_for_four_seconds()"
});
formatter.result({
  "duration": 4000117220,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMagentoSteps.click_on_logout()"
});
formatter.result({
  "duration": 7592489277,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMagentoSteps.click_on_register_button()"
});
formatter.result({
  "duration": 1716873197,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMagentoSteps.enter_required_details(DataTable)"
});
formatter.result({
  "duration": 1623996067,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMagentoSteps.close_the_browser()"
});
formatter.result({
  "duration": 4428906883,
  "status": "passed"
});
});