package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignIn extends CommonAPI {

    //    Webelements
    @FindBy(id = "header_sign_in")
    WebElement signInRegisterLink;

    @FindBy(css = "[id='logonId']")
    WebElement emailTextBox;

    @FindBy(css = "[id=logonPassword]")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@class='primary']")
    WebElement signInBtn;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    WebElement  forgetPasswordLink;
    @FindBy(xpath = "//input[@value='Send Password Reset Link']")
    WebElement       sendPasswordResetLink;

    //    Methods
    public void signIn() {
        signInRegisterLink.click();
        emailTextBox.sendKeys("malika");
        passwordTextBox.sendKeys("");
        signInBtn.click();
        String actualTitle = "Add Membership Number";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void signInWithInvalidEmail() {
        signInRegisterLink.click();
        emailTextBox.sendKeys("");
        passwordTextBox.sendKeys("");
        signInBtn.click();
        String actualURL = "https://www.costco.com/LogonForm";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

    public void signInWithInvalidPassword() {
        signInRegisterLink.click();
        emailTextBox.sendKeys("");
        passwordTextBox.sendKeys("");
        signInBtn.click();
        String actualTitle = "Sign In";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    public void signInWithInvalidPasswordInvalidEmail() {
        signInRegisterLink.click();
        emailTextBox.sendKeys("");
        passwordTextBox.sendKeys("");
        signInBtn.click();
        String actualTitle = "Sign In";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    public void restPaasWord(){
        signInRegisterLink.click();
        forgetPasswordLink.click();
        emailTextBox.sendKeys("malika.com");
        sendPasswordResetLink.click();
        String actualTitle = "Password Reset Success";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}