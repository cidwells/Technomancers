package db;

import base.CommonAPI;
import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlDatabase extends CommonAPI {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


    public static List<String> itemFromDb ()throws Exception, IOException, SQLException, ClassNotFoundException{
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
    public static List<String> getItemsFromKnickKnackTableDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("knickKnack", "item");
        return list;
    }
    public static void createKnickKnackTable(){
        ArrayList<String> knickKnackList = new ArrayList<String>();
        knickKnackList.add("keychain");
        knickKnackList.add("music box");
        ConnectToSqlDB.insertStringDataFromArrayListToSqlTableUsingArray(knickKnackList,"knickKnack","item");
    }
    public void dbSearchBarFromKnickKnackList () throws Exception {
        System.out.println(driver.getTitle());
        List<String> list = getItemsFromKnickKnackTableDB();
        for (int i = 0; i < list.size(); i++) {
            typeOnElement(".ui-searchbar-keyword", list.get(i));
            clickOnElement(".ui-searchbar-submit");
            clickOnElement(".ui-searchbar-keyword");
            clearField(".ui-searchbar-keyword");
        }
    }
}
