package testSearch;

import home.Teams;
import org.apache.poi.hssf.record.SSTRecord;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTeams extends Teams {
    @Test
   public void userCanClickOnTeams(){
        Teams tm = PageFactory.initElements(driver,Teams.class);
        tm.userCanClickOnTeams();
        String expected = "Teams";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanMouseHouverOnTeams() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver,Teams.class);
        tm.mouseHouverOnTeams();
    }
    @Test
    public void userCanViewBangladeshTeam(){
        Teams tm = PageFactory.initElements(driver,Teams.class);
        tm.userCanClickOnTeams();
        tm.userCanViewBangladeshTeam();
        String expected = "Bangladesh";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanViewAstraliaTeam() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver, Teams.class);
        tm.mouseHouverOnTeams();
        tm.clickAustraliaTeam();
        String expected = "Australia";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanViewEnglandTeam() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver, Teams.class);
        tm.mouseHouverOnTeams();
        tm.clickOnEngland();
        String expected = "England";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanViewIrelandTeam() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver, Teams.class);
        tm.mouseHouverOnTeams();
        tm.clickOnIreland();
        String expected = "Ireland";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanViewPakistanTeam() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver, Teams.class);
        tm.mouseHouverOnTeams();
        tm.clickOnPakistan();
        String expected = "Pakistan";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanViewSrilankaTeam() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver, Teams.class);
        tm.mouseHouverOnTeams();
        tm.clickOnSrilanka();
        String expected = "Sri Lanka";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanViewIndiaTeam() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver, Teams.class);
        tm.mouseHouverOnTeams();
        tm.clickOnIndia();
        String expected = "India";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanViewNewZealandTeam() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver, Teams.class);
        tm.mouseHouverOnTeams();
        tm.clickOnNewZealand();
        String expected = "New Zealand";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanViewSouthAfricaTeam() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver, Teams.class);
        tm.mouseHouverOnTeams();
        tm.clickOnSouthAfrica();
        String expected = "South Africa";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userCanViewWestIndiesTeam() throws InterruptedException {
        Teams tm = PageFactory.initElements(driver, Teams.class);
        tm.mouseHouverOnTeams();
        tm.clickOnWestIndies();
        String expected = "West Indies";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }
}
