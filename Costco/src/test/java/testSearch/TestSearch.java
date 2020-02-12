package testSearch;

import base.CommonAPI;
import home.Search;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {

    Search searchPage;

    public void accessCostcoHomePage() {

        this.searchPage= PageFactory.initElements(driver, Search.class);
    }

    @Test
    public void testPrintUsList() throws InterruptedException {
        accessCostcoHomePage();
        searchPage.printCountryList();
        Thread.sleep(2000);
    }
    @Test
    public void testCostcoLogo() {
        accessCostcoHomePage();
        searchPage.costcoLogo();
    }

    @Test
    public void testMakeSearch(){
        accessCostcoHomePage();
        searchPage.makeSearch();
    }

    @Test
    public void testLocationsLink()  {
        accessCostcoHomePage();
        searchPage.clickLocations();
    }

    @Test
    public void testFindLocation() {
        accessCostcoHomePage();
        searchPage.findLocation();
    }

    @Test
    public void testWareHouseLocation() {
        accessCostcoHomePage();
        searchPage.wareHouseLocations();
    }

    @Test
    public void testMoueHoverOpticalLink()  {
        accessCostcoHomePage();
        searchPage.mouseHoverOpticallink();
    }

    @Test
    public void testTravelLink() {
        accessCostcoHomePage();
        searchPage.mouseHovertravelLink();
    }

    @Test
    public void testSelectAllDrpDown(){
        accessCostcoHomePage();
        searchPage.selectAllDropDown();
    }

    @Test
    public void testOpticalMousehover(){
        accessCostcoHomePage();
        searchPage.opticalMouseHover();
    }

    @Test
    public void testGetOpticalOption(){
        accessCostcoHomePage();
        searchPage.opticalMouseHover();
        searchPage.getOpticalOptions();
    }
    @Test
    public void testWarHouse(){
        accessCostcoHomePage();
        searchPage.warHouseSaving();
    }
    @Test
    public void testGetEmailOffers(){
        accessCostcoHomePage();
        searchPage.getEmailOffers();
    }
    @Test
    public void testMemeberShip(){
        accessCostcoHomePage();
        searchPage.memeberShip();
    }
    @Test
    public void testBarItem(){
        accessCostcoHomePage();
        searchPage.barItems();
    }
    @Test
    public void testCustomerService(){
        accessCostcoHomePage();
        searchPage.customerService();
    }
    @Test
    public void testChangeDEleiveryZipCode(){
        accessCostcoHomePage();
        searchPage.changeDEliveryZipCode();
    }
    @Test
    public void testFillNewPrescription(){
        accessCostcoHomePage();
        searchPage.fillNewPrescription();
    }
    @Test
    public void testPrescritionStatus(){
        accessCostcoHomePage();
        searchPage.prescriptionStatus();
    }
    @Test
    public void testTransferWarHouse(){
        accessCostcoHomePage();
        searchPage.transerWarhouse();
    }
    @Test
    public void testSearchMedication(){
        accessCostcoHomePage();
        searchPage.searchMedication();
    }
    @Test
    public void testSearchboxSize(){
     accessCostcoHomePage();
        searchPage.searchtextBoxSize();
    }
    @Test
    public void testorganic(){
        accessCostcoHomePage();
        searchPage.organic();
    }
    @Test
    public void testCandy(){
        accessCostcoHomePage();
         searchPage.snacks();
    }
    @Test
    public void testRightClick(){
        accessCostcoHomePage();
        searchPage.costcoLogoRightClick();
    }
}
