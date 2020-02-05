package testSearch;

import home.CriticsBtn;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CriticsBtnTest extends RottentomatoHome {
    @Test
    public void goToCritics() throws InterruptedException {
        CriticsBtn crtsBtn = PageFactory.initElements(driver,CriticsBtn.class);
        crtsBtn.clickOnCritics();
        Thread.sleep(3000);
    }
}