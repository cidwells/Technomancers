package testSearch;

import search.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch extends Search {

    @Test (enabled = true)
    public void searchBar() throws InterruptedException {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSearchText();
    }
    @Test (enabled = true)
    public void searchBarUsingArray() throws InterruptedException {
        Search search = PageFactory.initElements(driver, Search.class);
        search.arraySearchBarTest();
    }
    @Test (enabled = true)
    public void searchEarbudWithFilter() throws InterruptedException {
        Search search = PageFactory.initElements(driver, Search.class);
        search.runSpecificSearch();
    }

}
