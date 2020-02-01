package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveScore extends CommonAPI {
    @FindBy(xpath = "//span[@class='link-text'][contains(text(),'Live scores')]")
    private WebElement liveScore;
    @FindBy(xpath = ("/html/body/div[6]/div[2]/header/nav[1]/ul/li[1]/div/ul/li[1]/a/span/span[1]"))
    private WebElement home;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[1]/div/ul/li[2]/a/span/span[1]")
    private WebElement weekView;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[1]/div/ul/li[3]/a/span/span[1]")
    private WebElement monthView;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[1]/div/ul/li[4]/a/span/span[1]")
    private WebElement seasonView;

    public void newWindow(){
        PageFactory.initElements(driver,this);
        WebDriver driver1 = new ChromeDriver();
        driver1.getWindowHandle();
    }
    public void liveScore() {
    liveScore.click();
    }
    public void houverOnLiveScore(){
        mouseHoverByXpath("//span[@class='link-text'][contains(text(),'Live scores')]");
    }
    public void userCanClickOnWeekView(){
       weekView.click();
    }
    public void userCanClickOnMonthView(){
        monthView.click();
    }
    public void userCanClickOnSeasonView(){
        seasonView.click();
    }
    public void userCanClickOnHome() throws InterruptedException {
        home.click();
        Thread.sleep(4000);
    }
    public void validateTitle(){
        //Actual title
        String homeTitle=driver.getTitle();
        String expected = "Live Cricket Scores";

    }
    public void selectTopFromMouseHover() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(4000);
        actions.moveToElement(liveScore).perform();
        Thread.sleep(4000);

    }

}

