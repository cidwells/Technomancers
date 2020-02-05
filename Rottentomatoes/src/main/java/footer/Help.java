package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Help extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[@id='footer-help']")
    WebElement help;

    public void clickHelp(){
        help.click();
    }
}
