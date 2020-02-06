package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.security.Policy;

public class Home extends CommonAPI {

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

    @FindBy(how = How.CSS, using = "div.sc-hd-category:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > span:nth-child(2)")
    private static WebElement hoverOnCategories;

    @FindBy(how = How.CSS, using = "/html/body/div[1]/header/div[4]/div/div[1]/div/div/div/ul/li[5]/div[1]/a[1]")
    private static WebElement electronicsWebElement;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[4]/div/div[3]/ul/li[1]/a")
    private static WebElement readyToShipWebElement;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[4]/div/div[3]/ul/li[2]/a")
    private static WebElement tradeShowWebElement;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[3]/div[2]/div[1]/form/div[1]/label")
    private static WebElement oneRequestMultipleQuotes;

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

    public static WebElement getHoverOnCategories() {
        return hoverOnCategories;
    }

    public static WebElement getElectronicsWebElement() {
        return electronicsWebElement;
    }

    public static WebElement getReadyToShipWebElement() {
        return readyToShipWebElement;
    }

    public static WebElement getTradeShowWebElement() {
        return tradeShowWebElement;
    }

    public static WebElement getOneRequestMultipleQuotes() {
        return oneRequestMultipleQuotes;
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
        getApparelWebElement().click();
    }

    public void clickReadyToShipWebElement(){
        getReadyToShipWebElement().click();
    }

    public void clickTradeShow(){
        getTradeShowWebElement().click();
    }

    public void scrollToOneRequestMultipleQuotes(){
        scrollByVisibleElement(oneRequestMultipleQuotes);
    }
}
