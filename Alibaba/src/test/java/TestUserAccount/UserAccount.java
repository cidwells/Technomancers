package TestUserAccount;

import home.Home;
import home.Login;
import home.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UserAccount extends Login {
    @Test(enabled = true)
    public void login(){
       Login justLogin= PageFactory.initElements(driver,Login.class);
        loginAlibaba();
    }

     @Test(enabled = true)
    public void goToAccountPage() throws InterruptedException {
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickMessageCenterWebElement();
       Thread.sleep(8000);

    }
}
