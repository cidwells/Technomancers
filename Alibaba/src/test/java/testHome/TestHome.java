package testHome;

import home.AlibabaHome;
import home.AlibabaLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends AlibabaHome {

    @Test(enabled = true)
    public void clickKitchen() {
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnKitchenWebElement();
    }
    @Test(enabled = true)
    public void clickTools(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnToolsHardwareWebElement();
    }
    @Test(enabled =true)
    public void clickRubber(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnRubberPlasticsWebElement();
    }
    @Test(enabled = true)
    public void clickElectric(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnElectricalEquipmentSuppliesWebElement();
    }
    @Test(enabled = true)
    public void clickVehicle(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnVehicleAccessoriesWebElement();
    }
    @Test(enabled = true)
    public void clickConsumer(){
        AlibabaHome  alibabaHome = PageFactory.initElements(driver, AlibabaHome.class);
        alibabaHome.clickOnConsumerElectronicsWebElement();
    }
    @Test(enabled = true)
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
