package testWarHouse;

import base.CommonAPI;
import home.WarHouse;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestWarHouse extends CommonAPI {

    WarHouse  warhouse;
    public void accesWarHouse(){
        this.warhouse= PageFactory.initElements(driver,WarHouse.class);
    }
    @Test
    public void testFindWarHouseLocation() throws InterruptedException {
        accesWarHouse();
        warhouse.mouseHover();
        Thread.sleep(5000);
    }

}
