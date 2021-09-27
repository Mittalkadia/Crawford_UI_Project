$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/openbrowser.feature");
formatter.feature({
  "line": 3,
  "name": "Browser open",
  "description": "",
  "id": "browser-open",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OpenBrowser"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "User successfully open browser",
  "description": "",
  "id": "browser-open;user-successfully-open-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User able to see browser open",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be successfully open browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.userOnHomepage()"
});
formatter.result({
  "duration": 7282298600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_able_to_see_browser_open()"
});
formatter.result({
  "duration": 111100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_be_successfully_open_browser()"
});
formatter.result({
  "duration": 820072100,
  "status": "passed"
});
});