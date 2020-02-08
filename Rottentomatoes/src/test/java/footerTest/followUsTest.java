package footerTest;

import footer.FollowUs;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class followUsTest extends RottentomatoHome {

    @Test(priority = 1)
    public void userCanFollowOnFacebook() throws InterruptedException {
        FollowUs flwUs = PageFactory.initElements(driver,FollowUs.class);
        flwUs.followByFacebook();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void inputEmailOrPhone() throws InterruptedException {
        FollowUs flwUs = PageFactory.initElements(driver,FollowUs.class);
        flwUs.followByFacebook();
        flwUs.signIn("rajib177@yahoo.com", "simple177");
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void inputPassword() throws InterruptedException {
        FollowUs flwUs = PageFactory.initElements(driver,FollowUs.class);
        flwUs.followByFacebook();
        flwUs.signIn("rajib177@yahoo.com", "simple177");
    }
    @Test
    public void userCanMouseHoverMovieMenu() throws InterruptedException {
        FollowUs flw = PageFactory.initElements(driver,FollowUs.class);
        flw.mouseHoverOnMovieMenu();
        Thread.sleep(3000);
    }
}