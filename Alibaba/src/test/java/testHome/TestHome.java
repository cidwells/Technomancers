package testHome;

import home.Home;
import home.Login;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends Home {

    @Test(enabled = false)
    public void clickKitchen() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnKitchenWebElement();
    }
    @Test(enabled = false)
    public void clickTools(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnToolsHardwareWebElement();
    }
    @Test(enabled = false)
    public void clickRubber(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnRubberPlasticsWebElement();
    }
    @Test(enabled = false)
    public void clickElectric(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnElectricalEquipmentSuppliesWebElement();
    }
    @Test(enabled = false)
    public void clickVehicle(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnVehicleAccessoriesWebElement();
    }
    @Test(enabled = false)
    public void clickConsumer(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnConsumerElectronicsWebElement();
    }
    @Test(enabled = false)
    public void clickApparel(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnApparelWebElement();
    }
    @Test(enabled = false)
    public void clickReadyToShip(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickReadyToShipWebElement();
    }
    @Test(enabled = false)
    public void clickTradeShow(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickTradeShow();
    }
    @Test(enabled = true)
    public void scrollToQuotes(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.scrollToOneRequestMultipleQuotes();
    }

    @Test(enabled = false)
    public void loginOnHomePage(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
    }
}
