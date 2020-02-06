package testSearch;

import home.RottentomatoHome;
import home.TomatometerInfoPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TomatometerPageTest extends RottentomatoHome {

    @Test
    public void goToTomatometerInfo(){
        TomatometerInfoPage tomatoMtr = PageFactory.initElements(driver,TomatometerInfoPage.class);
        tomatoMtr.clickOnWhatIsTomatoMeter();
    }
}