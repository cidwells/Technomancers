package testSearch;

import org.openqa.selenium.WebElement;
import search.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestSearch extends Search {

    @Test (enabled = true)
    public void searchBarUsingArray() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.arraySearchBarTest();
    }
    @Test (enabled = true)
    public void searchEarBudWithFilter(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSpecificBluetoothSearch();
    }
    @Test
    public void searchPowerStripContactSeller(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSpecificPowerStripSearch();
    }
    @Test (enabled = true)
    public void searchUsingDb() throws Exception {
        Search search = PageFactory.initElements(driver,Search.class);
        search.dbSearchBarTest();
    }
    @Test (enabled = true)
    public void searchBarComputer() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchComputerText();
    }
    @Test
    public void searchBarCandy(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchCandyText();
    }
    @Test
    public void searchBarPaper(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchPaperText();
    }
    @Test
    public void searchBarChair(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchChairText();
    }
    @Test
    public void searchBarTeddyBear(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchTeddyBearText();
    }
    @Test
    public void searchBarCrayon(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchCrayonText();
    }
    @Test
    public void searchBarHdmi(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchHdmiText();
    }
    @Test
    public void searchBarJean(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchJeanText();
    }
    @Test (enabled = true)
    public void searchBarComputerBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchComputerText();
        navigateBack();
    }
    @Test
    public void searchBarCandyBack(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchCandyText();
        navigateBack();
    }
    @Test
    public void searchBarPaperBack(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchPaperText();
        navigateBack();
    }
    @Test
    public void searchBarChairBack(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchChairText();
        navigateBack();
    }
    @Test
    public void searchBarTeddyBearBack(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchTeddyBearText();
        navigateBack();
    }
    @Test
    public void searchBarCrayonBack(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchCrayonText();
        navigateBack();
    }
    @Test
    public void searchBarHdmiBack(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchHdmiText();
        navigateBack();
    }
    @Test
    public void searchBarJeanBack(){
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchJeanText();
        navigateBack();
    }
    @Test
    public void searchBarBean() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchBeanText();
    }
    @Test
    public void searchBarCan() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchCanText();
    }
    @Test
    public void searchBarClock() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchClockText();
    }
    @Test
    public void searchBarSprayBottle() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchSprayBottleText();
    }
    @Test
    public void searchBarTissue() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchTissueText();
    }
    @Test
    public void searchBarLightBulb() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchLightBulbText();
    }
    @Test
    public void searchBarSpeaker() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchSpeakerText();
    }
    @Test
    public void searchBarKnife() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchKnifeText();
    }
    @Test
    public void searchBarKeyRing() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchKeyRingText();
    }
    @Test
    public void searchBarSpoon() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchSpoonText();
    }
    @Test
    public void searchBarFork() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchForkText();
    }
    @Test
    public void searchBarBeanBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchBeanText();
        navigateBack();
    }
    @Test
    public void searchBarCanBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchCanText();
        navigateBack();
    }
    @Test
    public void searchBarClockBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchClockText();
        navigateBack();
    }
    @Test
    public void searchBarSprayBottleBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchSprayBottleText();
        navigateBack();
    }
    @Test
    public void searchBarTissueBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchTissueText();
        navigateBack();
    }
    @Test
    public void searchBarLightBulbBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchLightBulbText();
        navigateBack();
    }
    @Test
    public void searchBarSpeakerBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchSpeakerText();
        navigateBack();
    }
    @Test
    public void searchBarKnifeBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchKnifeText();
        navigateBack();
    }
    @Test
    public void searchBarKeyRingBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchKeyRingText();
        navigateBack();
    }
    @Test
    public void searchBarSpoonBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchSpoonText();
        navigateBack();
    }
    @Test
    public void searchBarForkBack() {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchForkText();
        navigateBack();
    }


}
