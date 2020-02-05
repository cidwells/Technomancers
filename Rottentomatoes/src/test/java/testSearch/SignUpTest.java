package testSearch;

import home.RottentomatoHome;
import home.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignUpTest extends RottentomatoHome {

    @Test(priority = 1)
    public void goForSignUp() throws InterruptedException {
        SignUp signUp = PageFactory.initElements(driver,SignUp.class);
        signUp.signingUp();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void inputFirstName(){
        SignUp signUp = PageFactory.initElements(driver,SignUp.class);
        signUp.signingUp();
        signUp.enterFirstName();
    }
    @Test(priority = 3)
    public void inputLastName(){
        SignUp signUp = PageFactory.initElements(driver,SignUp.class);
        signUp.signingUp();
        signUp.enterFirstName();
        signUp.enterLastName();
    }
    @Test(priority = 4)
    public void inputEmail(){
        SignUp signUp = PageFactory.initElements(driver,SignUp.class);
        signUp.signingUp();
        signUp.enterFirstName();
        signUp.enterLastName();
        signUp.enterEmail();
    }
    @Test(priority = 5)
    public void inputPassword(){
        SignUp signUp = PageFactory.initElements(driver,SignUp.class);
        signUp.signingUp();
        signUp.enterFirstName();
        signUp.enterLastName();
        signUp.enterEmail();
        signUp.enterPassword();
    }
    @Test(priority = 6)
    public void clickOnCreateYourAccount() throws InterruptedException {
        SignUp signUp = PageFactory.initElements(driver,SignUp.class);
        signUp.signingUp();
        signUp.enterFirstName();
        signUp.enterLastName();
        signUp.enterEmail();
        signUp.enterPassword();
        signUp.createAccount();
    }
}
