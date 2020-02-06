package footerTest;

import footer.Careers;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CareersTest extends RottentomatoHome {

    @Test
    public void clickOnCareersBtn() throws InterruptedException {
        Careers crs = PageFactory.initElements(driver,Careers.class);
        crs.clickCareers();
        Thread.sleep(3000);
    }
}
