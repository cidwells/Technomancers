package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CriticSubmission extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[@id='footer-critics']")
    WebElement clickcriticSubmission;

    public void clickCriticSubmissionBtn(){
        clickcriticSubmission.click();
    }
}