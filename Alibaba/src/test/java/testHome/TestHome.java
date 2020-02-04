package testHome;

import home.Home;
import home.Login;
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
    @Test(enabled =true)
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
    public void loginOnHomePage(){
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginAlibaba();
    }

    @Test(enabled = true)
    public void hoverOnElement(){
        Home home = PageFactory.initElements(driver, Home.class);
        mouseHoverByCSS("div.sc-hd-category:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > span:nth-child(2)");
        hoverOnCategories();
    }


}
