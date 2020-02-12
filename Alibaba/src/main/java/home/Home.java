package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import search.Search;

import java.security.Policy;
import java.util.List;

public class Home extends CommonAPI {

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div/div/div/ul/li[9]/ul/li[6]/a[1]")
    private static WebElement kitchenWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div[2]/div/div/div/ul/li[9]/ul/li[9]/a[2]")
    private static WebElement toolsHardwareWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div[2]/div/div/div/ul/li[9]/ul/li[13]/a[3]")
    private static WebElement rubberPlasticsWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div[2]/div/div/div/ul/li[9]/ul/li[9]/a[1]")
    private static WebElement electricalEquipmentSuppliesWebElement;
    @FindBy(how = How.XPATH, using = "//li[@class='menu-item util-ellipsis']//a[contains(text(),'Vehicles & Accessories')]")
    private static WebElement vehicleAccessoriesWebElement;
    @FindBy(how = How.XPATH, using = "//li[@class='menu-item util-ellipsis']//a[contains(text(),'Consumer Electronics')]")
    private static WebElement consumerElectronicsWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div[2]/div/div/div/ul/li[9]/ul/li[4]/a[1]")
    private static WebElement apparelWebElement;
    @FindBy(how = How.CSS, using = "/html/body/div[1]/header/div[4]/div/div[1]/div/div/div/ul/li[5]/div[1]/a[1]")
    private static WebElement electronicsWebElement;
    @FindBy(how = How.XPATH, using = "//div[@class='sc-hd-links-box']//a[contains(text(),'Ready to Ship')]")
    private static WebElement readyToShipWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[4]/div/div[3]/ul/li[2]/a")
    private static WebElement tradeShowWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[3]/div[2]/div[1]/form/div[1]/label")
    private static WebElement oneRequestMultipleQuotesWebElement;
    @FindBy(how = How.XPATH, using = "//a[@class='category-item vmore-link']")
    private static WebElement allCategoriesWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[3]/div[2]/div[1]/form/div[2]/input")
    private static WebElement whatAreYouLookingForQuotesTextFieldWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[3]/div[2]/div[1]/form/div[3]/input")
    private static WebElement whatAreYouLookingForQuotesQuantityTextFieldWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[3]/div[2]/div[1]/form/div[3]/div")
    private static WebElement quantityTypeWebElement;

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
        return oneRequestMultipleQuotesWebElement;
    }
    public static WebElement getAllCategoriesWebElement() {
        return allCategoriesWebElement;
    }
    public static WebElement getOneRequestMultipleQuotesWebElement() {
        return oneRequestMultipleQuotesWebElement;
    }
    public static WebElement getWhatAreYouLookingForQuotesTextFieldWebElement() {
        return whatAreYouLookingForQuotesTextFieldWebElement;
    }
    public static WebElement getWhatAreYouLookingForQuotesQuantityTextFieldWebElement() {
        return whatAreYouLookingForQuotesQuantityTextFieldWebElement;
    }
    public static WebElement getQuantityTypeWebElement() {
        return quantityTypeWebElement;
    }
    public void clickOnKitchenWebElement(){
        hoverOnWebElement(allCategoriesWebElement);
        waitUntilClickAble(kitchenWebElement);
        getKitchenWebElement().click();
        String actualTitle =  handleNewTab(driver).getTitle();
        Assert.assertTrue(true,actualTitle);
    }
    public void clickOnToolsHardwareWebElement(){
        hoverOnWebElement(allCategoriesWebElement);
        waitUntilClickAble(toolsHardwareWebElement);
        getToolsHardwareWebElement().click();
        String actualTitle = handleNewTab(driver).getTitle();
        Assert.assertTrue(true,actualTitle);
    }
    public void clickOnRubberPlasticsWebElement(){
        hoverOnWebElement(allCategoriesWebElement);
        waitUntilClickAble(rubberPlasticsWebElement);
        getRubberPlasticsWebElement().click();
    }
    public void clickOnElectricalEquipmentSuppliesWebElement(){
        waitUntilClickAble(allCategoriesWebElement);
        hoverOnWebElement(allCategoriesWebElement);
        waitUntilClickAble(electricalEquipmentSuppliesWebElement);
        getElectricalEquipmentSuppliesWebElement().click();
    }
    public void clickOnVehicleAccessoriesWebElement(){
        hoverOnWebElement(allCategoriesWebElement);
        getVehicleAccessoriesWebElement().click();
    }
    public void clickOnConsumerElectronicsWebElement(){
        hoverOnWebElement(allCategoriesWebElement);
        getConsumerElectronicsWebElement().click();
    }
    public void clickOnApparelWebElement(){
        hoverOnWebElement(allCategoriesWebElement);
        getApparelWebElement().click();
    }
    public void clickReadyToShipWebElement(){
      hoverOnWebElement(readyToShipWebElement);
        getReadyToShipWebElement().click();
    }
    public void clickTradeShow(){
        getTradeShowWebElement().click();
    }
    public void scrollToOneRequestMultipleQuotes(){
        scrollByVisibleElement(oneRequestMultipleQuotesWebElement);
        getWhatAreYouLookingForQuotesTextFieldWebElement().sendKeys("Pocket watches");
        getWhatAreYouLookingForQuotesQuantityTextFieldWebElement().sendKeys("15");
    }
}
