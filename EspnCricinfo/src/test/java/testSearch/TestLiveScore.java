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
    public void userHoverLiveScores() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver,LiveScore.class);
        ls.selectMouseHover();
    }
    @Test
    public void userHoverLiveScoresAndClickOnHome() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver,LiveScore.class);
        ls.selectMouseHover();
        ls.userCanClickOnHome();
    }
    @Test
    public void validateHomePage() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver,LiveScore.class);
        ls.selectMouseHover();
        ls.userCanClickOnHome();
        ls.validateTitle("Live Cricket Scores");
        Assert.assertEquals("Live Cricket Scores","Live Cricket Scores");

    }
    @Test
    public void validateMonthView() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver,LiveScore.class);
        ls.selectMouseHover();
        ls.userCanClickOnMonthView();
        ls.validateTitle("Month view");
        Assert.assertEquals("Month view","Month view");
    }
    @Test
    public void validateWeekView() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver,LiveScore.class);
        ls.selectMouseHover();
        ls.userCanClickOnWeekView();
        ls.validateTitle("Week view");
        Assert.assertEquals("Week view","Week view");
    }
    @Test
    public void validateSeasonView() throws InterruptedException {
        LiveScore ls = PageFactory.initElements(driver, LiveScore.class);
        ls.selectMouseHover();
        ls.userCanClickOnSeasonView();
        ls.validateTitle("Season view");
        Assert.assertEquals("Season view", "Season view");
    }

}
