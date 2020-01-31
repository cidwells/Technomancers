package testSearch;

import base.CommonAPI;
import home.CostcoHome;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {

    CostcoHome costcoHome;

    public void accessCostcoHomePage() {
        this.costcoHome = PageFactory.initElements(driver, CostcoHome.class);
    }

    @Test
    public void testPrintUsList() throws InterruptedException {
        accessCostcoHomePage();
        costcoHome.printCountryList();
        Thread.sleep(2000);
    }
    @Test
    public void testCostcoLogo() {
        accessCostcoHomePage();
        costcoHome.costcoLogo();
        String actualURL="https://www.costco.com/";
        String extectedURL=driver.getCurrentUrl();
        Assert.assertEquals(actualURL,extectedURL);
    }

    @Test
    public void testMakeSearch() throws InterruptedException {
        accessCostcoHomePage();
        costcoHome.makeSearch("computers");
        Thread.sleep(8000);
        String actualURL = "https://www.costco.com/computers.html";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void testLocationsLink() throws InterruptedException {
        accessCostcoHomePage();
        costcoHome.clickLocations();
        String actualURL = "https://www.costco.com/warehouse-locations?langId=-1&storeId=10301&catalogId=10701";
        String expectedURL = driver.getCurrentUrl();
        Thread.sleep(8000);
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void testFindLocation() throws InterruptedException {
        accessCostcoHomePage();
        Thread.sleep(2000);
        costcoHome.findLocation();
        Thread.sleep(5000);
        Thread.sleep(10000);
    }

    @Test
    public void testWareHouseLocation() throws InterruptedException {
        accessCostcoHomePage();
        costcoHome.wareHouseLocations();
        Thread.sleep(6000);
    }

    @Test
    public void testMoueHoverOpticalLink() throws InterruptedException {
        accessCostcoHomePage();
        costcoHome.mouseHoverOpticallink();
        Thread.sleep(3000);
    }

    @Test
    public void testTravelLink() throws InterruptedException {
        accessCostcoHomePage();
        costcoHome.mouseHovertravelLink();
        Thread.sleep(5000);
    }
    @Test
    public void testSelectAllDrpDown() throws InterruptedException {
        accessCostcoHomePage();
        costcoHome.selectAllDropDown("cheese");
        String actualURL="https://www.costco.com/grocery-household.html?dept=Grocery&keyword=cheese";
        String expecteURL=costcoHome.getCurrentPageUrl();
        Thread.sleep(20000);
    }
}
