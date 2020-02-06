package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AboutRottenTomatoes extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[@id='footer-about']")
    WebElement aboutRottenTomatoes;

    public void clickAboutRottenTomatoes(){
        aboutRottenTomatoes.click();
    }
}