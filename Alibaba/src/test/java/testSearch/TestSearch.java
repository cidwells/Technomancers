package testSearch;

import search.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestSearch extends Search {

    @Test (enabled = false)
    public void searchBar() throws InterruptedException {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchText();
    }
    @Test (enabled = false)
    public void searchBarUsingArray() throws InterruptedException {
        Search search = PageFactory.initElements(driver, Search.class);
        search.arraySearchBarTest();
    }
    @Test (enabled = false)
    public void searchEarbudWithFilter() throws InterruptedException {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSpecificSearch();
    }
    @Test (enabled = true)
    public void searchUsingDb() throws Exception {
        Search search = PageFactory.initElements(driver,Search.class);
        search.dbSearchBarTest();
    }

}
