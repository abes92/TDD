package ebayDealshome;

import common.WebAPI;
import datadriven.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static ebayDealshome.ebayDealshomeWebElement.*;

public class EbayDealsHome extends WebAPI {

    @FindBy(how = How.XPATH, using ="//*[@id=\"gh-ac\"]") public WebElement searchBox;
    @FindBy(how = How.XPATH, using ="//*[@id=\"gh-logo\"]") public WebElement searchText;

    @FindBy(how = How.XPATH, using =WebElementFeatured_Xpath) public WebElement Featured;

    @FindBy(how = How.XPATH, using = webElementClickTech) public WebElement ClickTech;

    @FindBy(how = How.XPATH, using = WebElementClickFashion) public WebElement ClickFashion;

    @FindBy(how=How.XPATH,using=WebElementHomeAndGarden) public WebElement HomeAndGarden;

    @FindBy(how=How.XPATH,using=webElementSportingGoods) public WebElement SportingGoods;

    @FindBy(how=How.XPATH,using=WebElementAutomotive) public WebElement Automotive;

    @FindBy(how=How.XPATH,using=WebElementOtherDeals) public WebElement OtherDeals;

    @FindBy(how=How.XPATH,using=webElementSalesEvents) public WebElement SalesEvents;

   @FindBy(how = How.XPATH,using = WebElementEspresso) public WebElement espresso;
    @FindBy(how = How.XPATH,using = WebElementEspressoLink) public WebElement EspressoLink;

    @FindBy(how = How.XPATH,using = WebElementPumaLink) public WebElement PumaLink;

    @FindBy(how=How.XPATH,using = webElementPumaGlitter) public WebElement puma;
//
   @FindBy(how=How.CLASS_NAME,using = webElementMiniSmartSpeaker) public WebElement MiniSpeaker;
//
   @FindBy(how=How.XPATH,using = webElementAdidasFreedom) public WebElement AdidasFreedom;
//
    @FindBy(how=How.XPATH,using=webElementAdidasEssentials) public WebElement Adidas;
//
    @FindBy(how=How.XPATH,using = webElementHeadSet) public WebElement Headset;

//
//    @FindBy(how=How.XPATH,using = webElementSell) public WebElement Sell;
//
//    @FindBy(how=How.XPATH,using = WebElementHelpContact) public WebElement HelpContact;
//
//    @FindBy(how = How.XPATH,using = WebElementBrandOutLet) public WebElement BrandOutLet;
//
//    @FindBy(how = How.XPATH,using =  webElementDailyDeals) public WebElement DailyDeals;
//
//    @FindBy(how = How.XPATH,using = WebElementRegister) public WebElement Register;
//
//    @FindBy(how = How.XPATH,using = WebElementSignIn) public  WebElement SignIn;






    // Action Method
    public void ClickFeatured(){
        driver.findElement(By.xpath(Deals)).click();
        Featured.click();

    }

    // Validate Method
//    public void validateSearchText(){
//        String actualResult=searchText.getText();
//        String expectedResult="\"Hand Sanitizer\"";
//        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
//    }
    public void findClickTech(){
        driver.findElement(By.xpath(Deals)).click();
        ClickTech.click();

    }
    public void findClickFashion() {
        driver.findElement(By.xpath(Deals)).click();
        ClickFashion.click();
    }
    public void ClickHomeAndGarden(){
        driver.findElement(By.xpath(Deals)).click();
        HomeAndGarden.click();
    }
    public void SportingGoods(){
        driver.findElement(By.xpath(Deals)).click();
        SportingGoods.click();
    }
    public void Automotive(){
        driver.findElement(By.xpath(Deals)).click();
        Automotive.click();
    }
    public void OtherDeals(){
        driver.findElement(By.xpath(Deals)).click();
        OtherDeals.click();
    }
    public void SalesEvents(){
        driver.findElement(By.xpath(Deals)).click();
        SalesEvents.click();
    }

    public void ClickEspressoLink(){
        driver.findElement(By.xpath(Deals)).click();
        espresso.click();
    }
    // Validate Method
        public void validateEspresso(){
        String actualResult=EspressoLink.getText();
       String expectedResult="Nespresso Inissia Espresso Maker Machine and Coffee Capsules Pods Bundle";
       Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
    }

    public void ClickPumaLink(){
        driver.findElement(By.xpath(Deals)).click();
        PumaLink.click();
    }
    public void clickMiniSpeaker(){
        driver.findElement(By.xpath(Deals)).click();
        MiniSpeaker.click();
   }
    public void clickAdidasFreedomLink(){
        driver.findElement(By.xpath(Deals)).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        AdidasFreedom.click();
   }
   public void clickAdidasEssentials(){
       driver.findElement(By.xpath(Deals)).click();
       ((JavascriptExecutor)driver).executeScript("scroll(0,700)");
       Adidas.click();
    }
   public void ClickHeadset(){
       driver.findElement(By.xpath(Deals)).click();
       Headset.click();

    }
    public void searchBoxCheckUsingGetItemValue() throws InterruptedException {
        List<String> itemList = DataSource.getItemValue();
        for (String st : itemList) {
            searchBox.sendKeys(st);
            searchBox.submit();
            String expectedResult = "\"" + st + "\"";
            System.out.println("Expected Result : " + expectedResult);
            String actualResult = searchText.getText();
            System.out.println("Actual Result : " + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            sleepFor(3);
            searchBox.clear();
        }
//    public void ClickWatchList(){
//        WatchList.click();
//    }
//    public void ClickSell(){
//        Sell.click();
//    }
//    public void ClickHelpContact(){
//        HelpContact.click();
//    }
//    public void ClickBrandOutLet(){
//        BrandOutLet.click();
//    }
//    public void ClickDailyDeals(){
//        DailyDeals.click();
//    }
//    public void ClickRegister(){
//        Register.click();
//    }
//    public void ClickSignIn(){
//        SignIn.click();
//    }
//
    }
}


