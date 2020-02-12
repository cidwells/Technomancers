package testDatasearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.DataSearch;

import java.io.IOException;
import java.sql.SQLException;

public class TestDataSearch extends CommonAPI {

    @Test
    public void search() throws Exception, IOException, SQLException, ClassNotFoundException {
        DataSearch dataSearch = PageFactory.initElements(driver, DataSearch.class);
        dataSearch.searchItemsAndSubmitButton();

    }
}