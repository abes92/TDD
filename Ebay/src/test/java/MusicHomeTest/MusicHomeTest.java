package MusicHomeTest;

import MusicHome.ebayMusicHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MusicHomeTest extends WebAPI {
    ebayMusicHome musicHome;
   // RegistrationPage registrationPage;


    @BeforeMethod
    public void getInit() {
       musicHome = PageFactory.initElements(driver, ebayMusicHome.class);
        //registrationPage = PageFactory.initElements(driver,RegistrationPage.class);
    }
    @Test
    public void testClickNewYear(){
        musicHome.clickNewYear();

    }
    @Test
    public void testshopMusicalInstreament(){
        musicHome.shopMusicalInstreament();
    }
    @Test
    public void testClickMusicCD(){
        musicHome.clickMusicCD();
    }
    @Test
    public void testRecordButton(){
        musicHome.RecordButton();
    }
    @Test
    public void testAllMusicMedia(){
        musicHome.AllMusicMedia();
    }
    @Test
    public void testBrassButtom(){
       musicHome.BrassButtom();
    }
    @Test
    public void testClickDrums() {
        musicHome.clickDrums();
    }
    @Test
    public void testClickGuitars(){
        musicHome.clickGuitars();
    }
    @Test
    public void testClickPianos(){
        musicHome.clickPianos();
    }
    @Test
    public void testClickStringInstrument(){
        musicHome.clickStringInstrument();
    }


}
