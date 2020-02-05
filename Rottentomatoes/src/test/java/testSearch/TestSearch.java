package testSearch;

import base.CommonAPI;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch  extends CommonAPI {

    @Test(priority = 1)
    public void rottenTomatoPage() throws InterruptedException {
        RottentomatoHome rtmHome = PageFactory.initElements(driver,RottentomatoHome.class);
        Thread.sleep(3000);

    }
}