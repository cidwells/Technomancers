package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUp extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[@id='header-top-bar-signup']")
    WebElement clickOnSignUp;
    @FindBy(how = How.XPATH,using = "//input[@id='register_first_name']")
    WebElement typeFirstName;
    @FindBy(how = How.XPATH,using = "//input[@id='register_last_name']")
    WebElement typeLastName;
    @FindBy(how = How.XPATH,using = "//input[@id='register_email']")
    WebElement typeEmail;
    @FindBy(how = How.XPATH,using = "//input[@id='register_password']")
    WebElement givePassword;
    @FindBy(how = How.XPATH,using = "//div[@class='signup-form__body modal-body']//div[@class='text-center']")
    WebElement clickToCreateAccnt;


    public void signingUp(){
        clickOnSignUp.click();
    }
    public void enterFirstName(){
        typeFirstName.sendKeys("Mahnoor");
    }
    public void enterLastName(){
        typeLastName.sendKeys("Afsheen");
    }
    public void enterEmail(){
        typeEmail.sendKeys("rajib177@yahoo.com");
    }
    public void enterPassword(){
        givePassword.sendKeys("Simple177");
    }
    public void createAccount(){
        clickToCreateAccnt.click();
    }

}