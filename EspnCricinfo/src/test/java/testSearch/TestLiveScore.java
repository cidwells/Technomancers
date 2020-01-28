package testSearch;

import home.HomePage;
import home.LiveScore;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLiveScore extends LiveScore {
    @Test
    public void userCanCheckLiveScore() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver, LiveScore.class);
        ls.liveScore();
        Thread.sleep(3000);
    }
}
