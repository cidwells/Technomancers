package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Series extends CommonAPI {
    @FindBy (xpath = "//a[@name='&lpos=sitenavdefault+sports_sportsseries']//span//span[@class='link-text'][contains(text(),'Series')] ")
    private static WebElement series;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul/li[1]/a/span/span[1]")
    private static WebElement newzelandVIndia;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul/li[3]/a/span/span[1]")
    private static WebElement pakistanVBangladesh;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul/li[5]/a/span/span[1]")
    private static WebElement westIndiesVIreland;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul/li[7]/a/span/span[1]")
    private static WebElement southAfricaVEngland;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul/li[9]/a/span/span[1]")
    private static WebElement worldCupLeague2;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul/li[11]/a/span/span[1]")
    private static WebElement womenT20TriSeries;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul/li[13]/a/span/span[1]")
    private static WebElement iccWomenChampionShip;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul/li[2]/a/span/span[1]")
    private static WebElement under19WorldCup;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[2]/div/ul/li[4]/a/span/span[1]")
    private static WebElement bbl2019;

    public static WebElement clickOnNewzelandVIndia(){
        return newzelandVIndia;
    }
    public static WebElement clickOnPakistanVBangladesh(){
        return pakistanVBangladesh;
    }
    public static WebElement clickWestIndiesVIreland(){
        return westIndiesVIreland;
    }
    public static WebElement clickSouthAfricaVEngland(){
        return southAfricaVEngland;
    }
    public static WebElement clickWorldCupLeague2(){
        return worldCupLeague2;
    }
    public void clickWomenT20TriSeries(){
        womenT20TriSeries.click();
    }
    public void clickIccWomenChampionShip(){
        iccWomenChampionShip.click();
    }
    public void clickUnder19WorldCup(){
        under19WorldCup.click();
    }
    public void clickBbl2019(){
        bbl2019.click();
    }

    public void selectMouseHover() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(4000);
        actions.moveToElement(series).perform();
        Thread.sleep(4000);
    }
    public void series(){
        series.click();
    }
    public void validateTitle(String expected){
        //Actual title
        driver.getTitle();
    }
}
