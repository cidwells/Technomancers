package footerTest;

import footer.Advertising;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AdvertisingTest extends RottentomatoHome {

    @Test
    public void clickOnAdvertisingBtn() throws InterruptedException {
        Advertising advrtsng = PageFactory.initElements(driver,Advertising.class);
        advrtsng.clickAdvertising();
        Thread.sleep(2000);
    }
}
