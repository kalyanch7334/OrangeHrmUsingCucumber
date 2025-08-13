Feature: PM Details

  Scenario: Add Employee Details
    Given User Launch Chrome browser
    When User Opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And User enters Email as "Admin" and Password as "admin123"
    And Click on Login
    Then Page Title should be "OrangeHRM"
    And User Clicks on PM link
    And User Clicks on Add Employee link
    And User enters Employee Details
  #  When User Clicks on Save button
  #  Then User should see "Successfully Saved" Employee
  #  And close browser
