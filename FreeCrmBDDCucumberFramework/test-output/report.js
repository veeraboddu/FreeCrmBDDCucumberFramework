$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Gene_Regulatary_Backup/Java GPRSTest/workspace/FreeCrmBDDCucumberFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login features",
  "description": "",
  "id": "free-crm-login-features",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Gherkin keyword"
    },
    {
      "line": 4,
      "value": "#with Examples Keyword"
    }
  ],
  "line": 5,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-features;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "free-crm-login-features;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "free-crm-login-features;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 17,
      "id": "free-crm-login-features;free-crm-login-test-scenario;;2"
    },
    {
      "cells": [
        "tom",
        "test456"
      ],
      "line": 18,
      "id": "free-crm-login-features;free-crm-login-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-features;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 8000858866,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 18585917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "test@123",
      "offset": 27
    }
  ],
  "location": "LoginStepDefinitions.user_enters_and(String,String)"
});
formatter.result({
  "duration": 432535269,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 2313545332,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 35195456,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.close_the_browser()"
});
formatter.result({
  "duration": 56656,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-features;free-crm-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"tom\" and \"test456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 5147943832,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 29759801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tom",
      "offset": 13
    },
    {
      "val": "test456",
      "offset": 23
    }
  ],
  "location": "LoginStepDefinitions.user_enters_and(String,String)"
});
formatter.result({
  "duration": 797564547,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1913597718,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 22176159,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.close_the_browser()"
});
formatter.result({
  "duration": 61582,
  "status": "passed"
});
});