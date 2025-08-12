$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/D:/pra/OrangeHrmDemo/Feature/login.feature");
formatter.feature({
  "name": "Login With OrangeHrm",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with OrangeHrmDemo",
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
  "name": "click on profile link",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.click_on_profile_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClickOnLogOutLink()"
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
});