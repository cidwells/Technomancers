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
    public void testPharmacyMouseHover() {
        accessShoAllDepartments();
        shopAllDepartment.pharmacyMouseHover();

    }
    @Test
    public void testPharmacyOptions()  {
        accessShoAllDepartments();
        shopAllDepartment.pharmacyMouseHover();
        shopAllDepartment.getPharmacyOptions();

    }
    @Test
    public void testServicesMouseHover(){
        accessShoAllDepartments();
        shopAllDepartment.serviceMouseHover();
    }
    @Test
    public void testRenewMemberShip(){
        accessShoAllDepartments();
        shopAllDepartment.renewMemberShip();
    }
    @Test
    public void testShoppingCart(){
        accessShoAllDepartments();
        shopAllDepartment.shoppingCart();
    }
    @Test
    public void testShoppingCartIcon(){
        accessShoAllDepartments();
        shopAllDepartment.shoppingCartIcon();
    }
    @Test
    public void testApplianceLink(){
        accessShoAllDepartments();
        shopAllDepartment.getIntoAppliance();
    }
    @Test
    public void testApplianceOptions(){
        accessShoAllDepartments();
        shopAllDepartment.getApplianceOptions();
    }
     @Test
    public void testskinCare(){
        accessShoAllDepartments();
        shopAllDepartment.beautyLink();
     }
}
