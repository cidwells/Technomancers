package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/a")
    private static WebElement loginWebElement;
    @FindBy(how = How.CSS, using = "#fm-login-id")
    private static WebElement usernameInputWebElement;
    @FindBy(how = How.CSS, using = "#fm-login-password")
    private static WebElement passwordInputWebElement;
    @FindBy(how = How.CSS, using = "#fm-login-submit")
    private static WebElement submitCredentialsWebElement;
    @FindBy(how = How.CSS, using = "a[title='My Alibaba']")
    private static WebElement myAlibabaWebElement;
    @FindBy(how = How.XPATH, using = "html/body/div[1]/div/div/div[1]/div/div[2]/a/div/i")
    private static WebElement messageCenterWebElement;  //span:contain('Message Center')
    @FindBy(how = How.XPATH, using = "./html/body/div[2]/div/div[1]/div/div/div[1]/div/i")
    private static WebElement messageFilterWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div/ul/li")
    private static WebElement unreadMessagesWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[4]/div[2]/button")
    private static WebElement gotItWebElement;

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

    public static WebElement getMyAlibabaWebElement() {
        return myAlibabaWebElement;
    }

    public static WebElement getMessageCenterWebElement() {
        return messageCenterWebElement;
    }

    public static WebElement getMessageFilterWebElement() {
        return messageFilterWebElement;
    }

    public static WebElement getUnreadMessagesWebElement() {
        return unreadMessagesWebElement;
    }

    public static WebElement getGotItWebElement() {
        return gotItWebElement;
    }

    public static void loginAlibaba(){
        getLoginWebElement().click();
        getUsernameInputWebElement().sendKeys("browserstackcid@gmail.com");
        getPasswordInputWebElement().sendKeys("abc123");
        getSubmitCredentialsWebElement().click();
    }
    public void clickMyAccountWebElement(){
        getMyAlibabaWebElement().click();
        CommonAPI.handleNewTab(driver);
    }
    public void clickMessageCenterWebElement(){
        getMessageCenterWebElement().click();
    }
    public void clickMessageFilterWebElement(){
        getMessageFilterWebElement().click();
    }
    public void clickUnreadMessagesWebElement(){
        getUnreadMessagesWebElement().click();
    }
    public void clickGotItWebElement(){
        getGotItWebElement().click();
    }
}
