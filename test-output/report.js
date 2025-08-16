$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/myInfo.feature");
formatter.feature({
  "name": "MyInfo Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add MyInfo Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userLaunchChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userOpensURL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"Admin\" and Password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userEntersEmailAsAndPasswordAs(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.clickOnLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.pageTitleShouldBe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on my Info",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.user_Clicks_on_my_Info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Personal Details link",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.user_Clicks_on_Personal_Details_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Personal Details",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.user_enters_Personal_Details()"
});
formatter.result({
  "status": "passed"
});
});