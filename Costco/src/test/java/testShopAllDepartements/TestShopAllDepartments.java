package testShopAllDepartements;

import base.CommonAPI;
import home.ShopAllDepartment;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestShopAllDepartments extends CommonAPI {


    ShopAllDepartment shopAllDepartment;

    public void accessShoAllDepartments(){
        this.shopAllDepartment= PageFactory.initElements(driver,ShopAllDepartment.class);
    }
    @Test
    public void testShoAllDepartments()  {
        accessShoAllDepartments();
        shopAllDepartment.shopAllDartementMouseHover();
    }
    @Test
    public void testAllDepartementsOptions(){
        accessShoAllDepartments();
        shopAllDepartment.shopAllDartementMouseHover();
        shopAllDepartment.getAllDepartmentOption();
    }
    @Test
    public void testPharmacyMouseHover() throws InterruptedException {
        accessShoAllDepartments();
        shopAllDepartment.pharmacyMouseHover();
        Thread.sleep(5000);
    }
    @Test
    public void testPharmacyOptions() throws InterruptedException {
        accessShoAllDepartments();
        shopAllDepartment.pharmacyMouseHover();
        shopAllDepartment.getPharmacyOptions();
        Thread.sleep(5000);
    }
    @Test
    public void testServicesMouseHover(){
        accessShoAllDepartments();
        shopAllDepartment.serviceMouseHover();
    }

}
