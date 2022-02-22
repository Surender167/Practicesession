$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Login Action",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test the login flow",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user navigates to dashboardpage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "567",
        "bc123"
      ]
    },
    {
      "cells": [
        "jaya",
        "aa123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test the login flow",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters \"567\" and \"bc123\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user navigates to dashboardpage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Test the login flow",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters \"jaya\" and \"aa123\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user navigates to dashboardpage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Succesful logout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user logout from appplication",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "message  displayed as succesfully logout",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});