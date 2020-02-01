package testHome;

import home.AlibabaHome;
import home.AlibabaLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends AlibabaHome {

    @Test(enabled = false)
    public void clickKitchen() {
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnKitchenWebElement();
    }
    @Test(enabled = false)
    public void clickTools(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnToolsHardwareWebElement();
    }
    @Test(enabled =false)
    public void clickRubber(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnRubberPlasticsWebElement();
    }
    @Test(enabled = false)
    public void clickElectric(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnElectricalEquipmentSuppliesWebElement();
    }
    @Test(enabled = false)
    public void clickVehicle(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnVehicleAccessoriesWebElement();
    }
    @Test(enabled = false)
    public void clickConsumer(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnConsumerElectronicsWebElement();
    }
    @Test(enabled = false)
    public void clickApparel(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnApparelWebElement();
    }

    @Test(enabled = true)
    public void loginOnHomePage(){
        AlibabaLogin  alibabaLogin = PageFactory.initElements(driver, AlibabaLogin.class);
        alibabaLogin.loginAlibaba();

    }

}
