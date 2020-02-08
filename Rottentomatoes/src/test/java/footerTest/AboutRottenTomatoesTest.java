package footerTest;

import footer.AboutRottenTomatoes;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AboutRottenTomatoesTest extends RottentomatoHome {

    @Test
    public void clickAboutRottenTomatoesBtn() throws InterruptedException {
        AboutRottenTomatoes abtRtnTmts = PageFactory.initElements(driver,AboutRottenTomatoes.class);
        abtRtnTmts.clickAboutRottenTomatoes();
        Thread.sleep(2000);
    }
}