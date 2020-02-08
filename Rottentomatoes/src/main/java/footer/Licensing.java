package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Licensing extends CommonAPI {

    @FindBy (how = How.XPATH,using = "//a[@id='footer-licensing']")
    WebElement licensing;

    public void clickLicensing(){
        licensing.click();
    }
}
