package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Teams extends CommonAPI {
    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sports_sportsteams']//span//span[@class='link-text'][contains(text(),'Teams')] ")
    private static WebElement teams;
    @FindBy (xpath = "//b[contains(text(),'Bangladesh')]")
    private WebElement bangladeshTeam;
    @FindBy(xpath = "/html/body/div[6]/section/section/div/section[2]/article[1]/div/div[2]/p[2]/a/b")
    private WebElement australiaTeam;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[3]/div/ul/li[5]/a/span/span[1]")
    private static WebElement england;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[3]/div/ul/li[7]/a/span/span[1]")
    private static WebElement ireland;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[3]/div/ul/li[9]/a/span/span[1]")
    private static WebElement pakistan;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[3]/div/ul/li[11]/a/span/span[1]")
    private static WebElement srilanka;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[3]/div/ul/li[6]/a")
    private static WebElement india;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[3]/div/ul/li[8]/a/span/span[1]")
    private static WebElement newzealand;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[3]/div/ul/li[10]/a/span/span[1]")
    private static WebElement southafrica;
    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[3]/div/ul/li[12]/a/span/span[1]")
    private static WebElement westIndies;

    public void userCanClickOnTeams(){
        teams.click();
    }
    public void mouseHouverOnTeams() throws InterruptedException {
      selectMouseHover(teams);
    }
    public void userCanViewBangladeshTeam(){
        bangladeshTeam.click();
    }
    public void clickAustraliaTeam(){
        australiaTeam.click();
    }
    public static WebElement getEngland(){
        return england;
    }
    public static WebElement getIreland(){
        return ireland;
    }
    public static WebElement getPakistan(){
        return pakistan;
    }
    public static WebElement getSrilanka(){
        return srilanka;
    }
    public static WebElement getIndia(){
        return india;
    }
    public static WebElement getNewzealand(){
        return newzealand;
    }
    public static WebElement getSouthafrica(){
        return southafrica;
    }
    public static WebElement getWestIndies(){
        return westIndies;
    }
    public void clickOnEngland(){
        getEngland().click();
    }
    public void clickOnIreland(){
        getIreland().click();
    }
    public void clickOnPakistan(){
        getPakistan().click();
    }
    public void clickOnSrilanka(){
        getSrilanka().click();
    }
    public void clickOnIndia(){
        getIndia().click();
    }
    public void clickOnNewZealand(){
        getNewzealand().click();
    }
    public void clickOnSouthAfrica(){
        getSouthafrica().click();
    }
    public void clickOnWestIndies(){
        getWestIndies().click();
    }

}
