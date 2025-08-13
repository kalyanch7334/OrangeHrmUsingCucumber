$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/pm.feature");
formatter.feature({
  "name": "PM Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Employee Details",
  "description": "",
  "keyword": "Scenario"
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
  "name": "User Clicks on PM link",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.user_Clicks_on_PM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Add Employee link",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.user_Clicks_on_Add_Employee_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Employee Details",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.user_enters_Employee_Details()"
});
formatter.result({
  "status": "passed"
});
});