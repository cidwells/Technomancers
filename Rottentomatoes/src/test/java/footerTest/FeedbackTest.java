package footerTest;

import footer.Feedback;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FeedbackTest extends RottentomatoHome {

    @Test
    public void clickFeedbackBtn() throws InterruptedException {
        Feedback fdback = PageFactory.initElements(driver,Feedback.class);
        fdback.clickFeedback();
    }
}