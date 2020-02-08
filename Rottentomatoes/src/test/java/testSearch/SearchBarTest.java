package testSearch;

import home.RottentomatoHome;
import home.SearchBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchBarTest extends RottentomatoHome {


    @Test(priority = 1)
    public void searchDifferentMovies() throws InterruptedException {
        SearchBar sb = PageFactory.initElements(driver,SearchBar.class);
        sb.searchMovies("1917");
    }
    @Test(priority = 2)
    public void searchDifferentMovie() throws InterruptedException {
        SearchBar sb = PageFactory.initElements(driver,SearchBar.class);
        sb.searchMovies("DREAM ROUND");
    }
    @Test(priority = 3)
    public void searchForMovie() throws InterruptedException {
        SearchBar sb = PageFactory.initElements(driver,SearchBar.class);
        sb.searchMovies("COME TO DADDY");
    }
}