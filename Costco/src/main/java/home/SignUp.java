package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignUp extends CommonAPI {


    //WebElements
    @FindBy(id = "header_sign_in")
    WebElement signInRegisterLink;

    @FindBy(xpath = "//a[@class='btn costco-button tertiary']")
    WebElement createAccountBtn;

    @FindBy(css = "#register_email1")
    WebElement registrationEmailTextBox;

    @FindBy(css = "[id='logonPassword']")
    WebElement passwordTextBox;

    @FindBy(css = "[id='logonPasswordVerify']")
    WebElement passwordVerifyTextBox;

    @FindBy(css = "[class='primary']")
    WebElement createAccountbtn;


    //Methods
    public void sinUp() {
        signInRegisterLink.click();
        createAccountBtn.click();
        registrationEmailTextBox.sendKeys("");
        passwordTextBox.sendKeys("");
        passwordVerifyTextBox.sendKeys("");
        createAccountbtn.click();
        String actualTittle="Register Account";
        String expectedTittle=driver.getTitle();
        Assert.assertEquals(actualTittle,expectedTittle);
    }

    public void sinUpWithDifferentPassword() {
        signInRegisterLink.click();
        createAccountBtn.click();
        registrationEmailTextBox.sendKeys("");
        passwordTextBox.sendKeys("");
        passwordVerifyTextBox.sendKeys("");
        createAccountbtn.click();
        String actualTittle="https://www.costco.com/RegisterView?URL=&isPharmacy=false";
        String expectedTittle=driver.getCurrentUrl();
        Assert.assertEquals(actualTittle,expectedTittle);
    }

    public void sinUpWithLettersPassowrd() {
        signInRegisterLink.click();
        createAccountBtn.click();
        registrationEmailTextBox.sendKeys("################");
        passwordTextBox.sendKeys("###############");
        passwordVerifyTextBox.sendKeys("###########");
        createAccountbtn.click();
        String actualULR = "https://www.costco.com/UserRegistrationAdd";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualULR, expectedURL);
    }

    public void sinUpWithDigitPassword() {
        signInRegisterLink.click();
        createAccountBtn.click();
        registrationEmailTextBox.sendKeys("####################");
        passwordTextBox.sendKeys("122435234");
        passwordVerifyTextBox.sendKeys("122435234");
        createAccountbtn.click();
        String actualULR = "https://www.costco.com/RegisterView?URL=&isPharmacy=false";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualULR, expectedURL);
    }

    public void sinUpWithSpecialCharacters() {
        signInRegisterLink.click();
        createAccountBtn.click();
        registrationEmailTextBox.sendKeys("##################");
        passwordTextBox.sendKeys("122435<234");
        passwordVerifyTextBox.sendKeys("122435<234");
        createAccountbtn.click();
        String actualULR = "https://www.costco.com/RegisterView?URL=&isPharmacy=false";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualULR, expectedURL);
    }

}
