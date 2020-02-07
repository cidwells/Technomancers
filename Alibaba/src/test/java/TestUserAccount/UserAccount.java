package TestUserAccount;

import login.Login;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UserAccount extends Login {
   @Test(enabled = true)
    public void login(){
       Login login= PageFactory.initElements(driver,Login.class);
        login.loginAlibaba();
    }

   @Test(enabled = true)
    public void goToAccountMessage() throws InterruptedException {
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickMessageCenterWebElement();
        clickGotItWebElement();
        clickMessageFilterWebElement();
        clickUnreadMessagesWebElement();
    }

    @Test(enabled = true)
    public void goToBuyingLeads(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickBuyingLeadsWebElement();
    }

    @Test(enabled = true)
    public void goToAllOrders()throws Exception{
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickOnAllOrders();
    }

    @Test(enabled = true)
    public void goToOrderReviews(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickOnOrderReviews();
    }

    @Test (enabled = true)
    public void goToRefunds(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickOnRefundsWebElement();
    }

    @Test(enabled = true)
    public void goToMyCoupon(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickOnMyCoupon();
    }

    @Test(enabled = true)
    public void goToHelpCenter(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickOnBuyerHelp();
    }
}
