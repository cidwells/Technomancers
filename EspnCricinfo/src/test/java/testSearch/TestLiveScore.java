package testSearch;

import home.HomePage;
import home.LiveScore;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLiveScore extends LiveScore {
    @Test
    public void userCanCheckLiveScore() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver, LiveScore.class);
        ls.liveScore();
        Thread.sleep(3000);
    }
    @Test
    public void userHoverLiveScores(){
        LiveScore ls = PageFactory.initElements(driver,LiveScore.class);
        ls.houverOnLiveScore();
    }
    @Test
    public void userHoverLiveScoresAndClickOnHome() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver,LiveScore.class);
        ls.selectTopFromMouseHover();
        ls.userCanClickOnHome();
    }
    @Test
    public void validateHomePage() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver,LiveScore.class);
        ls.selectTopFromMouseHover();
        ls.userCanClickOnHome();
        ls.validateTitle();
        Assert.assertEquals("Live Cricket Scores","Live Cricket Scores");

    }

}
