package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PMPage
{
    public WebDriver driver;
    WebDriverWait wait;

    public PMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.wait= new WebDriverWait(driver, 10);
    }

    // locate elements on the PM page using @FindBy annotations
    @FindBy(xpath="//span[normalize-space()='PIM']")
    @CacheLookup
    WebElement txt_clickPM;

    @FindBy(xpath="//a[normalize-space()='Add Employee']")
    @CacheLookup
    WebElement txt_addEmployee;

    @FindBy(xpath="//input[@placeholder='First Name']")
    @CacheLookup
    WebElement txt_firstName;

    @FindBy(xpath="//input[@placeholder='Middle Name']")
    @CacheLookup
    WebElement txt_middleName;

    @FindBy(xpath="//input[@placeholder='Last Name']")
    @CacheLookup
    WebElement txt_lastName;

    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    @CacheLookup
    WebElement txt_employeeId;

    @FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    @CacheLookup
    WebElement txt_createLoginDetails;

    @FindBy(xpath="//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='orangehrm-employee-container']/div[@class='orangehrm-employee-form']/div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]")
    @CacheLookup
    WebElement txt_userName;

    @FindBy(xpath="//label[normalize-space()='Enabled']")
    @CacheLookup
    WebElement txt_enabled;

    @FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    @CacheLookup
    WebElement txt_password;

    @FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    @CacheLookup
    WebElement txt_confirmPassword;

    @FindBy(xpath="//button[normalize-space()='Save']")
    @CacheLookup
    WebElement txt_saveButton;

    //update the Employee details in existing employee

    @FindBy(xpath="//input[@fdprocessedid='tmwrpdr']")
    @CacheLookup
    WebElement txt_Driving_LicenseNumber;

    





    // Add methods to interact with elements on the PM page here

    public void setclickPM() {
        wait.until(ExpectedConditions.visibilityOf(txt_clickPM));
        txt_clickPM.click();
    }

    public void setAddEmployee() {
        wait.until(ExpectedConditions.visibilityOf(txt_addEmployee));
        txt_addEmployee.click();
    }

    public void setFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(txt_firstName));
        txt_firstName.clear();
        txt_firstName.sendKeys(firstName);
    }

    public void setMiddleName(String middleName) {
        wait.until(ExpectedConditions.visibilityOf(txt_middleName));
        txt_middleName.clear();
        txt_middleName.sendKeys(middleName);
    }

    public void setLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOf(txt_lastName));
        txt_lastName.clear();
        txt_lastName.sendKeys(lastName);
    }

    public void setEmployeeId(String employeeId) {
        wait.until(ExpectedConditions.visibilityOf(txt_employeeId));
        txt_employeeId.clear();
        txt_employeeId.sendKeys(employeeId);
    }
    public void setCreateLoginDetails()
    {
        wait.until(ExpectedConditions.visibilityOf(txt_createLoginDetails));
        txt_createLoginDetails.click();
    }

    public void setUserName(String userName) {
        wait.until(ExpectedConditions.visibilityOf(txt_userName));
        txt_userName.clear();
        txt_userName.sendKeys(userName);
    }

    public void setEnabled() {
        wait.until(ExpectedConditions.visibilityOf(txt_enabled));
        txt_enabled.click();

    }

    public void setPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(txt_password));
        txt_password.clear();
        txt_password.sendKeys(password);

    }

    public void setConfirmPassword(String confirmPassword) {
        wait.until(ExpectedConditions.visibilityOf(txt_confirmPassword));
        txt_confirmPassword.clear();
        txt_confirmPassword.sendKeys(confirmPassword);

    }

    public void setSaveButton() {
        wait.until(ExpectedConditions.elementToBeClickable(txt_saveButton));
        txt_saveButton.click();

    }


}
