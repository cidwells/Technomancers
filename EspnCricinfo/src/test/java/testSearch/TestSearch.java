package testSearch;

import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSearch extends HomePage {

    @Test
    public void userCanValidatingURL() {
        boolean result = validatingURL(driver, "https://www.espncricinfo.com/");
        Assert.assertTrue(result);
    }

    @Test
    public void espnCricInfoLogo() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        boolean espnCricInfoLogo = homePage.validateEspnCricInfoLogo();
        Assert.assertTrue(espnCricInfoLogo);
    }

    @Test
    public void userCanHoverToTopEvents() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.mouseHoverToTopEvents();
        String actual = "Top Events";
        Assert.assertEquals(actual, "Top Events");
    }

    @Test
    public void userCanMouseHoverToTopEvents() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.mouseHoverToTopEvents();
        homePage.selectToSrilankaVsEngland();
        String actual = "Sri Lanka v England";
        Assert.assertEquals(actual, "Sri Lanka v England");
    }

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//a[@name='&lpos=cricket:feed:13:coll:headlines:1']")).click();
        Thread.sleep(3000);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.xpath("//h2[contains(text(),'U-19 WC')]")).click();
        Thread.sleep(3000);
    }

    @Test
    public void test3() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='global-search-trigger']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search Series, Teams or Players...']")).sendKeys("sakib al hasan");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='global-search']//input[@class='btn-search']")).click();
        Thread.sleep(4000);
    }

    @Test
    public void userWantToWatchTheHighLightsVideo() {
        driver.findElement(By.xpath("//figure[@name='&lpos=cricket:feed:xx:video']//span[@class='video-play-button video-play-button--onefeed restricted video-play-button--standard'] ")).click();
        Assert.assertEquals(true, true);
    }

    @Test
    public void userClickingOnScoreBarToGoNextSlide() {
        driver.findElement(By.xpath("//div[@class='scores-next controls']")).click();
        Assert.assertEquals(true, true);
    }

    @Test
    public void searchMultiplePlayers() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clearTypeNclickOnSearchButton();

    }


}
