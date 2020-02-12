package testPhoto;

import base.CommonAPI;
import home.Photo;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPhoto extends CommonAPI {
    Photo photo;
    public void  accessPhoto(){
        this.photo= PageFactory.initElements(driver,Photo.class);
    }
    @Test
    public void testPhoto(){
        accessPhoto();
        photo.photo();
    }
    @Test
    public void testMyPhoto(){
        accessPhoto();
        photo.photoUpload();
    }
    @Test
    public void testNavigationBar(){
        accessPhoto();
        photo.getNavigationBarOption();
    }
    @Test
    public void testDecor(){
        accessPhoto();
        photo.decor();
    }
    @Test
    public void testMetal(){
        accessPhoto();
        photo.photoPrice();
    }
    @Test
    public void testBackTocostco(){
        accessPhoto();
        photo.backToCostco();
    }
    @Test
    public void testContactUs(){
        accessPhoto();
        photo.contactUS();
    }
    @Test
    public void getHelp(){
        accessPhoto();
        photo.getHelp();
    }
    @Test
    public void testGetText(){
        accessPhoto();
        photo.getText();
    }
    @Test
    public void testPhotoGift(){
        accessPhoto();
        photo.photoGiftLink();
    }
    @Test
    public void testGiftHover(){
        accessPhoto();
        photo.giftHover();
    }
}
