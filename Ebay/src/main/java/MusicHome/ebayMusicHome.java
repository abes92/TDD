package MusicHome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static MusicHome.ebayMusicHomeWebElement.*;

public class ebayMusicHome extends WebAPI {
    // music home ;
    @FindBy(how = How.XPATH,using = WebElementNewYear) public WebElement NewYear;
    @FindBy(how = How.XPATH,using = WebElementShopMusicalInstrument) public WebElement instreament;
    @FindBy(how = How.XPATH,using = WebElementMusicCD) public WebElement musicCD;
    @FindBy(how = How.XPATH,using = WebElementRecordButton) public WebElement Record;
    @FindBy(how = How.XPATH,using = WebElementAllMusicMedia) public WebElement Media;
    @FindBy(how = How.XPATH,using = WebElementBrassButtom) public WebElement Brass;
    @FindBy(how = How.XPATH,using =  WebElementDrums) public WebElement Drums;
    @FindBy(how = How.XPATH,using = WebElementGuitars) public WebElement Guitars;
    @FindBy(how = How.XPATH,using = WebElementPianos) public WebElement Pianos;
    @FindBy(how = How.XPATH,using = WebElementStringInstrument) public WebElement Instrument;
    //music home method

    public void clickNewYear(){
driver.findElement(By.xpath(music)).click();
        NewYear.click();
    }
    public void shopMusicalInstreament(){
        driver.findElement(By.xpath(music)).click();
        instreament.click();
    }
    public void clickMusicCD(){
        driver.findElement(By.xpath(music)).click();
        musicCD.click();
    }
    public void RecordButton(){
        driver.findElement(By.xpath(music)).click();
        Record.click();
    }
    public void AllMusicMedia(){
        driver.findElement(By.xpath(music)).click();
        Media.click();
    }
    public void BrassButtom(){
        driver.findElement(By.xpath(music)).click();
        Brass.click();
    }
    public void clickDrums(){
        driver.findElement(By.xpath(music)).click();
        Drums.click();
    }
    public void clickGuitars(){
        driver.findElement(By.xpath(music)).click();
        Guitars.click();
    }
    public void clickPianos(){
        driver.findElement(By.xpath(music)).click();
        Pianos.click();
    }
    public void clickStringInstrument(){
        driver.findElement(By.xpath(music)).click();
        Instrument.click();
    }


}
