package testSignIn;

import base.CommonAPI;
import home.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends CommonAPI {

    SignIn singnin;

    public void accessSignIn() {
        this.singnin = PageFactory.initElements(driver, SignIn.class);
    }

    @Test
    public void testSignIn() {
        accessSignIn();
        singnin.signIn();
    }

    @Test
    public void testSignInWithInvalidEmail() {
        accessSignIn();
        singnin.signInWithInvalidEmail();
    }

    @Test
    public void testSignInWithInvalidPassword() {
        accessSignIn();
        singnin.signInWithInvalidPassword();
    }
    @Test
  public void testSingInWithInvalidData()  {
      accessSignIn();
      singnin.signInWithInvalidPasswordInvalidEmail();

    }
}
