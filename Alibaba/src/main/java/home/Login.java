package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div[1]/div/div[3]/a/div/i")
    private static WebElement buyingLeadsWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div[1]/div/div[4]/a/div")
    private static WebElement ordersWebElement;
    @FindBy(how = How.XPATH,using = "/html/body/div[1]/div/div/div[1]/div/div[4]/div/div[1]/div/div/div[1]/a/div/span")
    private static WebElement allOrdersWebElement;
    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div/div[1]/div/div[4]/div/div[1]/div/div/div[2]/a/div/span")
    private static WebElement reviewsWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div[1]/div/div[4]/div/div[1]/div/div/div[3]/a/div/span")
    private static WebElement refundsWebElement;
    @FindBy (how = How.XPATH, using = "/html/body/div[1]/div/div/div[1]/div/div[4]/div/div[1]/div/div/div[4]/a/div/span")
    private static WebElement myCouponWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[1]/div[3]/a")
    private static WebElement helpWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[1]/div[3]/div/div[2]/div[2]/ul/li[1]/a")
    private static WebElement buyerHelpCenter;

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

    public static WebElement getBuyingLeadsWebElement() {
        return buyingLeadsWebElement;
    }

    public static WebElement getOrdersWebElement() {
        return ordersWebElement;
    }

    public static WebElement getAllOrdersWebElement() {
        return allOrdersWebElement;
    }

    public static WebElement getReviewsWebElement() {
        return reviewsWebElement;
    }

    public static WebElement getRefundsWebElement() {
        return refundsWebElement;
    }

    public static WebElement getMyCouponWebElement() {
        return myCouponWebElement;
    }

    public static WebElement getHelpWebElement() {
        return helpWebElement;
    }

    public static WebElement getBuyerHelpCenter() {
        return buyerHelpCenter;
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
    public void clickBuyingLeadsWebElement(){
        getBuyingLeadsWebElement().click();
    }
    public void clickHelp(){
        getHelpWebElement().click();
    }
    public void clickOnAllOrders(){
        waitUntilVisible(ordersWebElement);
        hoverOnWebElement(ordersWebElement);
        waitUntilClickAble(allOrdersWebElement);
        hoverOnWebElement(allOrdersWebElement);
        getAllOrdersWebElement().click();
    }
    public void clickOnOrderReviews(){
        waitUntilVisible(ordersWebElement);
        hoverOnWebElement(ordersWebElement);
        waitUntilClickAble(reviewsWebElement);
        hoverOnWebElement(reviewsWebElement);
        getReviewsWebElement().click();
    }
    public void clickOnRefundsWebElement(){
        waitUntilVisible(ordersWebElement);
        hoverOnWebElement(ordersWebElement);
        waitUntilClickAble(reviewsWebElement);
        hoverOnWebElement(refundsWebElement);
        getRefundsWebElement().click();
    }
    public void clickOnMyCoupon(){
        waitUntilVisible(ordersWebElement);
        hoverOnWebElement(ordersWebElement);
        waitUntilClickAble(myCouponWebElement);
        hoverOnWebElement(myCouponWebElement);
        getMyCouponWebElement().click();
    }
    public void clickOnBuyerHelp(){
        waitUntilClickAble(helpWebElement);
        hoverOnWebElement(helpWebElement);
        clickHelp();
        waitUntilClickAble(buyerHelpCenter);
        getBuyerHelpCenter().click();
    }
}
