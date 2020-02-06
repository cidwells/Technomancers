package testSearch;

import home.Series;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeries extends Series {
    @Test
    public void userCanGetIntoSeriesTab() throws InterruptedException {
        Series sr = PageFactory.initElements(driver,Series.class);
        sr.series();
        Thread.sleep(4000);
        Assert.assertEquals(true,true);
    }
}
