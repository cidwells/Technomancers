package testHome;

import base.CommonAPI;
import home.AlibabaHome;
import home.AlibabaSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends AlibabaHome {

    @Test
    public void clickKitchen() {
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnKitchenWebElement();
    }
    @Test
    public void clickTools(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnToolsHardwareWebElement();
    }
    @Test
    public void clickRubber(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnRubberPlasticsWebElement();
    }
    @Test
    public void clickElectric(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnElectricalEquipmentSuppliesWebElement();
    }
    @Test
    public void clickVehicle(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnVehicleAccessoriesWebElement();
    }
    @Test
    public void clickConsumer(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnConsumerElectronicsWebElement();
    }
    @Test
    public void clickApparel(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnApparelWebElement();
    }

}
