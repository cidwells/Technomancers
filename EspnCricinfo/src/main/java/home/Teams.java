package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Teams extends CommonAPI {
    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sports_sportsteams']//span//span[@class='link-text'][contains(text(),'Teams')] ")
    private WebElement teams;
    @FindBy (xpath = "//b[contains(text(),'Bangladesh')]")
    private WebElement bangladeshTeam;
    @FindBy(xpath = "/html/body/div[6]/section/section/div/section[2]/article[1]/div/div[2]/p[2]/a/b")
    private WebElement australiaTeam;

    public void selectTopFromMouseHover() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(4000);
        actions.moveToElement(teams).perform();
        Thread.sleep(4000);
    }
    public void userCanClickOnTeams(){
        teams.click();
    }
    public void userCanMouseHouverOnTeams(){
        mouseHoverByXpath("//a[@name='&lpos=sitenavdefault+sports_sportsteams']//span//span[@class='link-text'][contains(text(),'Teams')] ");
    }
    public void userCanViewBangladeshTeam(){
        bangladeshTeam.click();
    }
    public void clickAustraliaTeam(){
        australiaTeam.click();
    }
}
