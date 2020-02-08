package testMySqlDatabase;

import db.MySqlDatabase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMySqlDatabase extends MySqlDatabase {
    @Test
    public void searchUsingDB() throws Exception {
        MySqlDatabase mySqlDatabase = PageFactory.initElements(driver, MySqlDatabase.class);
        mySqlDatabase.dbSearchBarTest();
    }
    @Test
    public void searchUsingCreatedTable()throws Exception{
        MySqlDatabase mySqlDatabase = PageFactory.initElements(driver, MySqlDatabase.class);
        mySqlDatabase.dbSearchBarFromKnickKnackList();
    }
}
