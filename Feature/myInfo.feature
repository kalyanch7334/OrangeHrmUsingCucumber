Feature:  MyInfo Details

  @RegressionTest
 Scenario: Add MyInfo Details
   Given User Launch Chrome browser
   When User Opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
   And  User enters Email as "Admin" and Password as "admin123"
   And Click on Login
   Then Page Title should be "OrangeHRM"
   And User Clicks on my Info
   And User Clicks on Personal Details link
   And User enters Personal Details
  # When User Clicks on Save
   #Then User should see "Sucessfully Updated"
  # And close browser