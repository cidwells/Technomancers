package testSignUp;

import base.CommonAPI;
import home.SignUp;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignUp extends CommonAPI {

    SignUp signup;

    //PageFactory
    public void accessSignUp() {
        this.signup = PageFactory.initElements(driver, SignUp.class);
    }

    @Test
    public void testSignUp() {
        accessSignUp();
        signup.sinUp();
    }
    @Test
    public void testSignUpWithDifferentPassword() {
        accessSignUp();
        signup.sinUpWithDifferentPassword();
    }
    @Test
    public void testSignUpWithSameEmail() {
        accessSignUp();
        signup.sinUp();
        String actualTittle="https://www.costco.com/UserRegistrationAdd";
        String expectedTittle=driver.getCurrentUrl();
        Assert.assertEquals(actualTittle,expectedTittle);
    }
    @Test
    public void testLettersPassword()  {
        accessSignUp();
        signup.sinUpWithLettersPassowrd();
    }
    @Test
    public void testDigitPassword() {
        accessSignUp();
        signup.sinUpWithDigitPassword();
    }
    @Test
    public void testSpecialCharacterPassword() {
        accessSignUp();
        signup.sinUpWithSpecialCharacters();
    }

}




