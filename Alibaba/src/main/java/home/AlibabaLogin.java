package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlibabaLogin extends CommonAPI {

    @FindBy(how = How.CSS, using = ".sc-hd-ms-login")
    private static WebElement loginWebElement;

    @FindBy(how = How.CSS, using = "#fm-login-id")
    private static WebElement usernameInputWebElement;
    @FindBy(how = How.CSS, using = "#fm-login-password")
    private static WebElement passwordInputWebElement;
    @FindBy(how = How.CSS, using = "#fm-login-submit")
    private static WebElement submitCredentialsWebElement;

    public static WebElement getLoginWebElement() {
        return loginWebElement;
    }

    public static WebElement getUsernameInputWebElement() {
        return usernameInputWebElement;
    }

    public static WebElement getPasswordInputWebElement() {
        return passwordInputWebElement;
    }

    public static WebElement getSubmitCredentialsWebElement() {
        return submitCredentialsWebElement;
    }

    public void loginAlibaba(){
        getLoginWebElement().click();
        getUsernameInputWebElement().sendKeys("browserstackcid@gmail.com");
        getPasswordInputWebElement().sendKeys("abc123");
        getSubmitCredentialsWebElement().click();


    }
}
