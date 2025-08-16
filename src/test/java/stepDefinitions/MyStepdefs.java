package stepDefinitions;


import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import pageObjects.PMPage;
import pageObjects.myInfoPage;

import java.security.Provider;
import java.util.logging.Logger;

public class MyStepdefs extends Base{


    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        logger= Logger.getLogger("OrangeHRM");
        logger.info("Chrome browser launched successfully");
    }

    @When("User Opens URL {string}")
    public void userOpensURL(String url) {

        logger.info("Opening URL: " + url);
        driver.get(url);
    }

    @And("User enters Email as {string} and Password as {string}")
    public void userEntersEmailAsAndPasswordAs(String uname, String password) {
        logger.info("Entering username: " + uname + " and password: " + password);
        loginPage.setUserName(uname);
        loginPage.setPassword(password);
    }

    @And("Click on Login")
    public void clickOnLogin()
    {
        logger.info("Clicking on login button");
        loginPage.setLogin();
    }

    @Then("Page Title should be {string}")
    public void pageTitleShouldBe(String title) {
        logger.info("Verifying page title: " + title);

        Assert.assertEquals(title, driver.getTitle());
    }

    @When("click on profile link")
    public void click_on_profile_link() throws InterruptedException {

        logger.info("Clicking on profile link");
        loginPage.setProfileLink();
        Thread.sleep(5000);


    }


    @When("User click on Log out link")
    public void userClickOnLogOutLink() {
        logger.info("Clicking on logout link");
        loginPage.setLogout();

    }

    @And("close browser")
    public void closeBrowser() {
        logger.info("Closing the browser");
        driver.close();
    }

//Update Personal Details in My Info Module

    @Then("User Clicks on my Info")
    public void user_Clicks_on_my_Info() {
        logger.info("Clicking on My Info link");

        infoPage = new myInfoPage(driver);
        infoPage.clickMyInfo();
    }

    @Then("User Clicks on Personal Details link")
    public void user_Clicks_on_Personal_Details_link()
    {
        logger.info("Clicking on Personal Details link");
        infoPage.setPersonalDetails();

    }


    @And("User enters Personal Details")
    public void user_enters_Personal_Details() {
        logger.info("Entering personal details");
        infoPage.setFirstName("Rajuty");
        infoPage.setMiddleName("kumar");
        infoPage.setLastName("k");

    }

    @When("User Clicks on Save")
    public void user_Clicks_on_Save() {
         logger.info("Clicking on Save button");
        infoPage.clickSaveButton();
    }

    @Then("User should see {string}")
    public void user_should_see(String message)
    {
        logger.info("Verifying message: " + message);
        Assert.assertEquals(message, driver.getTitle());
        System.out.println("User is able to see the message: " + message);
    }

    //Add Employee In PM Module
    @Then("User Clicks on PM link")
    public void user_Clicks_on_PM_link() throws InterruptedException {
        logger.info("Clicking on PM link");
        pmPage=new PMPage(driver);
        pmPage.setclickPM();
        Thread.sleep(5000);
    }

    @Then("User Clicks on Add Employee link")
    public void user_Clicks_on_Add_Employee_link()
    {
        logger.info("Clicking on Add Employee link");
        pmPage.setAddEmployee();

    }

    @Then("User enters Employee Details")
    public void user_enters_Employee_Details()
    {
        logger.info("Entering employee details");
        pmPage.setFirstName("Surajith4");
        pmPage.setMiddleName("kiran4");
        pmPage.setLastName("sk4");
        pmPage.setEmployeeId("123454");
        pmPage.setCreateLoginDetails();
        pmPage.setUserName("surajithgowda4");
        pmPage.setEnabled();
        pmPage.setPassword("Surajith@123");
        pmPage.setConfirmPassword("Surajith@123");

    }

    @When("User Clicks on Save button")
    public void user_Clicks_on_Save_button() throws InterruptedException {
        logger.info("Clicking on Save button");
        pmPage.setSaveButton();
        Thread.sleep(5000);
    }

    /*@Then("User can view confirmation message {string} Employee")
    public void user_can_view_confirmation_message_Employee(String message) {

        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Success Successfully Saved"));


    }
*/
// Update Employee Details with existing Employee ID
    @Given("User enters Addition Details")
    public void user_enters_Addition_Details() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }






}

