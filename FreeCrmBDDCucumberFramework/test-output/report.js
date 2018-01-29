$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/bodduv/git/FreeCrmBDDCucumberFramework/FreeCrmBDDCucumberFramework/src/main/java/Features/contactDDT.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM create contacts",
  "description": "",
  "id": "free-crm-create-contacts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free crm create new contact",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-new-contact",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page partTHREE",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "check title of the page is free crm partTHREE",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on the login button partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "check user is on home page partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user moves to new contact page partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enter new contact details \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\" partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser partTHREE",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-new-contact;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 15,
      "id": "free-crm-create-contacts;free-crm-create-new-contact;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "Veera",
        "Boddu",
        "Automation Eng"
      ],
      "line": 16,
      "id": "free-crm-create-contacts;free-crm-create-new-contact;;2"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "Sunitha",
        "Boddu",
        "Manager"
      ],
      "line": 17,
      "id": "free-crm-create-contacts;free-crm-create-new-contact;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Free crm create new contact",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-new-contact;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page partTHREE",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "check title of the page is free crm partTHREE",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter \"naveenk\" and \"test@123\" partTHREE",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on the login button partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "check user is on home page partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user moves to new contact page partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enter new contact details \"Veera\" and \"Boddu\" and \"Automation Eng\" partTHREE",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser partTHREE",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactDDTStepDefinition.user_is_already_on_login_page_partTHREE()"
});
formatter.result({
  "duration": 4890592253,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.check_title_of_the_page_is_free_crm_partTHREE()"
});
formatter.result({
  "duration": 14067015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 7
    },
    {
      "val": "test@123",
      "offset": 21
    }
  ],
  "location": "ContactDDTStepDefinition.enter_and_partTHREE(String,String)"
});
formatter.result({
  "duration": 351373221,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.click_on_the_login_button_partTHREE()"
});
formatter.result({
  "duration": 1745098571,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.check_user_is_on_home_page_partTHREE()"
});
formatter.result({
  "duration": 8435939,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.user_moves_to_new_contact_page_partTHREE()"
});
formatter.result({
  "duration": 1265410225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Veera",
      "offset": 27
    },
    {
      "val": "Boddu",
      "offset": 39
    },
    {
      "val": "Automation Eng",
      "offset": 51
    }
  ],
  "location": "ContactDDTStepDefinition.enter_new_contact_details_and_and_partTHREE(String,String,String)"
});
formatter.result({
  "duration": 1644256496,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.close_the_browser_partTHREE()"
});
formatter.result({
  "duration": 27507,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Free crm create new contact",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-new-contact;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page partTHREE",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "check title of the page is free crm partTHREE",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter \"naveenk\" and \"test@123\" partTHREE",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on the login button partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "check user is on home page partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user moves to new contact page partTHREE",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enter new contact details \"Sunitha\" and \"Boddu\" and \"Manager\" partTHREE",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser partTHREE",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactDDTStepDefinition.user_is_already_on_login_page_partTHREE()"
});
formatter.result({
  "duration": 4169289863,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.check_title_of_the_page_is_free_crm_partTHREE()"
});
formatter.result({
  "duration": 12857541,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 7
    },
    {
      "val": "test@123",
      "offset": 21
    }
  ],
  "location": "ContactDDTStepDefinition.enter_and_partTHREE(String,String)"
});
formatter.result({
  "duration": 297664926,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.click_on_the_login_button_partTHREE()"
});
formatter.result({
  "duration": 1728122413,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.check_user_is_on_home_page_partTHREE()"
});
formatter.result({
  "duration": 6362672,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.user_moves_to_new_contact_page_partTHREE()"
});
formatter.result({
  "duration": 1199282033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunitha",
      "offset": 27
    },
    {
      "val": "Boddu",
      "offset": 41
    },
    {
      "val": "Manager",
      "offset": 53
    }
  ],
  "location": "ContactDDTStepDefinition.enter_new_contact_details_and_and_partTHREE(String,String,String)"
});
formatter.result({
  "duration": 1923411456,
  "status": "passed"
});
formatter.match({
  "location": "ContactDDTStepDefinition.close_the_browser_partTHREE()"
});
formatter.result({
  "duration": 34075,
  "status": "passed"
});
});