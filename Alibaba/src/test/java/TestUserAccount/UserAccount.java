package TestUserAccount;

import home.Home;
import home.Login;
import home.Search;
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

    @Test
    public void goToBuyingLeads(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickBuyingLeadsWebElement();
    }

    @Test
    public void goToAllOrders()throws Exception{
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickOnAllOrders();
    }

    @Test
    public void goToOrderReviews(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickOnOrderReviews();
    }

    @Test
    public void goToRefunds(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
        clickMyAccountWebElement();
        clickOnRefundsWebElement();
    }
}
