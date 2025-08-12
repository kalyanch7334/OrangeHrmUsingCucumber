package pageObjects;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class LoginPage {

    WebDriver driver;
    //waitHelper helper
    private WebDriverWait wait;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 10);
    }

    //locate the elements

    @FindBy(xpath = ("//input[@placeholder='Username']"))
    @CacheLookup
    WebElement txt_userName;

    @FindBy(xpath = ("//input[@placeholder='Password']"))
    @CacheLookup
    WebElement txt_password;

    @FindBy(xpath = ("//button[normalize-space()='Login']"))
    @CacheLookup
    WebElement txt_login;

    @FindBy(xpath = ("//span[@class='oxd-userdropdown-tab']"))
    @CacheLookup
    WebElement txt_userDropdownTab;

   // @FindBy(xpath = ("//ul[@class='oxd-dropdown-menu']//li//a"))
   @FindBy(xpath = ("//a[normalize-space()='Logout']"))
    @CacheLookup
    WebElement txt_logout;

    //Action methods

    public void setUserName(String userName) {

        wait.until(ExpectedConditions.visibilityOf(txt_userName));
        txt_userName.clear();
        txt_userName.sendKeys(userName);

    }

    public void setPassword(String password) {
        //helper.setWaitForElement(txt_password,5);
        wait.until(ExpectedConditions.visibilityOf(txt_password));
        txt_password.clear();
        txt_password.sendKeys(password);

    }

    public void setLogin() {
        // helper.setWaitForElement(txt_login,5);
        wait.until(ExpectedConditions.visibilityOf(txt_login));
        txt_login.click();


    }

    public void setProfileLink() {
        wait.until(ExpectedConditions.visibilityOf(txt_userDropdownTab));
        txt_userDropdownTab.click();
        System.out.println("profile link clicked");


    }

    public void setLogout() {

        wait.until(ExpectedConditions.visibilityOf(txt_logout));
        txt_logout.click();

       /* for(WebElement element:txt_logout)
        {
            if(element.getText().equals("Logout"))
            {
                element.click();
                System.out.println("logout clicked");
                break;
            }
            if(element.getText().equals("About"))
            {
                element.click();
                System.out.println("About clicked");
                break;
            }
            if (element.getText().equals("Support"))
            {

                element.click();;
                break;
            }
            if(element.getText().equals("Chage Password"))
            {
                element.click();
                break;
            }
        }
*/

    }
}
