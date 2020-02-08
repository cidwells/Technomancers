package categories;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Categories extends CommonAPI {
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div[2]/div/div/div/ul/li[9]/a")
    private static WebElement allCategoriesWebElement;
    @FindBy(how = How.CSS, using = ".cg-main > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement agricultureWebElement;
    @FindBy(how = How.CSS, using = ".cg-main > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement foodNBeverageWebElement;
    @FindBy(how = How.CSS, using = ".cg-main > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement apparelInAllWebElement;
    @FindBy(how = How.CSS, using = ".cg-main > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement textileNLeatherProductInCatWebElement;
    @FindBy(how = How.CSS, using = ".cg-main > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement fashionNAccessoriesInCatWebElement;
    @FindBy(how = How.CSS, using = ".cg-main > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement timePieceJeweleryEyeWareInCatWebElement;
    @FindBy(how = How.CSS, using = ".cg-main > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement vehicleAccessoriesInCatWebElement;
    @FindBy(how = How.CSS, using = ".cg-main > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement luggageBagsNCasesInCatWebElement;
    @FindBy(how = How.CSS, using = ".cg-main > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement shoesNAccessoriesInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(5) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement consumerElectronicsInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(5) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement homeApplianceInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(5) > div:nth-child(2) > div:nth-child(3) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement securityNProtectionInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(6) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement electricalEquipmentNSuppliesInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(7) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement sportsNEntertainmentInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(7) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement giftsNCraftInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(7) > div:nth-child(2) > div:nth-child(3) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement toysNHobbiesInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(8) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement healthNMedicalInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(8) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement beautyNPersonalCareInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(9) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement ConstructionNRealEstateInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(9) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement homeNGardenInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(9) > div:nth-child(2) > div:nth-child(3) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement lightsNLightingInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(9) > div:nth-child(2) > div:nth-child(4) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement furnitureInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(10) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement machineryInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(10) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement fabricationServicesInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(10) > div:nth-child(2) > div:nth-child(3) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement toolsNHardwareInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(11) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement mineralsNMetallurgyInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(11) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement chemicalsInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(11) > div:nth-child(2) > div:nth-child(3) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement rubberNPlasticInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(11) > div:nth-child(2) > div:nth-child(4) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement energyInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(12) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement packagingNPrintingInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(12) > div:nth-child(2) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement officeNSuppliesInCatWebElement;
    @FindBy(how = How.CSS, using = "div.item:nth-child(12) > div:nth-child(2) > div:nth-child(3) > h4:nth-child(1) > a:nth-child(1)")
    private static WebElement serviceEquipmentInCatWebElement;

    public static WebElement getAllCategoriesWebElement() {
        return allCategoriesWebElement;
    }
    public static WebElement getAgricultureWebElement() {
        return agricultureWebElement;
    }
    public static WebElement getFoodNBeverageWebElement() {
        return foodNBeverageWebElement;
    }
    public static WebElement getApparelInAllWebElement() {
        return apparelInAllWebElement;
    }
    public static WebElement getTextileNLeatherProductInCatWebElement() {
        return textileNLeatherProductInCatWebElement;
    }
    public static WebElement getFashionNAccessoriesInCatWebElement() {
        return fashionNAccessoriesInCatWebElement;
    }
    public static WebElement getTimePieceJeweleryEyeWareInCatWebElement() {
        return timePieceJeweleryEyeWareInCatWebElement;
    }
    public static WebElement getVehicleAccessoriesInCatWebElement() {
        return vehicleAccessoriesInCatWebElement;
    }
    public static WebElement getLuggageBagsNCasesInCatWebElement() {
        return luggageBagsNCasesInCatWebElement;
    }
    public static WebElement getShoesNAccessoriesInCatWebElement() {
        return shoesNAccessoriesInCatWebElement;
    }
    public static WebElement getConsumerElectronicsInCatWebElement() {
        return consumerElectronicsInCatWebElement;
    }
    public static WebElement getHomeApplianceInCatWebElement() {
        return homeApplianceInCatWebElement;
    }
    public static WebElement getSecurityNProtectionInCatWebElement() {
        return securityNProtectionInCatWebElement;
    }
    public static WebElement getElectricalEquipmentNSuppliesInCatWebElement() {
        return electricalEquipmentNSuppliesInCatWebElement;
    }
    public static WebElement getSportsNEntertainmentInCatWebElement() {
        return sportsNEntertainmentInCatWebElement;
    }
    public static WebElement getGiftsNCraftInCatWebElement() {
        return giftsNCraftInCatWebElement;
    }
    public static WebElement getToysNHobbiesInCatWebElement() {
        return toysNHobbiesInCatWebElement;
    }
    public static WebElement getHealthNMedicalInCatWebElement() {
        return healthNMedicalInCatWebElement;
    }
    public static WebElement getBeautyNPersonalCareInCatWebElement() {
        return beautyNPersonalCareInCatWebElement;
    }
    public static WebElement getConstructionNRealEstateInCatWebElement() {
        return ConstructionNRealEstateInCatWebElement;
    }
    public static WebElement getHomeNGardenInCatWebElement() {
        return homeNGardenInCatWebElement;
    }
    public static WebElement getLightsNLightingInCatWebElement() {
        return lightsNLightingInCatWebElement;
    }
    public static WebElement getFurnitureInCatWebElement() {
        return furnitureInCatWebElement;
    }
    public static WebElement getMachineryInCatWebElement() {
        return machineryInCatWebElement;
    }
    public static WebElement getFabricationServicesInCatWebElement() {
        return fabricationServicesInCatWebElement;
    }
    public static WebElement getToolsNHardwareInCatWebElement() {
        return toolsNHardwareInCatWebElement;
    }
    public static WebElement getMineralsNMetallurgyInCatWebElement() {
        return mineralsNMetallurgyInCatWebElement;
    }
    public static WebElement getChemicalsInCatWebElement() {
        return chemicalsInCatWebElement;
    }
    public static WebElement getRubberNPlasticInCatWebElement() {
        return rubberNPlasticInCatWebElement;
    }
    public static WebElement getEnergyInCatWebElement() {
        return energyInCatWebElement;
    }
    public static WebElement getPackagingNPrintingInCatWebElement() {
        return packagingNPrintingInCatWebElement;
    }
    public static WebElement getOfficeNSuppliesInCatWebElement() {
        return officeNSuppliesInCatWebElement;
    }
    public static WebElement getServiceEquipmentInCatWebElement() {
        return serviceEquipmentInCatWebElement;
    }

    public void clickAllCategoriesSwitchTab() {
        getAllCategoriesWebElement().click();
        CommonAPI.handleNewTab(driver);
    }
    public void clickOnAgricultureWebElement(){
        getAgricultureWebElement().click();
    }
    public void clickOnFoodNBeverage(){
        getFoodNBeverageWebElement().click();
    }
    public void clickOnApparelInAllWebElement(){
        getApparelInAllWebElement().click();
    }
    public void clickOnTextileNLeatherProductInCatWebElement(){
        getTextileNLeatherProductInCatWebElement().click();
    }
    public void clickOnFashionNAccessoriesInCatWebElement(){
        getFashionNAccessoriesInCatWebElement().click();
    }
    public void clickOnTimePieceJeweleryEyeWareInCatWebElement(){
        getTimePieceJeweleryEyeWareInCatWebElement().click();
    }
    public void clickOnVehicleAccessoriesInCatWebElement(){
        getVehicleAccessoriesInCatWebElement().click();
    }
    public void clickOnLuggageBagsNCasesInCatWebElement(){
        getLuggageBagsNCasesInCatWebElement().click();
    }
    public void clickOnShoesNAccessoriesInCatWebElement(){
        getShoesNAccessoriesInCatWebElement().click();
    }
    public void clickOnConsumerElectronicsInCatWebElement(){
        getConsumerElectronicsInCatWebElement().click();
    }
    public void clickOnHomeApplianceInCatWebElement(){
        getHomeApplianceInCatWebElement().click();
    }
    public void clickOnSecurityNProtectionInCatWebElement(){
        getSecurityNProtectionInCatWebElement().click();
    }
    public void clickOnElectricalEquipmentNSuppliesInCatWebElement(){
        getElectricalEquipmentNSuppliesInCatWebElement().click();
    }
    public void  clickOnSportsNEntertainmentInCatWebElement(){
        getSportsNEntertainmentInCatWebElement().click();
    }
    public void clickOnGiftsNCraftInCatWebElement(){
        getGiftsNCraftInCatWebElement().click();
    }
    public void clickOnToysNHobbiesInCatWebElement(){
        getToysNHobbiesInCatWebElement().click();
    }
    public void clickOnHealthNMedicalInCatWebElement(){
        getHealthNMedicalInCatWebElement().click();
    }
    public void clickOnBeautyNPersonalCareInCatWebElement(){
        getBeautyNPersonalCareInCatWebElement().click();
    }
    public void clickOnConstructionNRealEstateInCatWebElement(){
        getConstructionNRealEstateInCatWebElement().click();
    }
    public void clickOnHomeNGardenInCatWebElement(){
        getHomeNGardenInCatWebElement().click();
    }
    public void clickOnLightsNLightingInCatWebElement(){
        getLightsNLightingInCatWebElement().click();
    }
    public void clickOnFurnitureInCatWebElement(){
        getFurnitureInCatWebElement().click();
    }
    public void clickOnMachineryInCatWebElement(){
        getMachineryInCatWebElement().click();
    }
    public void clickOnFabricationServicesInCatWebElement(){
        getFabricationServicesInCatWebElement().click();
    }
    public void clickOnToolsNHardwareInCatWebElement(){
        getToolsNHardwareInCatWebElement().click();
    }
    public void clickOnMineralsNMetallurgyInCatWebElement(){
        getMineralsNMetallurgyInCatWebElement().click();
    }
    public void clickOnChemicalsInCatWebElement(){
        getChemicalsInCatWebElement().click();
    }
    public void clickOnRubberNPlasticInCatWebElement(){
        getRubberNPlasticInCatWebElement().click();
    }
    public void clickOnEnergyInCatWebElement(){
        getEnergyInCatWebElement().click();
    }
    public void clickOnPackagingNPrintingInCatWebElement(){
        getPackagingNPrintingInCatWebElement().click();
    }
    public void clickOnOfficeNSuppliesInCatWebElement(){
        getOfficeNSuppliesInCatWebElement().click();
    }
    public void clickOnServiceEquipmentInCatWebElement(){
        getServiceEquipmentInCatWebElement().click();
    }
}
