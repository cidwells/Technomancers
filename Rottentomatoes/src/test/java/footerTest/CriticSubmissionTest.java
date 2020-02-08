package footerTest;

import footer.CriticSubmission;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CriticSubmissionTest extends RottentomatoHome {

    @Test
    public void criticSubmissionBtn() throws InterruptedException {
        CriticSubmission crtcSbmTst = PageFactory.initElements(driver,CriticSubmission.class);
        crtcSbmTst.clickCriticSubmissionBtn();
        Thread.sleep(3000);
    }
}