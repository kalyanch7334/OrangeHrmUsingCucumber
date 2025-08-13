package stepDefinitions;


import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import pageObjects.myInfoPage;

public class MyStepdefs {

    WebDriver driver;
    LoginPage loginPage;
    myInfoPage infoPage;


    @Given("User Launch Chrome browser")
    public void userLaunchChromeBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @When("User Opens URL {string}")
    public void userOpensURL(String url) {
        driver.get(url);
    }

    @And("User enters Email as {string} and Password as {string}")
    public void userEntersEmailAsAndPasswordAs(String uname, String password) {

        loginPage.setUserName(uname);
        loginPage.setPassword(password);
    }

    @And("Click on Login")
    public void clickOnLogin() {
        loginPage.setLogin();
    }

    @Then("Page Title should be {string}")
    public void pageTitleShouldBe(String title) {

        Assert.assertEquals(title, driver.getTitle());
    }

    @When("click on profile link")
    public void click_on_profile_link() throws InterruptedException {

        loginPage.setProfileLink();
        Thread.sleep(5000);


    }


    @When("User click on Log out link")
    public void userClickOnLogOutLink() {
        loginPage.setLogout();

    }

    @And("close browser")
    public void closeBrowser() {
        driver.close();
    }

//Update Personal Details in My Info Module

    @Then("User Clicks on my Info")
    public void user_Clicks_on_my_Info() {

        infoPage = new myInfoPage(driver);
        infoPage.clickMyInfo();
    }

    @Then("User Clicks on Personal Details link")
    public void user_Clicks_on_Personal_Details_link()
    {
        infoPage.setPersonalDetails();

    }


    @And("User enters Personal Details")
    public void user_enters_Personal_Details() {
        infoPage.setFirstName("Rajuty");
        infoPage.setMiddleName("kumar");
        infoPage.setLastName("k");

    }

    @When("User Clicks on Save")
    public void user_Clicks_on_Save() {

        infoPage.clickSaveButton();
    }

    @Then("User should see {string}")
    public void user_should_see(String message)
    {

        Assert.assertEquals(message, driver.getTitle());
        System.out.println("User is able to see the message: " + message);
    }




}

