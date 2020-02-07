package testTravel;

import base.CommonAPI;
import home.Travel;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTravel extends CommonAPI {

    Travel travel;
     public void acceesTavel(){
         this.travel= PageFactory.initElements(driver,Travel.class);
     }
     @Test
     public void testTravelLink(){
         acceesTavel();
         travel.travelLink();
     }

    @Test
    public void testTravelGetAllOptions(){
        acceesTavel();
        travel.travelGetAllOptions();
    }
    @Test
    public void testFindHotel() throws InterruptedException {
         acceesTavel();
         travel.findHotel();

    }
}
