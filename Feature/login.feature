Feature: Login With OrangeHrm

  Scenario: Successful Login with OrangeHrmDemo
    Given User Launch Chrome browser
    When User Opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And  User enters Email as "Admin" and Password as "admin123"
    And Click on Login
    Then Page Title should be "OrangeHRM"
    When click on profile link
    When User click on Log out link
    Then Page Title should be "OrangeHRM"
   # And close browser





