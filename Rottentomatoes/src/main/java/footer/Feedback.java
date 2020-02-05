package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Feedback extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[@id='footer-feedback']")
    WebElement feedback;

    public void clickFeedback(){
        feedback.click();
    }
}