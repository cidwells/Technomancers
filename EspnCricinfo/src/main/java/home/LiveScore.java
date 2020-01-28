package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LiveScore extends CommonAPI {
    @FindBy(xpath = "//span[@class='link-text'][contains(text(),'Live scores')]")
    WebElement liveScore;

    public void liveScore() {
        liveScore.click();
    }
}
