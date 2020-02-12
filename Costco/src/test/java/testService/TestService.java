package testService;

import base.CommonAPI;
import home.Service;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestService extends CommonAPI {
    Service service;

    public void accessService() {
        this.service = PageFactory.initElements(driver, Service.class);
    }

    @Test
    public void testService() {
        accessService();
        service.seriveLink();
    }

    @Test
    public void testLife() {
        accessService();
        service.life();
    }

    @Test
    public void testPaymentProcessing() {
        accessService();
        service.paymentProcessing();
    }

}
