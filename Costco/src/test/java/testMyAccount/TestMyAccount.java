package testMyAccount;

import base.CommonAPI;
import home.MyAccount;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMyAccount extends CommonAPI {


    MyAccount myaccount;

    public void accessMyAccountPage() {
        this.myaccount = PageFactory.initElements(driver, MyAccount.class);
    }

    @Test
    public void testMyAccountHover() {
        accessMyAccountPage();
        myaccount.myAccounHover();
    }

    @Test
    public void testEditMyEmail() {
        accessMyAccountPage();
        myaccount.editEmail();
    }

    @Test
    public void testEditPassword() {
        accessMyAccountPage();
        myaccount.editPassword();
    }

    @Test
    public void testPreferences() {
        accessMyAccountPage();
        ;
        myaccount.preferences();
    }

    @Test
    public void testCreateLists() {
        accessMyAccountPage();
        myaccount.lists();
    }

    @Test
    public void testCreateNewList() {
        accessMyAccountPage();
        myaccount.createNewList();
    }

    @Test
    public void testMyOrderHistory() {
        accessMyAccountPage();
        myaccount.myOrderHistory();
    }

    @Test
    public void testCostcoPay() {
        accessMyAccountPage();
        myaccount.costcoPay();
    }

    @Test
    public void testPayment() {
        accessMyAccountPage();
        myaccount.payment();
    }

    @Test
    public void testAdressBook() {
        accessMyAccountPage();
        myaccount.addressBook();
    }

    @Test
    public void testShipping() {
        accessMyAccountPage();
        myaccount.shipping();
    }

    @Test
    public void testBilling() {
        accessMyAccountPage();
        myaccount.billing();
    }

    @Test
    public void testNewAddres() throws InterruptedException {
        accessMyAccountPage();
        myaccount.newAdress();
        Thread.sleep(5000);
    }

    @Test
    public void testMemberShipRenewal() {
        accessMyAccountPage();
        myaccount.membershipRenewal();
    }

    @Test
    public void testJoinCostco() {
        accessMyAccountPage();
        myaccount.joinCostco();
    }

    @Test
    public void testAutoRenewal() {
        accessMyAccountPage();
        myaccount.autoRenewl();
    }

    @Test
    public void testFollowOnFaceBook() {
        accessMyAccountPage();
        myaccount.followOnFaceeBook();
    }

    @Test
    public void testFollowOnPinterest() {
        accessMyAccountPage();
        myaccount.followOnPinterest();
    }

    @Test
    public void testGetIntoComputer() {
        accessMyAccountPage();
        myaccount.getIntoComputer();
    }
    @Test
    public void testComputerOptions(){
        accessMyAccountPage();
        myaccount.computerOptions();
    }


}