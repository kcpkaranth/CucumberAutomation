$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/selenium progs/MapsDemoForMagento/src/test/java/features/mapsForMagento.feature");
formatter.feature({
  "line": 1,
  "name": "Magento test automation using datatable",
  "description": "",
  "id": "magento-test-automation-using-datatable",
  "keyword": "Feature"
});
formatter.before({
  "duration": 363544,
  "status": "passed"
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
  "name": "enter email and password click on login and logout",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "kcpkaranth@gmail.com",
        "welcome#123"
      ],
      "line": 9
    },
    {
      "cells": [
        "priyankavijaykumar555@gmail.com",
        "Welcome123"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on register button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "enter firstname lastname and emailID",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "emailID"
      ],
      "line": 14
    },
    {
      "cells": [
        "Yashaswi",
        "Prince",
        "princeyash@gmail.com"
      ],
      "line": 15
    },
    {
      "cells": [
        "Jatayu",
        "Bird",
        "ramahelper@gmail.com"
      ],
      "line": 16
    },
    {
      "cells": [
        "Hanumantha",
        "anjani putra",
        "ramabhakta@gmail.com"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MapsStepDefinitionsForMagento.chrome_Browser_is_open()"
});
formatter.result({
  "duration": 9314180378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.magento.com",
      "offset": 13
    }
  ],
  "location": "MapsStepDefinitionsForMagento.user_enters_url(String)"
});
formatter.result({
  "duration": 8205854518,
  "status": "passed"
});
formatter.match({
  "location": "MapsStepDefinitionsForMagento.click_on_Myaccount_link()"
});
formatter.result({
  "duration": 4044033124,
  "status": "passed"
});
formatter.match({
  "location": "MapsStepDefinitionsForMagento.enter_email_and_password(DataTable)"
});
formatter.result({
  "duration": 28462485820,
  "status": "passed"
});
formatter.match({
  "location": "MapsStepDefinitionsForMagento.click_on_register_button()"
});
formatter.result({
  "duration": 2327245276,
  "status": "passed"
});
formatter.match({
  "location": "MapsStepDefinitionsForMagento.enter_required_details(DataTable)"
});
formatter.result({
  "duration": 21708761790,
  "status": "passed"
});
formatter.match({
  "location": "MapsStepDefinitionsForMagento.close_the_browser()"
});
formatter.result({
  "duration": 3800846468,
  "status": "passed"
});
formatter.after({
  "duration": 133966,
  "status": "passed"
});
});