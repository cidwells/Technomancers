package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Series extends CommonAPI {
    @FindBy (xpath = "//a[@name='&lpos=sitenavdefault+sports_sportsseries']//span//span[@class='link-text'][contains(text(),'Series')] ")
    private WebElement series;
    public void selectTopFromMouseHover() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(4000);
        actions.moveToElement(series).perform();
        Thread.sleep(4000);
    }
    public void series(){
        series.click();
    }
    public void validateTitle(){
        //Actual title
        String seriesTitle=driver.getTitle();
        String expected = "Series";

    }
}
