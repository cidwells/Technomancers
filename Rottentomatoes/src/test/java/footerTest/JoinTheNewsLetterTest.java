package footerTest;

import footer.JoinTheNewsletter;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JoinTheNewsLetterTest extends RottentomatoHome {

    @Test(priority = 1)
    public void clickOnJoinTheNewsletter() throws InterruptedException {
        JoinTheNewsletter joinNews = PageFactory.initElements(driver,JoinTheNewsletter.class);
        joinNews.clickJoinTheNewsletter();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void putFirstName() throws InterruptedException {
        JoinTheNewsletter joinNews = PageFactory.initElements(driver,JoinTheNewsletter.class);
        joinNews.clickJoinTheNewsletter();
        joinNews.typeFirstName();
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void putLastName() throws InterruptedException {
        JoinTheNewsletter joinNews = PageFactory.initElements(driver,JoinTheNewsletter.class);
        joinNews.clickJoinTheNewsletter();
        joinNews.typeFirstName();
        joinNews.typeLastName();
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void putEmail() throws InterruptedException {
        JoinTheNewsletter joinNews = PageFactory.initElements(driver, JoinTheNewsletter.class);
        joinNews.clickJoinTheNewsletter();
        joinNews.typeFirstName();
        joinNews.typeLastName();
        joinNews.typeEmail();
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void clickJoinBtn() throws InterruptedException {
        JoinTheNewsletter joinNews = PageFactory.initElements(driver, JoinTheNewsletter.class);
        joinNews.clickJoinTheNewsletter();
        joinNews.typeFirstName();
        joinNews.typeLastName();
        joinNews.typeEmail();
        joinNews.clickJoin();
        Thread.sleep(2000);
    }
}