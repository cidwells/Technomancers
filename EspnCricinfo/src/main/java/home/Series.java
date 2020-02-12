package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Series extends CommonAPI {
    @FindBy (xpath = "//a[@name='&lpos=sitenavdefault+sports_sportsseries']//span//span[@class='link-text'][contains(text(),'Series')] ")
    public static WebElement series;
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
    @FindBy (xpath = "//section[contains(@class,'col-three')]//article[1]//header[1]")
    public static WebElement topRunScorers;
    @FindBy (css = "body.league.desktop.prod:nth-child(2) div.interior.secondary.espncricinfo:nth-child(7) div.main-content.layout-dbc.one-feed section.col-three article.sub-module.performers:nth-child(3) div.filters.form-group.button-group:nth-child(2) > a.button-filter-alt.med.active:nth-child(1)")
    private static WebElement odiButton;

    public static WebElement getOdiButton(){
        return odiButton;
    }
    public static WebElement getNewzealandVIndia(){
        return newzelandVIndia;
    }
    public static WebElement getPakistanVBangladesh(){
        return pakistanVBangladesh;
    }
    public static WebElement getWestIndiesVIreland(){
        return westIndiesVIreland;
    }
    public static WebElement getSouthAfricaVEngland(){
        return southAfricaVEngland;
    }
    public static WebElement getWorldCupLeague2(){
        return worldCupLeague2;
    }
    public static WebElement getWomenT20TriSeries(){
        return womenT20TriSeries;
    }
    public static WebElement getIccWomenChampionShip(){
        return iccWomenChampionShip;
    }
    public static WebElement getUnder19WorldCup(){
        return under19WorldCup;
    }
    public static WebElement getBbl2019(){
        return bbl2019;
    }
    public void clickNewzealandVIndia(){
        getNewzealandVIndia().click();
    }
    public void clickPakistanVBangladesh(){
        getPakistanVBangladesh().click();
    }
    public void clickWestIndiesVIreland(){
        getWestIndiesVIreland().click();
    }
    public void clickSouthAfricaVEngland(){
        getSouthAfricaVEngland().click();
    }
    public void clickWorldCupLeague2(){
        getWorldCupLeague2().click();
    }
    public void clickWomenT20TriSeries() {
        getWomenT20TriSeries().click();
    }
    public void clickIccWomenChampionShip(){
        getIccWomenChampionShip().click();
    }
    public void clickUnder19WorldCup(){
        getUnder19WorldCup().click();
    }
    public void clickBbl2019(){
        getBbl2019().click();
    }
    public void clickOdiButton(){
        getOdiButton().click();
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
    public void validateTitle(String getTitle){
        //Actual title
        driver.getTitle();
    }
    public void getListOfTextFromSeries(){
        List<WebElement> listOfSeries = driver.findElements(By.linkText("Series"));
        for (WebElement listOfText: listOfSeries) {
            String listOfTextFromSeries=listOfText.getText();
            System.out.println(listOfTextFromSeries);
        }
    }

}
