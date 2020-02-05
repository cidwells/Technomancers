package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TomatometerInfoPage extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[@id='header-whats-the-tomatometer']")
    WebElement goToTomatometerBtn;

   public void clickOnWhatIsTomatoMeter(){
       goToTomatometerBtn.click();
    }
}