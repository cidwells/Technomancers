package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CriticsBtn extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//a[@id='header-top-bar-critics']")
    WebElement goToCriticsBtn;

    public void clickOnCritics(){
        goToCriticsBtn.click();
    }
}