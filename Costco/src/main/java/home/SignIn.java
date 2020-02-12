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
    WebElement forgetPasswordLink;
    @FindBy(xpath = "//input[@value='Send Password Reset Link']")
    WebElement sendPasswordResetLink;

    public void singnin(String email, String password) {
        signInRegisterLink.click();
        signInRegisterLink.click();
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
        signInBtn.click();
    }

    //    Methods
    public void signIn() {
//        singnin();
        String actualTitle = "Add Membership Number";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void signInWithInvalidEmail() {
        singnin("malikaamial", "masten_2013");
        String actualURL = "https://www.costco.com/LogonForm";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

    public void signInWithInvalidPassword() {
        singnin("malikaamiali82@gmail.com", "masten");
        String actualTitle = "Sign In";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    public void signInWithInvalidPasswordInvalidEmail() {
        singnin("malika", "masten");
        String actualTitle = "Sign In";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void restPaasWord() {
        signInRegisterLink.click();
        forgetPasswordLink.click();
        emailTextBox.sendKeys("malikaamiali82@gmail.com");
        sendPasswordResetLink.click();
        String actualTitle = "Password Reset Success";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
}