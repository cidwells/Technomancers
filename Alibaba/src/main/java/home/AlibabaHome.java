package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlibabaHome extends CommonAPI {

    @FindBy(how = How.CSS, using = "a[title='Home & Kitchen']")
    private static WebElement kitchenWebElement;

    @FindBy(how = How.CSS, using = "a[title='Tools & Hardware']")
    private static WebElement toolsHardwareWebElement;

    @FindBy(how = How.CSS, using = "a[title='Rubber & Plastics']")
    private static WebElement rubberPlasticsWebElement;

    @FindBy(how = How.CSS, using = "a[title='Electrical Equipment & Supplies']")
    private static WebElement electricalEquipmentSuppliesWebElement;

    @FindBy(how = How.CSS, using = "a[title='Vehicles & Accessories']")
    private static WebElement vehicleAccessoriesWebElement;

    @FindBy(how = How.CSS, using = "a[title='Consumer Electronics']")
    private static WebElement consumerElectronicsWebElement;

    @FindBy(how = How.CSS, using = "a[title='Apparel']")
    private static WebElement apparelWebElement;

    public static WebElement getKitchenWebElement(){
        return kitchenWebElement;
    }

    public static WebElement getToolsHardwareWebElement() {
        return toolsHardwareWebElement;
    }

    public static WebElement getRubberPlasticsWebElement() {
        return rubberPlasticsWebElement;
    }

    public static WebElement getElectricalEquipmentSuppliesWebElement() {
        return electricalEquipmentSuppliesWebElement;
    }

    public static WebElement getVehicleAccessoriesWebElement() {
        return vehicleAccessoriesWebElement;
    }

    public static WebElement getConsumerElectronicsWebElement() {
        return consumerElectronicsWebElement;
    }

    public static WebElement getApparelWebElement() {
        return apparelWebElement;
    }

    public void clickOnKitchenWebElement(){
        getKitchenWebElement().click();
    }

    public void clickOnToolsHardwareWebElement(){
        getToolsHardwareWebElement().click();
    }

    public void clickOnRubberPlasticsWebElement(){
        getRubberPlasticsWebElement().click();
    }

    public void clickOnElectricalEquipmentSuppliesWebElement(){
        getElectricalEquipmentSuppliesWebElement().click();
    }

    public void clickOnVehicleAccessoriesWebElement(){
        getVehicleAccessoriesWebElement().click();
    }

    public void clickOnConsumerElectronicsWebElement(){
        getConsumerElectronicsWebElement().click();
    }

    public void clickOnApparelWebElement(){
        getApparelWebElement();
    }

}
