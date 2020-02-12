package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RottentomatoHome extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//div[@class='FullscreenSearch FullscreenSearch--desktop']")
    WebElement goToRottenTomatoPage;

    public void userGoToRottenTomatoPage(){
        goToRottenTomatoPage.click();
    }
}