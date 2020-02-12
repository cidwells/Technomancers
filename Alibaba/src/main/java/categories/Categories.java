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
    @FindBy(how = How.XPATH, using = "//h4[@class='sub-title']//a[contains(text(),'Apparel')]")
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
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor2 anchor-apparel']")
    private static WebElement titleApparelWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor1 anchor-agricuture']")
    private static WebElement titleAgricultureWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor3 anchor-auto']")
    private static WebElement titleVehicleWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor4 anchor-bags']")
    private static WebElement titleBagsWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor5 anchor-electronics']")
    private static WebElement titleElectronicsWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor6 anchor-electrical']")
    private static WebElement titleElectricalEquipmentsWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor7 anchor-gifts']")
    private static WebElement titleGiftsWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor8 anchor-health']")
    private static WebElement titleHealthWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor9 anchor-home']")
    private static WebElement titleHomeWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor10 anchor-machinery']")
    private static WebElement titleMachineryWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor11 anchor-metallurgy']")
    private static WebElement titleMetallurgyWebElement;
    @FindBy(how = How.XPATH, using = "//h3[@class='big-title anchor12 anchor-packaging']")
    private static WebElement titlePackageWebElement;

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
    public void sClickOnAgricultureWebElement(){
        waitUntilVisible(titleAgricultureWebElement);
        scrollByElement(titleAgricultureWebElement);
        getAgricultureWebElement().click();
    }
    public void sClickOnFoodNBeverage(){
        waitUntilVisible(titleAgricultureWebElement);
        scrollByElement(titleAgricultureWebElement);
        getFoodNBeverageWebElement().click();
    }
    public void sClickOnApparelInAllWebElement(){
        waitUntilVisible(titleApparelWebElement);
        scrollByElement(titleApparelWebElement);
        getApparelInAllWebElement().click();

    }
    public void sClickOnTextileNLeatherProductInCatWebElement(){
        waitUntilVisible(titleApparelWebElement);
        scrollByElement(titleApparelWebElement);
        getTextileNLeatherProductInCatWebElement().click();
    }
    public void sClickOnFashionNAccessoriesInCatWebElement(){
         waitUntilVisible(titleApparelWebElement);
        scrollByElement(titleApparelWebElement);
        getFashionNAccessoriesInCatWebElement().click();
    }
    public void sClickOnTimePieceJeweleryEyeWareInCatWebElement(){
        waitUntilVisible(titleApparelWebElement);
        scrollByElement(titleApparelWebElement);
        getTimePieceJeweleryEyeWareInCatWebElement().click();
    }
    public void sClickOnVehicleAccessoriesInCatWebElement(){
        waitUntilVisible(titleVehicleWebElement);
        scrollByElement(titleVehicleWebElement);
        getVehicleAccessoriesInCatWebElement().click();
    }
    public void sClickOnLuggageBagsNCasesInCatWebElement(){
        waitUntilVisible(titleBagsWebElement);
        scrollByElement(titleBagsWebElement);
        getLuggageBagsNCasesInCatWebElement().click();
    }
    public void sClickOnShoesNAccessoriesInCatWebElement(){
        waitUntilVisible(titleBagsWebElement);
        scrollByElement(titleBagsWebElement);
        getShoesNAccessoriesInCatWebElement().click();
    }
    public void sClickOnConsumerElectronicsInCatWebElement(){
        waitUntilVisible(titleElectronicsWebElement);
        scrollByElement(titleElectronicsWebElement);
        getConsumerElectronicsInCatWebElement().click();
    }
    public void sClickOnHomeApplianceInCatWebElement(){
        waitUntilVisible(titleElectronicsWebElement);
        scrollByElement(titleElectronicsWebElement);
        getHomeApplianceInCatWebElement().click();
    }
    public void sClickOnSecurityNProtectionInCatWebElement(){
        waitUntilVisible(titleElectronicsWebElement);
        scrollByElement(titleElectronicsWebElement);
        getSecurityNProtectionInCatWebElement().click();
    }
    public void sClickOnElectricalEquipmentNSuppliesInCatWebElement(){
        waitUntilVisible(titleElectricalEquipmentsWebElement);
        scrollByElement(titleElectricalEquipmentsWebElement);
        getElectricalEquipmentNSuppliesInCatWebElement().click();
    }
    public void  sClickOnSportsNEntertainmentInCatWebElement(){
        waitUntilVisible(titleGiftsWebElement);
        scrollByElement(titleGiftsWebElement);
        getSportsNEntertainmentInCatWebElement().click();
    }
    public void sClickOnGiftsNCraftInCatWebElement(){
        waitUntilVisible(titleGiftsWebElement);
        scrollByElement(titleGiftsWebElement);
        getGiftsNCraftInCatWebElement().click();
    }
    public void sClickOnToysNHobbiesInCatWebElement(){
        waitUntilVisible(titleGiftsWebElement);
        scrollByElement(titleGiftsWebElement);
        getToysNHobbiesInCatWebElement().click();
    }
    public void sClickOnHealthNMedicalInCatWebElement(){
        waitUntilVisible(titleHealthWebElement);
        scrollByElement(titleHealthWebElement);
        getHealthNMedicalInCatWebElement().click();
    }
    public void sClickOnBeautyNPersonalCareInCatWebElement(){
        waitUntilVisible(titleHealthWebElement);
        scrollByElement(titleHealthWebElement);
        getBeautyNPersonalCareInCatWebElement().click();
    }
    public void sClickOnConstructionNRealEstateInCatWebElement(){
        waitUntilVisible(titleHomeWebElement);
        scrollByElement(titleHomeWebElement);
        getConstructionNRealEstateInCatWebElement().click();
    }
    public void sClickOnHomeNGardenInCatWebElement(){
        waitUntilVisible(titleHomeWebElement);
        scrollByElement(titleHomeWebElement);
        getHomeNGardenInCatWebElement().click();
    }
    public void sClickOnLightsNLightingInCatWebElement(){
        waitUntilVisible(titleHomeWebElement);
        scrollByElement(titleHomeWebElement);
        getLightsNLightingInCatWebElement().click();
    }
    public void sClickOnFurnitureInCatWebElement(){
        waitUntilVisible(titleHomeWebElement);
        scrollByElement(titleHomeWebElement);
        getFurnitureInCatWebElement().click();
    }
    public void sClickOnMachineryInCatWebElement(){
        waitUntilVisible(titleMachineryWebElement);
        scrollByElement(titleMachineryWebElement);
        getMachineryInCatWebElement().click();
    }
    public void sClickOnFabricationServicesInCatWebElement(){
        waitUntilVisible(titleMachineryWebElement);
        scrollByElement(titleMachineryWebElement);
        getFabricationServicesInCatWebElement().click();
    }
    public void sClickOnToolsNHardwareInCatWebElement(){
        waitUntilVisible(titleMachineryWebElement);
        scrollByElement(titleMachineryWebElement);
        getToolsNHardwareInCatWebElement().click();
    }
    public void sClickOnMineralsNMetallurgyInCatWebElement(){
        waitUntilVisible(titleMetallurgyWebElement);
        scrollByElement(titleMetallurgyWebElement);
        getMineralsNMetallurgyInCatWebElement().click();
    }
    public void sClickOnChemicalsInCatWebElement(){
        waitUntilVisible(titleMetallurgyWebElement);
        scrollByElement(titleMetallurgyWebElement);
        getChemicalsInCatWebElement().click();
    }
    public void sClickOnRubberNPlasticInCatWebElement(){
        waitUntilVisible(titleMetallurgyWebElement);
        scrollByElement(titleMetallurgyWebElement);
        getRubberNPlasticInCatWebElement().click();
    }
    public void sClickOnEnergyInCatWebElement(){
        waitUntilVisible(titleMetallurgyWebElement);
        scrollByElement(titleMetallurgyWebElement);
        getEnergyInCatWebElement().click();
    }
    public void sClickOnPackagingNPrintingInCatWebElement(){
        waitUntilVisible(titlePackageWebElement);
        scrollByElement(titlePackageWebElement);
        getPackagingNPrintingInCatWebElement().click();
    }
    public void sClickOnOfficeNSuppliesInCatWebElement(){
        waitUntilVisible(titlePackageWebElement);
        scrollByElement(titlePackageWebElement);
        getOfficeNSuppliesInCatWebElement().click();
    }
    public void sClickOnServiceEquipmentInCatWebElement(){
        waitUntilVisible(titlePackageWebElement);
        scrollByElement(titlePackageWebElement);
        getServiceEquipmentInCatWebElement().click();
    }
}
