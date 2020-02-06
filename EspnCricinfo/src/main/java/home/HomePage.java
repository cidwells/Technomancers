package home;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI{
    @FindBy(name = "&lpos=sitenavdefault&lid=sitenav_main-logo")
    private WebElement logo;
    @FindBy(xpath = "//*[@id=\"global-scoreboard\"]/div/div/div[1]/div[2]/button")
    private WebElement topEvents;
    @FindBy(xpath = "//a[contains(text(),'Sri Lanka v England')]")
    private WebElement slkVEng;
    @FindBy(xpath = "//a[contains(text(),'SA v ENG')]")
    private WebElement saVEng;
    @FindBy(css = "#global-search-trigger")
    private static WebElement searchButton;
    @FindBy(xpath = "//input[@placeholder='Search Series, Teams or Players...']")
    private static WebElement searchBar;

    public boolean validateEspnCricInfoLogo() {
        return logo.isDisplayed();
    }
    public static boolean validatingURL(WebDriver driver,String expURL) {
    boolean result = false;
    if (driver.getCurrentUrl().equalsIgnoreCase(expURL)){
       return result=true;
    }
        return true;
    }
    public void mouseHoverToTopEvents() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(topEvents).perform();
    }
    public void selectToSrilankaVsEngland(){
        slkVEng.click();
    }
    public static WebElement searchButton(){
       return searchButton;
    }
    public static WebElement searchBar(){
        return searchBar;
    }
    public static void clearSearchBar(){
        searchBar().clear();
    }
    public void clickOnSearchButton(){
        searchButton().click();
    }
    public void typePlayerList(String value){
        searchBar().sendKeys(value);
    }
    public void enterSearchBar(){
        searchBar.submit();
    }
    public List<String> playerList(){
        List<String> playerList = new ArrayList<>();
        playerList.add("Sakib al hasan");
        playerList.add("shahid afridi");
        playerList.add("mashrafi mortoza");
        return playerList;
    }
    public void clearTypeNclickOnSearchButton() throws InterruptedException {
        List<String> playerList = playerList();
        playerList.add("Sakib al hasan");
        playerList.add("shahid afridi");
        playerList.add("mashrafi mortoja");
        for(int i=0;i<playerList.size(); i++) {
//            clickOnSearchButton();
//            typePlayerList(list.get(i));
//            enterSearchBar();
//            clearSearchBar();
//            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@id='global-search-trigger']")).click();
            driver.findElement(By.xpath("//input[@placeholder='Search Series, Teams or Players...']")).sendKeys(playerList.get(i));
            driver.findElement(By.xpath("//input[@placeholder='Search Series, Teams or Players...']")).submit();
            driver.findElement(By.xpath("//input[@placeholder='Search Series, Teams or Players...']")).clear();

        }

    }

    }


