package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Advertising extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[@id='footer-advertise']")
    WebElement advertising;

    public void clickAdvertising(){
        advertising.click();
    }
}
