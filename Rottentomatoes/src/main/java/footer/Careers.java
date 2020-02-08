package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Careers extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//footer[@id='foot']//div[@class='col-xs-4 subnav']//li[4]")
    WebElement careers;

    public void clickCareers(){
        careers.click();
    }
}
