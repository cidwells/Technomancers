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
    @Test
    public void testFindCruise() throws InterruptedException {
         acceesTavel();
         travel.findCruise();
         Thread.sleep(5000);
    }
    @Test
    public void testFindCruiseLineOptions(){
        acceesTavel();
        travel.findCruiseLineOptions();
    }
    @Test
    public void testFindCruiseDestinationOptions(){
        acceesTavel();
        travel.findCruiseDepartureOptions();
    }
    @Test
    public void testFindCruiseDurationOptions(){
        acceesTavel();
        travel.findCruiseDurationOptions();
    }

    @Test
    public void testVacationPackage(){
         acceesTavel();
         travel.vacationPackage();
    }
    @Test
    public void testPackageDeestinationOptions(){
         acceesTavel();
         travel.packageDestinationOptions();
    }
    @Test
    public void testREntalCar(){
        acceesTavel();
        travel.rentalCar();
    }
     @Test
    public void TestTimeOptions(){
         acceesTavel();
         travel.rentalCarTime();
    }
    @Test
    public void testServices(){
         acceesTavel();
         travel.services();
    }
    @Test
    public void tesListServices(){
         acceesTavel();
         travel.listServices();
    }
    @Test
    public void testThemeParks(){
         acceesTavel();
         travel.themeParks();
    }
    @Test
    public void testHelpCenter(){
         acceesTavel();
         travel.helpCenter();
    }
    @Test
    public void testLionTravel(){
         acceesTavel();
         travel.lionWorldTravel();
    }
    @Test
    public void testGetTravelLink(){
         acceesTavel();
         travel.printTravelLinks();
    }
    @Test
    public void testTravelLogo(){
         acceesTavel();
         travel.travelLogo();
    }

}
