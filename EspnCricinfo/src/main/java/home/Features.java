package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Features extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[4]/a/span/span[1]")
    private WebElement features;

    public void selectTopFromMouseHover() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(4000);
        actions.moveToElement(features).perform();
        Thread.sleep(4000);
    }
    public void validateTitle(){
        //Actual title
        String featuresTitle=driver.getTitle();
        String expected = "Features";

    }
    public void clickFeatures(){
        features.click();
    }

}
