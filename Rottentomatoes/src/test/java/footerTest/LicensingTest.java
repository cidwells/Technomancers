package footerTest;

import footer.Licensing;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LicensingTest extends RottentomatoHome {

    @Test
    public void clickOnLicensingBtn(){
        Licensing lcns = PageFactory.initElements(driver,Licensing.class);
        lcns.clickLicensing();
    }
}
