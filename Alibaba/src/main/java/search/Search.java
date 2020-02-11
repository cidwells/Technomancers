package search;

import base.CommonAPI;
import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    @FindBy(how = How.CSS, using = ".ui-searchbar-main")
    private static WebElement mainSearchBarWebElement;
   @FindBy(how = How.CSS, using = ".ui-searchbar-keyword")
    private static WebElement enterInSearchBarWebElement;
   @FindBy(how = How.CSS, using = ".ui-searchbar-submit")
    private static WebElement submitButtonWebElement;
   @FindBy(how = How.CSS, using = "div.cpv-refine-filter-item__wrapper:nth-child(3) > a:nth-child(1) > div:nth-child(2)")
    private static WebElement bluetoothFilterWebElement;
   @FindBy(how = How.LINK_TEXT, using = "i12 touch with pop up window")
    private static WebElement firstBluetoothItemWebElement;
   @FindBy(how = How.CSS, using = "div.sku-attr-val-item:nth-child(1) > div:nth-child(3) > div:nth-child(1) > input:nth-child(2)")
    private static WebElement firstQuantityInputWebElement;
   @FindBy(how = How.CSS, using = "button[class='action-button-std action-start-order']")
    private static WebElement addToCartButtonWebElement;
   @FindBy(how = How.CSS, using = "a.seb-refine-categories__item:nth-child(1)")
    private static WebElement ledStripFilterWebElement;
   @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[5]/div[1]/a[1]")
   private static WebElement contactSupplierWebElement;
   @FindBy(how = How.XPATH, using = "//textarea[@id='inquiry-content']")
   private static WebElement messageWebElement;
    @FindBy(how = How.XPATH, using = "//input[@name='email']")
    private static WebElement contactSupplierWithEmailWebElement;
   public static WebElement getMainSearchBar() {
        return mainSearchBarWebElement;
    }

    public static WebElement getEnterInSearchBarWebElement(){
        return enterInSearchBarWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public static WebElement getBluetoothFilterWebElement() {
        return bluetoothFilterWebElement;
    }

    public static WebElement getFirstBluetoothItemWebElement() {
        return firstBluetoothItemWebElement;
    }

    public static WebElement getFirstQuantityInputWebElement() {
        return firstQuantityInputWebElement;
    }

    public static WebElement getAddToCartButtonWebElement() {
        return addToCartButtonWebElement;
    }

    public static WebElement getLedStripFilterWebElement() {
        return ledStripFilterWebElement;
    }

    public static WebElement getContactSupplierWebElement() {
        return contactSupplierWebElement;
    }

    public static WebElement getMessageWebElement() {
        return messageWebElement;
    }

    public static WebElement getContactSupplierWithEmailWebElement() {
        return contactSupplierWithEmailWebElement;
    }

    public void runSearchComputerText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Computer");
        getSubmitButtonWebElement().click();
    }
    public void runSearchCandyText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Candy");
        getSubmitButtonWebElement().click();
    }
    public void runSearchPaperText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Paper");
        getSubmitButtonWebElement().click();
    }

    public void runSearchChairText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Chair");
        getSubmitButtonWebElement().click();
    }

    public void runSearchTeddyBearText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Teddy Bear");
        getSubmitButtonWebElement().click();
    }

    public void runSearchCrayonText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Crayon");
        getSubmitButtonWebElement().click();
    }

    public void runSearchHdmiText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Hdmi");
        getSubmitButtonWebElement().click();
    }

    public void runSearchJeanText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Jean");
        getSubmitButtonWebElement().click();
    }

    public void runSearchBeanText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Bean");
        getSubmitButtonWebElement().click();
    }
    public void runSearchCanText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("can");
        getSubmitButtonWebElement().click();
    }
    public void runSearchClockText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Clock");
        getSubmitButtonWebElement().click();
    }
    public void runSearchSprayBottleText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Spray bottle");
        getSubmitButtonWebElement().click();
    }
    public void runSearchTissueText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Tissue");
        getSubmitButtonWebElement().click();
    }
    public void runSearchLightBulbText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("LightBulb");
        getSubmitButtonWebElement().click();
    }
    public void runSearchSpeakerText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Speaker");
        getSubmitButtonWebElement().click();
    }
    public void runSearchKnifeText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Knife");
        getSubmitButtonWebElement().click();
    } public void runSearchKeyRingText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("keyring");
        getSubmitButtonWebElement().click();
    } public void runSearchSpoonText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Spoon");
        getSubmitButtonWebElement().click();
    } public void runSearchForkText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Fork");
        getSubmitButtonWebElement().click();
    }






    public void arraySearchBarTest () {
        System.out.println(driver.getTitle());
        List<String> list = getItems();
        for(int i=0; i<list.size(); i++){
            typeOnElement(".ui-searchbar-keyword",list.get(i));
            clickOnElement(".ui-searchbar-submit");
            clickOnElement(".ui-searchbar-keyword" );
            clearField(".ui-searchbar-keyword");
        }
   }

   public List<String> getItems(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("bike");
        itemsList.add("chain");
        return itemsList;
   }

    public void runSpecificBluetoothSearch(){
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("earbuds");
        getSubmitButtonWebElement().click();
        getBluetoothFilterWebElement().click();
        getFirstBluetoothItemWebElement().click();
        handleNewTab(driver);
        getFirstQuantityInputWebElement().clear();
        getFirstQuantityInputWebElement().sendKeys("5");
        getFirstQuantityInputWebElement().sendKeys(Keys.ENTER);
       getAddToCartButtonWebElement().click();
    }
    public void runSpecificPowerStripSearch(){
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("power strip");
        getSubmitButtonWebElement().click();
        waitUntilClickAble(ledStripFilterWebElement);
        getLedStripFilterWebElement().click();
        waitUntilClickAble(contactSupplierWebElement);
        getContactSupplierWebElement().click();
        handleNewTab(driver);
        getMessageWebElement().sendKeys("How soon can you ship");
        getContactSupplierWithEmailWebElement().sendKeys("browserstackcid@gmail.com");
   }
    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("search", "item");
        return list;
   }
    public void dbSearchBarTest () throws Exception {
        System.out.println(driver.getTitle());
        List<String> list = itemFromDb();
        for (int i = 0; i < list.size(); i++) {
            typeOnElement(".ui-searchbar-keyword", list.get(i));
            clickOnElement(".ui-searchbar-submit");
            clickOnElement(".ui-searchbar-keyword");
            clearField(".ui-searchbar-keyword");
        }
    }
    public static List<String> itemFromDb ()throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("search", "item");
        return list;
    }
    public void knickKnack(){
        ArrayList<String> knickKnackList = new ArrayList<String>();
        knickKnackList.add("keychain");
        knickKnackList.add("music box");
        // List<String> blist = knickKnackList;
        ConnectToSqlDB.insertStringDataFromArrayListToSqlTableUsingArray(knickKnackList,"knickKnack","item");
    }

    public static void main(String[] args) {
        ArrayList<String> knickKnackList = new ArrayList<String>();
        knickKnackList.add("keychain");
        knickKnackList.add("music box");

       // List<String> blist = knickKnackList;
        ConnectToSqlDB.insertStringDataFromArrayListToSqlTableUsingArray(knickKnackList,"knickKnack","item");
    }

}