package loginNsignup;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends CommonAPI {
    @FindBy (xpath = "//a[@id='global-user-trigger']")
    private static WebElement userButton;
    @FindBy (xpath = "//li[@class='user']//div[@class='global-user']//div[@class='global-user-container']//ul[@class='account-management']//li//a[contains(text(),'Log In')] ")
    private static WebElement logInButton;


}
