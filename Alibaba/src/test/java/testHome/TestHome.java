package testHome;

import home.Home;
import login.Login;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends Home {

    @Test(enabled = true)
    public void clickKitchen() {
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnKitchenWebElement();
    }
    @Test(enabled = true)
    public void clickTools(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnToolsHardwareWebElement();
    }
    @Test(enabled = true)
    public void clickRubber(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnRubberPlasticsWebElement();
    }
    @Test(enabled = true)
    public void clickElectric(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnElectricalEquipmentSuppliesWebElement();
    }
    @Test(enabled = true)
    public void clickVehicle(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnVehicleAccessoriesWebElement();
    }
    @Test(enabled = true)
    public void clickConsumer(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnConsumerElectronicsWebElement();
    }
    @Test(enabled = true)
    public void clickApparel(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickOnApparelWebElement();
    }
    @Test(enabled = true)
    public void clickReadyToShip(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickReadyToShipWebElement();
    }
    @Test(enabled = true)
    public void clickTradeShow(){
        Home home = PageFactory.initElements(driver, Home.class);
        home.clickTradeShow();
    }
    @Test(enabled = true)
    public void scrollToQuotes()throws Exception{
        Home home = PageFactory.initElements(driver, Home.class);
        home.scrollToOneRequestMultipleQuotes();
        Thread.sleep(9000);
    }
    @Test(enabled = true)
    public void loginOnHomePage(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
    }
    //neg
//    @Test(enabled = true)
//    public void negClickKitchen() {
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.clickOnKitchenWebElement();
//    }
//    @Test(enabled = true)
//    public void negClickTools(){
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.clickOnToolsHardwareWebElement();
//    }
//    @Test(enabled = true)
//    public void negClickRubber(){
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.clickOnRubberPlasticsWebElement();
//    }
//    @Test(enabled = true)
//    public void negClickElectric(){
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.clickOnElectricalEquipmentSuppliesWebElement();
//    }
//    @Test(enabled = true)
//    public void negClickVehicle(){
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.clickOnVehicleAccessoriesWebElement();
//    }
//    @Test(enabled = true)
//    public void negClickConsumer(){
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.clickOnConsumerElectronicsWebElement();
//    }
//    @Test(enabled = true)
//    public void negClickApparel(){
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.clickOnApparelWebElement();
//    }
//    @Test(enabled = true)
//    public void negClickReadyToShip(){
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.clickReadyToShipWebElement();
//    }
//    @Test(enabled = true)
//    public void negClickTradeShow(){
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.clickTradeShow();
//    }
//    @Test(enabled = true)
//    public void negScrollToQuotes()throws Exception{
//        Home home = PageFactory.initElements(driver, Home.class);
//        home.scrollToOneRequestMultipleQuotes();
//        Thread.sleep(9000);
//    }
//    @Test(enabled = true)
//    public void negLoginOnHomePage(){
//        Login login = PageFactory.initElements(driver, Login.class);
//        login.loginAlibaba();
//    }

}
