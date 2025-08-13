package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myInfoPage {

    public WebDriver driver;
    WebDriverWait wait;

    public myInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait= new WebDriverWait(driver, 10);

    }

    // Locate elements on the My Info page using @FindBy annotations
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    @CacheLookup
    WebElement txt_myInfo;

    @FindBy(xpath="//a[normalize-space()='Personal Details']")
    @CacheLookup
    WebElement txt_personalDetails;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    @CacheLookup
    WebElement txt_firstName;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    @CacheLookup
    WebElement txt_middeleName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    @CacheLookup
    WebElement txt_lastName;

    @FindBy(xpath="//button[@fdprocessedid='gdsxn']")
    @CacheLookup
    WebElement txt_saveButton;


    // ADD methods to interact with elements on the My Info page here
    public void clickMyInfo() {
        wait.until(ExpectedConditions.visibilityOf(txt_myInfo));
        txt_myInfo.click();
    }

    public void setPersonalDetails()
    {
        wait.until(ExpectedConditions.visibilityOf(txt_personalDetails));
        txt_personalDetails.click();
    }

    public void setFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(txt_firstName));
        txt_firstName.clear();
        txt_firstName.sendKeys(firstName);
    }
    public void setMiddleName(String middleName) {
        wait.until(ExpectedConditions.visibilityOf(txt_middeleName));
        txt_middeleName.clear();
        txt_middeleName.sendKeys(middleName);
    }

    public void setLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOf(txt_lastName));
        txt_lastName.clear();
        txt_lastName.sendKeys(lastName);
    }

    public void clickSaveButton() {
        wait.until(ExpectedConditions.elementToBeClickable(txt_saveButton));
        txt_saveButton.click();
    }

}
